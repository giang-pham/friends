package io.swagger.api;

import io.swagger.data.repository.ConnectionRepository;
import io.swagger.model.FriendListRequest;
import io.swagger.model.FriendListResponse;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

@Controller
public class FriendsApiController implements FriendsApi {

    @Autowired
    private ConnectionRepository connectionRepository;

    public ResponseEntity<FriendListResponse> friendsPost(@ApiParam(value = "list all friends connected to this email address" ,required=true ) @RequestBody FriendListRequest body) {
        String email = body.getEmail();
        List<String> friends = connectionRepository.findConnectionByEmail(email);
        friends = friends.stream().filter(Objects::nonNull).collect(Collectors.toList());

        return new ResponseEntity<>(new FriendListResponse().friends(friends).count(friends.size()).success(true), HttpStatus.OK);
    }

}
