package com.tweetapp.tweetservice.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.tweetapp.tweetservice.bean.Reply;

/**
 * @author Sandeep
 *
 */
@Document(collection = "post" )
public class Post {

	@Id
	private String id;
	private String tweet;
	private String userName;
	private String tags;
	private int likes;
	private Date createdAt;
	private List<Reply> reply;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt() {
		this.createdAt = new Date();
	}
	public List<Reply> getReply() {
		return reply;
	}
	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}
	public Post(String id, String tweet, String userName, String tags, int likes, Date createdAt, List<Reply> reply) {
		super();
		this.id = id;
		this.tweet = tweet;
		this.userName = userName;
		this.tags = tags;
		this.likes = likes;
		this.createdAt = createdAt;
		this.reply = reply;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", tweet=" + tweet + ", userName=" + userName + ", tags=" + tags + ", likes=" + likes
				+ ", createdAt=" + createdAt + ", reply=" + reply + "]";
	}
	
}