package io.swagger.data.repository;

import io.swagger.data.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Giang on 27-Aug-17.
 */
public interface ConnectionRepository extends JpaRepository<Connection, String> {
}
