package io.swagger.api;

import io.swagger.model.FriendListRequest;
import io.swagger.model.FriendListResponse;

import io.swagger.annotations.*;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

@Controller
public class FriendsApiController implements FriendsApi {

    public ResponseEntity<FriendListResponse> friendsPost(@ApiParam(value = "list all friends connected to this email address" ,required=true ) @RequestBody FriendListRequest body) {
        // do some magic!
        return new ResponseEntity<FriendListResponse>(HttpStatus.OK);
    }

}
