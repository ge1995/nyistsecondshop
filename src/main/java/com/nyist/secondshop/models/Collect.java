package com.nyist.secondshop.models;

/**
 * Created by chao on 2018/3/13.
 */
public class Collect {

  private int id;
  private int goodId;
  private String goodName;
  private int userId;
  private Good good;

  public Good getGood() {
    return good;
  }

  public void setGood(Good good) {
    this.good = good;
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


  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

}
