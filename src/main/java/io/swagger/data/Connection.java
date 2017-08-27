package io.swagger.data;

import javax.persistence.*;

/**
 * Created by Giang on 27-Aug-17.
 */
@Entity
@Table(name = "Connection")
public class Connection {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "user1", nullable = false)
    private String user1;

    @Column(name = "user2", nullable = false)
    private String user2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }
}
