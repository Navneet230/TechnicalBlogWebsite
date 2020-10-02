<%@ page import="com.tech.blog.helper.connectionProvider" %>
<%@ page import="com.tech.blog.dao.PostDao" %>
<%@ page import="com.tech.blog.entities.Post" %>
<%@ page import="java.util.List" %>


<div class="row">
<% 
    
     PostDao d = new PostDao(connectionProvider.getConnection());
     
     int cid  =Integer.parseInt(request.getParameter("cid"));
     List<Post> posts =null;
     if(cid==0){
      posts =d.getAllPosts();
      }
     else{
    	 posts = d.getPostByCatId(cid);
     }
     
     if(posts.size()==0){
    	 out.println("<h3 class='display-3 text-center'>No Posts in this category...</h3>");
    	 return ;
     }
     for(Post p : posts){
    	 
     
%>

<div class="col-md-6 mt-2">

   <div class="card">
      <img class="card-img-top" src="img/<%=p.getpPic() %>" alt="Card image cap">
     <div class="card-body">
         <b><%= p.getpTitle() %></b>
         <p><%= p.getpContent() %></p>
         
     </div>
         <div class="card-footer primary-background text-center">
          <a href="#!" class="btn btn-outline-dark btn-sm"><i class="fa fa-thumbs-o-up"><span>10</span></i></a>
         
         <a href="show_blog_page.jsp?post_id=<%= p.getPid() %>" class="btn btn-outline-dark btn-sm">Read More...</a>
          <a href="#!" class="btn btn-outline-dark btn-sm"><i class="fa fa-commenting-o"><span>10</span></i></a>
          
         </div>
   
   </div>


</div>
 


<%
     }
%>

</div>