/**
 * 
 */
package com.fynger.servicesBusiness.integration.dataAccess.dataObjects;

import java.sql.Timestamp;

/**
 * @author Rishi
 *
 */
public class ShoutGroupPostData extends ShoutGroupData{
	
	private int postId;
	
	private int shoutGroupId;
	
	/* Contains user full name */
	private String createdUsername;
	
	private String postText;
	
	private String postImagePath;
	
	private String postLatitude;
	
	private String postLongitude;
	
	private String userPicturePath;
	
	private Timestamp createdTimestamp;
	
	private String username;

	/**
	 * @return the postId
	 */
	public int getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(int postId) {
		this.postId = postId;
	}

	/**
	 * @return the shoutGroupId
	 */
	public int getShoutGroupId() {
		return shoutGroupId;
	}

	/**
	 * @param shoutGroupId the shoutGroupId to set
	 */
	public void setShoutGroupId(int shoutGroupId) {
		this.shoutGroupId = shoutGroupId;
	}

	/**
	 * @return the createdUsername
	 */
	public String getCreatedUsername() {
		return createdUsername;
	}

	/**
	 * @param createdUsername the createdUsername to set
	 */
	public void setCreatedUsername(String createdUsername) {
		this.createdUsername = createdUsername;
	}

	/**
	 * @return the postText
	 */
	public String getPostText() {
		return postText;
	}

	/**
	 * @param postText the postText to set
	 */
	public void setPostText(String postText) {
		this.postText = postText;
	}

	/**
	 * @return the postImagePath
	 */
	public String getPostImagePath() {
		return postImagePath;
	}

	/**
	 * @param postImagePath the postImagePath to set
	 */
	public void setPostImagePath(String postImagePath) {
		this.postImagePath = postImagePath;
	}

	/**
	 * @return the postLatitude
	 */
	public String getPostLatitude() {
		return postLatitude;
	}

	/**
	 * @param postLatitude the postLatitude to set
	 */
	public void setPostLatitude(String postLatitude) {
		this.postLatitude = postLatitude;
	}

	/**
	 * @return the postLongitude
	 */
	public String getPostLongitude() {
		return postLongitude;
	}

	/**
	 * @param postLongitude the postLongitude to set
	 */
	public void setPostLongitude(String postLongitude) {
		this.postLongitude = postLongitude;
	}

	/**
	 * @return the userPicturePath
	 */
	public String getUserPicturePath() {
		return userPicturePath;
	}

	/**
	 * @param userPicturePath the userPicturePath to set
	 */
	public void setUserPicturePath(String userPicturePath) {
		this.userPicturePath = userPicturePath;
	}

	/**
	 * @return the createdTimestamp
	 */
	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
