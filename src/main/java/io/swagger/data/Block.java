package io.swagger.data;

import javax.persistence.*;

/**
 * Created by Giang on 27-Aug-17.
 */
@Entity
@Table(name = "Block")
public class Block {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "requestor", nullable = false)
    private String requestor;

    @Column(name = "target", nullable = false)
    private String target;

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
}
