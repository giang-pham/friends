package io.swagger.data.service;

import io.swagger.data.Connection;
import io.swagger.data.Subscription;
import io.swagger.data.repository.ConnectionRepository;
import io.swagger.data.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Giang on 27-Aug-17.
 */
@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription saveSubscription(String requester, String target) {
        return subscriptionRepository.save(new Subscription.Builder().requestor(requester).target(target).build());
    }

}
