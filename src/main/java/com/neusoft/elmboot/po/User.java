package com.neusoft.elmboot.po;

public class User {

    private String userId;
    private String password;
    private String userName;
    private Integer userSex;
    private String userImg;
    private Integer delTag;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public User(String userId, String password, String userName, Integer userSex) {
        this(userId, password);
        this.userName = userName;
        this.userSex = userSex;
    }

    public User(String userId, String password, String userName, Integer userSex, String userImg, Integer delTag) {
        this(userId, password, userName, userSex);
        this.userImg = userImg;
        this.delTag = delTag;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", delTag=" + delTag +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public String getUserImg() {
        return userImg;
    }

    public Integer getDelTag() {
        return delTag;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public void setDelTag(Integer delTag) {
        this.delTag = delTag;
    }
}
