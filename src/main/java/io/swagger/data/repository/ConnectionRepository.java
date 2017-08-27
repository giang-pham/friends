package io.swagger.data.repository;

import io.swagger.data.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Giang on 27-Aug-17.
 */
public interface ConnectionRepository extends JpaRepository<Connection, String> {

    @Query("select case when a.user1 = :email then a.user2 when a.user2 = :email then a.user1 else null end from Connection a")
    public List<String> findConnectionByEmail(@Param("email") String email);
}
