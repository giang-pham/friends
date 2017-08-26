package io.swagger.api;

import io.swagger.model.FriendConnectRequest;
import io.swagger.model.FriendConnectResponse;

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

@Api(value = "connect", description = "the connect API")
public interface ConnectApi {

    @ApiOperation(value = "", notes = "", response = FriendConnectResponse.class, tags={ "friend", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FriendConnectResponse.class),
        @ApiResponse(code = 405, message = "Invalid input", response = FriendConnectResponse.class) })
    @RequestMapping(value = "/connect",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<FriendConnectResponse> connectPost(@ApiParam(value = "connect 2 friends" ,required=true ) @RequestBody FriendConnectRequest body);

}
