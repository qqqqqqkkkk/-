package com.nanjiqie.mall.pojo;

public class Seller {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.username
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.password
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.profit
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String profit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.id
     *
     * @return the value of seller.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.id
     *
     * @param id the value for seller.id
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.username
     *
     * @return the value of seller.username
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.username
     *
     * @param username the value for seller.username
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.password
     *
     * @return the value of seller.password
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.password
     *
     * @param password the value for seller.password
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.profit
     *
     * @return the value of seller.profit
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.profit
     *
     * @param profit the value for seller.profit
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setProfit(String profit) {
        this.profit = profit == null ? null : profit.trim();
    }
}