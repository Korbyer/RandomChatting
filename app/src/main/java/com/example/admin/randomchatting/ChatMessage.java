package com.example.admin.randomchatting;

/**
 * Created by admin on 2016-12-09.
 */

import android.graphics.Bitmap;

public class ChatMessage{
    private long id;
    private boolean isMe;
    private String message;
    private Long userId;
    private String dateTime;
    private Bitmap bitmap;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getIsme() {
        return isMe;
    }

    public void setMe(boolean isMe) {
        this.isMe = isMe;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return dateTime;
    }

    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }

}