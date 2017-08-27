package io.swagger.data.repository;

import io.swagger.data.Connection;
import io.swagger.data.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Giang on 27-Aug-17.
 */
public interface SubscriptionRepository extends JpaRepository<Subscription, String> {
}
