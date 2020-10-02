package com.tech.blog.entities;
import java.sql.*;
public class Post {
     private int pid ;
     private String pTitle ;
     private  String pContent ;
     private String pCode ;
     private String pPic ;
     private Timestamp pData ;
     private int caId ;
     private int userId ;
     
	public Post() {
		
	}
	public Post(int pid, String pTitle, String pContent, String pCode, String pPic, Timestamp pData, int caId,int userId) {
		
		this.pid = pid;
		this.pTitle = pTitle;
		this.pContent = pContent;
		this.pCode = pCode;
		this.pPic = pPic;
		this.pData = pData;
		this.caId = caId;
		this.userId=userId ;
	}
	public Post(String pTitle, String pContent, String pCode, String pPic, Timestamp pData, int caId,int userId) {
		
		this.pTitle = pTitle;
		this.pContent = pContent;
		this.pCode = pCode;
		this.pPic = pPic;
		this.pData = pData;
		this.caId = caId;
		this.userId=userId ;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public String getpContent() {
		return pContent;
	}
	public void setpContent(String pContent) {
		this.pContent = pContent;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpPic() {
		return pPic;
	}
	public void setpPic(String pPic) {
		this.pPic = pPic;
	}
	public Timestamp getpData() {
		return pData;
	}
	public void setpData(Timestamp pData) {
		this.pData = pData;
	}
	public int getCaId() {
		return caId;
	}
	public void setCaId(int caId) {
		this.caId = caId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
     
}
