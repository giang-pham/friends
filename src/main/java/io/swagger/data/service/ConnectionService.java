package io.swagger.data.service;

import io.swagger.data.Connection;
import io.swagger.data.repository.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Giang on 27-Aug-17.
 */
@Service
public class ConnectionService {

    @Autowired
    private ConnectionRepository connectionRepository;

    public List<String> getAllEmailConnection(String email) {
        return connectionRepository.findConnectionByEmail(email).stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    public Connection saveEmailConnection(String email1, String email2) {
        return connectionRepository.save(new Connection.Builder().user1(email1).user2(email2).build());
    }

    public List<String> getCommonEmailConnection(String email1, String email2) {
        final List<String> f1 = getAllEmailConnection(email1);
        final List<String> f2 = getAllEmailConnection(email1);

        return f1.stream().filter(f -> f2.contains(f)).collect(Collectors.toList());
    }
}
