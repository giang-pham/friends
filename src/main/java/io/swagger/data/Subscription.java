package io.swagger.data;

import javax.persistence.*;

/**
 * Created by Giang on 27-Aug-17.
 */
@Entity
@Table(name = "Subscription")
public class Subscription {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "requestor", nullable = false)
    private String requestor;

    @Column(name = "target", nullable = false)
    private String target;

    private Subscription(Builder builder) {
        setRequestor(builder.requestor);
        setTarget(builder.target);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


    public static final class Builder {
        private String requestor;
        private String target;

        public Builder() {
        }

        public Builder requestor(String val) {
            requestor = val;
            return this;
        }

        public Builder target(String val) {
            target = val;
            return this;
        }

        public Subscription build() {
            return new Subscription(this);
        }
    }
}
