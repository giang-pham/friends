package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.data.Connection;
import io.swagger.data.repository.ConnectionRepository;
import io.swagger.data.service.ConnectionService;
import io.swagger.model.FriendConnectRequest;
import io.swagger.model.FriendConnectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

@Controller
public class ConnectApiController implements ConnectApi {
    @Autowired
    private ConnectionService connectionService;

    public ResponseEntity<FriendConnectResponse> connectPost(@ApiParam(value = "connect 2 friends" ,required=true ) @RequestBody FriendConnectRequest body) {
        // do some magic!
        String user1 = body.getFriends().get(0);
        String user2 = body.getFriends().get(1);
        connectionService.saveEmailConnection(user1, user2);
        return new ResponseEntity<FriendConnectResponse>(new FriendConnectResponse().success(true), HttpStatus.OK);
    }

}
