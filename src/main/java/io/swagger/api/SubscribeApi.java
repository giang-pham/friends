package io.swagger.api;

import io.swagger.model.SubscribeRequest;
import io.swagger.model.SubscribeResponse;

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

@Api(value = "subscribe", description = "the subscribe API")
public interface SubscribeApi {

    @ApiOperation(value = "", notes = "", response = SubscribeResponse.class, tags={ "friend", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscribeResponse.class),
        @ApiResponse(code = 405, message = "Invalid input", response = SubscribeResponse.class) })
    @RequestMapping(value = "/subscribe",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<SubscribeResponse> subscribePost(@ApiParam(value = "subscribe update from an email to another" ,required=true ) @RequestBody SubscribeRequest body);

}
