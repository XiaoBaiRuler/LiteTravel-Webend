package com.LiteTravel.web.Model;

public class BlogTagMapKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_blog_tags.blog_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private Integer blogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_blog_tags.tag_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    private Integer tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_blog_tags.blog_id
     *
     * @return the value of travel_blog_tags.blog_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_blog_tags.blog_id
     *
     * @param blogId the value for travel_blog_tags.blog_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_blog_tags.tag_id
     *
     * @return the value of travel_blog_tags.tag_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_blog_tags.tag_id
     *
     * @param tagId the value for travel_blog_tags.tag_id
     *
     * @mbg.generated Mon Feb 17 16:00:54 CST 2020
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}