package com.nanjiqie.mall.pojo;

public class UserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String host;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.User
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    private String user;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Host
     *
     * @return the value of user.Host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Host
     *
     * @param host the value for user.Host
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.User
     *
     * @return the value of user.User
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.User
     *
     * @param user the value for user.User
     *
     * @mbggenerated Fri Sep 23 11:22:20 CST 2022
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}