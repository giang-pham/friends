package io.swagger.api;

import io.swagger.model.SendEmailRequest;
import io.swagger.model.SendEmailResponse;

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

@Api(value = "post", description = "the post API")
public interface PostApi {

    @ApiOperation(value = "", notes = "", response = SendEmailResponse.class, tags={ "friend", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SendEmailResponse.class),
        @ApiResponse(code = 405, message = "Invalid input", response = SendEmailResponse.class) })
    @RequestMapping(value = "/post",
        produces = { "application/json"},
        consumes = { "application/json"},
        method = RequestMethod.POST)
    ResponseEntity<SendEmailResponse> postPost(@ApiParam(value = "subscribe update from an email to another" ,required=true ) @RequestBody SendEmailRequest body);

}
