package com.kakao.pay.leekt.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("money")
public class Money {

    private int id;
    private String room;
    private String token;
    private int sprinkle;
    private Date sprinkleTime;
    private String sprinkleId;
    private int received;
    private Date receivedTime;
    private String receivedId;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getSprinkle() {
        return sprinkle;
    }

    public void setSprinkle(int sprinkle) {
        this.sprinkle = sprinkle;
    }

    public Date getSprinkleTime() {
        return sprinkleTime;
    }

    public void setSprinkleTime(Date sprinkleTime) {
        this.sprinkleTime = sprinkleTime;
    }

    public String getSprinkleId() {
        return sprinkleId;
    }

    public void setSprinkleId(String sprinkleId) {
        this.sprinkleId = sprinkleId;
    }


    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getReceivedId() {
        return receivedId;
    }

    public void setReceivedId(String receivedId) {
        this.receivedId = receivedId;
    }
}
