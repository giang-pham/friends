package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.data.service.BlockService;
import io.swagger.model.SubscribeRequest;
import io.swagger.model.SubscribeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T03:28:13.112Z")

@Controller
public class BlockApiController implements BlockApi {

    @Autowired
    private BlockService blockService;

    public ResponseEntity<SubscribeResponse> blockPost(@ApiParam(value = "subscribe update from an email to another" ,required=true ) @RequestBody SubscribeRequest body) {
        blockService.saveBlockRequest(body.getRequestor(), body.getTarget());
        return new ResponseEntity<SubscribeResponse>(new SubscribeResponse().success(true), HttpStatus.OK);
    }

}
