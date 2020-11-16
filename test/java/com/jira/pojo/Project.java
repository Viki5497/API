package com.jira.pojo;

public class Project {
private String self;
private String id;
private String key;
private String name;
private String projectTypeKey;
private boolean simplified;
private AvatarUrlsProject avatarUrls;
public String getSelf() {
	return self;
}
public void setSelf(String self) {
	this.self = self;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProjectTypeKey() {
	return projectTypeKey;
}
public void setProjectTypeKey(String projectTypeKey) {
	this.projectTypeKey = projectTypeKey;
}
public boolean isSimplified() {
	return simplified;
}
public void setSimplified(boolean simplified) {
	this.simplified = simplified;
}
public AvatarUrlsProject getAvatarUrls() {
	return avatarUrls;
}
public void setAvatarUrls(AvatarUrlsProject avatarUrls) {
	this.avatarUrls = avatarUrls;
}


}
