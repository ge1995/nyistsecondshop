package com.nyist.secondshop.models;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by chao on 2018/4/21.
 */

public class Review {

  private int id;
  private int goodId;
  private String fromUser;
  private int fromUserId;
  private int toUserId;
  private String text;
  private String uploadDate;
  private List<Reply> replys;
  private int status;

  public int getToUserId() {
    return toUserId;
  }

  public void setToUserId(int toUserId) {
    this.toUserId = toUserId;
  }

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

  public List<Reply> getReplys() {
    return replys;
  }

  public void setReplys(List<Reply> replys) {
    this.replys = replys;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getGoodId() {
    return goodId;
  }

  public void setGoodId(int goodId) {
    this.goodId = goodId;
  }


  public String getFromUser() {
    return fromUser;
  }

  public void setFromUser(String fromUser) {
    this.fromUser = fromUser;
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
