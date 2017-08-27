package io.swagger.data.repository;

import io.swagger.data.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Giang on 27-Aug-17.
 */
public interface BlockRepository extends JpaRepository<Block, String> {
    @Query("select a.requestor from Block a where a.target = :target")
    public List<String> findBlocksByEmail(@Param("target") String target);
}
