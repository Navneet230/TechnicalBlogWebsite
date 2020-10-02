<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.*" %>
  <%@ page import="com.tech.blog.helper.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
<!-- css -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<style>
  .banner-background{
    clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 100%, 66% 91%, 33% 100%, 0 91%, 0 0);
  }
  
</style>

</head>
<body>
<!-- navbar -->
<%@include file="normal_navbar.jsp" %>
<!-- navbar end -->

<!-- //banner -->

<div class="container-fluid p-0 m-0 ">

   <div class="jumbotron primary-background text-white banner-background">
      <div class="container">
      <h3 class="display-3">Welcome to TechBlog</h3>
     
      <p>Welcome to technical blog ,A programming language is a formal language comprising a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms. </p>
      <p>Most programming languages consist of instructions for computers. There are programmable machines that use a set of specific instructions, rather than general programming languages. Early ones preceded the invention of the digital computer, the first probably being the automatic flute player described in the 9th century by the brothers Musa in Baghdad, during the Islamic Golden Age.[</p>
      <button class="btn btn-outline-light btn-lg"><span class="	fa fa-user-plus"></span>Strat ! its Free</button>
      <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="	fa fa-user-circle fa-spin"></span>Login</a>
      </div>
   </div>

   
</div>
<!-- //end-banner -->

<!-- cards -->
<div class="container">
  <div class="row mb-2">
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
  
  
  </div>
  <div class="row">
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
    <div  class="col-md-4">
        <div class="card" ">
  
  <div class="card-body">
    <h5 class="card-title">Java Programming Language</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read more</a>
  </div>
</div>
    </div>
    
  
  
  </div>
</div>
<!--end cards -->


<!-- javascript -->
<script
  src="https://code.jquery.com/jquery-3.5.1.min.js"
  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
  crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/myjs.js"></script>

</body>
</html>