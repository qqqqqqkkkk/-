package com.nanjiqie.mall.pojo;

public class Commodity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String host;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.quality
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private Integer quality;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.price
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.name
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.picture
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private byte[] picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.id
     *
     * @return the value of commodity.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.id
     *
     * @param id the value for commodity.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.host
     *
     * @return the value of commodity.host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.host
     *
     * @param host the value for commodity.host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.quality
     *
     * @return the value of commodity.quality
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.quality
     *
     * @param quality the value for commodity.quality
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.price
     *
     * @return the value of commodity.price
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.price
     *
     * @param price the value for commodity.price
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.name
     *
     * @return the value of commodity.name
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.name
     *
     * @param name the value for commodity.name
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.picture
     *
     * @return the value of commodity.picture
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.picture
     *
     * @param picture the value for commodity.picture
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}