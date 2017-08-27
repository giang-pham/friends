package io.swagger.data.service;

import io.swagger.data.Block;
import io.swagger.data.Subscription;
import io.swagger.data.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Giang on 27-Aug-17.
 */
@Service
public class BlockService {

    @Autowired
    private BlockRepository blockRepository;

    public Block saveBlockRequest(String requester, String target) {
        return blockRepository.save(new Block.Builder().requestor(requester).target(target).build());
    }

}
