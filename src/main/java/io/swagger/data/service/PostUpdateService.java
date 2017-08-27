package io.swagger.data.service;

import io.swagger.data.Block;
import io.swagger.data.Connection;
import io.swagger.data.repository.BlockRepository;
import io.swagger.data.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Giang on 27-Aug-17.
 */
@Service
public class PostUpdateService {

    @Autowired
    private ConnectionService connectionService;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private BlockRepository blockRepository;

    public List<String> getRecipientList(String sender, String text) {
        List<String> friendConnections = connectionService.getAllEmailConnection(sender);
        List<String> subscribers = subscriptionRepository.findSubscribersByEmail(sender);
        List<String> mentions = getEmailFromText(text);
        friendConnections.addAll(subscribers);
        friendConnections.addAll(mentions);

        Set<String> combined = friendConnections.stream().collect(Collectors.toSet());

        List<String> blocks = blockRepository.findBlocksByEmail(sender);

        return combined.stream().filter(f -> !blocks.contains(f)).collect(Collectors.toList());
    }

    private List<String> getEmailFromText(String text) {
        List<String> result = new LinkedList<>();
        Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(text);
        while (m.find()) {
            result.add(m.group());
        }

        return result;
    }

}
