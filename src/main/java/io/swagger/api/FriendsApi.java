package io.swagger.api;

import io.swagger.model.FriendListRequest;
import io.swagger.model.FriendListResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

@Api(value = "friends", description = "the friends API")
public interface FriendsApi {

    @ApiOperation(value = "", notes = "", response = FriendListResponse.class, tags={ "friend", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FriendListResponse.class),
        @ApiResponse(code = 405, message = "Invalid input", response = FriendListResponse.class) })
    @RequestMapping(value = "/friends",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<FriendListResponse> friendsPost(@ApiParam(value = "list all friends connected to this email address" ,required=true ) @RequestBody FriendListRequest body);

}
