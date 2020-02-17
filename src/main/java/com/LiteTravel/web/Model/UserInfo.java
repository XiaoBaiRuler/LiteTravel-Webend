package com.LiteTravel.web.Model;

import java.util.Date;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_name
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_gender
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private Integer userGender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_birth
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private Date userBirth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_phone
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_email
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_address
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_address_specific
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userAddressSpecific;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_info.user_avatar_uri
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private String userAvatarUri;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_id
     *
     * @return the value of travel_user_info.user_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_id
     *
     * @param userId the value for travel_user_info.user_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_name
     *
     * @return the value of travel_user_info.user_name
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_name
     *
     * @param userName the value for travel_user_info.user_name
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_gender
     *
     * @return the value of travel_user_info.user_gender
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_gender
     *
     * @param userGender the value for travel_user_info.user_gender
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_birth
     *
     * @return the value of travel_user_info.user_birth
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public Date getUserBirth() {
        return userBirth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_birth
     *
     * @param userBirth the value for travel_user_info.user_birth
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_phone
     *
     * @return the value of travel_user_info.user_phone
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_phone
     *
     * @param userPhone the value for travel_user_info.user_phone
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_email
     *
     * @return the value of travel_user_info.user_email
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_email
     *
     * @param userEmail the value for travel_user_info.user_email
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_address
     *
     * @return the value of travel_user_info.user_address
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_address
     *
     * @param userAddress the value for travel_user_info.user_address
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_address_specific
     *
     * @return the value of travel_user_info.user_address_specific
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserAddressSpecific() {
        return userAddressSpecific;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_address_specific
     *
     * @param userAddressSpecific the value for travel_user_info.user_address_specific
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserAddressSpecific(String userAddressSpecific) {
        this.userAddressSpecific = userAddressSpecific == null ? null : userAddressSpecific.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_info.user_avatar_uri
     *
     * @return the value of travel_user_info.user_avatar_uri
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public String getUserAvatarUri() {
        return userAvatarUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_info.user_avatar_uri
     *
     * @param userAvatarUri the value for travel_user_info.user_avatar_uri
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setUserAvatarUri(String userAvatarUri) {
        this.userAvatarUri = userAvatarUri == null ? null : userAvatarUri.trim();
    }
}