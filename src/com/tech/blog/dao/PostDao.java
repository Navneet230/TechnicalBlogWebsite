package com.tech.blog.dao;
import java.sql.*;
import java.util.*;
import com.tech.blog.entities.*;
public class PostDao {
  
	Connection con ;
	
	public PostDao(Connection con) {
		this.con=con ;
		
	}
	
	public ArrayList<Category> getAllCategories(){
		ArrayList<Category> list = new ArrayList<>();
		
		try {
			String q = "select * from categories";
			Statement s =this.con.createStatement();
			ResultSet rs = s.executeQuery(q);
			while(rs.next()) {
				int cid = rs.getInt("cid");
				String name = rs.getString("name");
				String description = rs.getString("description");
				Category c = new Category(cid,name,description);
				list.add(c);
			}
			
		}catch(Exception e) {
			
		}
		
		return list ;
	}
	
	
	public boolean savePost(Post p) {
		boolean f =false ;
		
		try {
			String q = "insert into post(ptitle,pcontent,pcode,ppic,cid,userid) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, p.getpTitle());
			ps.setString(2, p.getpContent());
			ps.setString(3, p.getpCode());
			ps.setString(4, p.getpPic());
			ps.setInt(5, p.getCaId());
			ps.setInt(6,p.getUserId());
			ps.executeUpdate();
			f =true ;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f ;
	}
	//get all the posts
	public List<Post> getAllPosts(){
		List<Post> list  = new ArrayList<>();
		//fetch all posts
		try {
			PreparedStatement ps =con.prepareStatement("select * from post order by pid desc ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int pId = rs.getInt("pid");
				String pTitle =rs.getString("ptitle");
				String pContent  = rs.getString("pcontent");
				String pCode = rs.getString("pcode");
				String pPic = rs.getString("ppic");
				Timestamp date = rs.getTimestamp("pdate");
				int catId = rs.getInt("cid");
				int userid = rs.getInt("userid");
				Post p = new Post(pId,pTitle,pContent,pCode,pPic,date,catId,userid);
			   list.add(p);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	//
	public List<Post> getPostByCatId(int catId){
     List<Post> list  = new ArrayList<>();
		//fetch post by catId
     try {
			PreparedStatement ps =con.prepareStatement("select * from post where cid=?");
			ps.setInt(1, catId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int pId = rs.getInt("pid");
				String pTitle =rs.getString("ptitle");
				String pContent  = rs.getString("pcontent");
				String pCode = rs.getString("pcode");
				String pPic = rs.getString("ppic");
				Timestamp date = rs.getTimestamp("pdate");
				
				int userid = rs.getInt("userid");
				Post p = new Post(pId,pTitle,pContent,pCode,pPic,date,catId,userid);
			   list.add(p);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	public Post getPostByPostId(int postId) {
		Post post =null;
		try {
		
		String q ="select * from post where pid=?" ;
		PreparedStatement p = this.con.prepareStatement(q);
		p.setInt(1, postId);
		
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			int pId = rs.getInt("pid");
			String pTitle =rs.getString("ptitle");
			String pContent  = rs.getString("pcontent");
			String pCode = rs.getString("pcode");
			String pPic = rs.getString("ppic");
			Timestamp date = rs.getTimestamp("pdate");
			int catId = rs.getInt("cid");
			int userid = rs.getInt("userid");
			post = new Post(pId,pTitle,pContent,pCode,pPic,date,catId,userid);
		   
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return post;
	}
}
