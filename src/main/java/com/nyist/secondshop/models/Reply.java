package com.nyist.secondshop.models;

import java.text.SimpleDateFormat;

/**
 * Created by chao on 2018/4/21.
 */

public class Reply {

  private int id;
  private int reviewId;
  private String fromUser;
  private int fromUserId;
  private String toUser;
  private int toUserId;
  private String text;
  private String uploadDate;
  private int status;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(int fromUserId) {
    this.fromUserId = fromUserId;
  }

  public int getToUserId() {
    return toUserId;
  }

  public void setToUserId(int toUserId) {
    this.toUserId = toUserId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getReviewId() {
    return reviewId;
  }

  public void setReviewId(int reviewId) {
    this.reviewId = reviewId;
  }


  public String getFromUser() {
    return fromUser;
  }

  public void setFromUser(String fromUser) {
    this.fromUser = fromUser;
  }


  public String getToUser() {
    return toUser;
  }

  public void setToUser(String toUser) {
    this.toUser = toUser;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public String getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(java.sql.Timestamp uploadDate) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    this.uploadDate = sdf.format(uploadDate);
  }

}
