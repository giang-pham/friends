package io.swagger.api;

import io.swagger.model.SendEmailRequest;
import io.swagger.model.SendEmailResponse;

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
public class PostApiController implements PostApi {

    public ResponseEntity<SendEmailResponse> postPost(@ApiParam(value = "subscribe update from an email to another" ,required=true ) @RequestBody SendEmailRequest body) {
        // do some magic!
        return new ResponseEntity<SendEmailResponse>(HttpStatus.OK);
    }

}
