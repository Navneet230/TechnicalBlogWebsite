<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>

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

<main class="primary-background  banner-background" style="padding-bottom:70px;">
  <div class="container">
     <div class="col-md-6 offset-md-3">
       <div class="card">
         <div class="card-header text-center primary-background text-white">
           <span class="fa fa-3x fa-user-circle"></span>
           <br>
           Register Here
         </div>
         <div class="card-body">
           <form id="reg-form" action="RegisterServlet" method="post">
         
           <div class="form-group">
           <label for="user_name">User Name</label>
           <input type="text" name="user_name" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter Name">
           
           </div>
 
           <div class="form-group">
           <label for="exampleInputEmail1">Email address</label>
           <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
           <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
           </div>
 
           <div class="form-group">
           <label for="exampleInputPassword1">Password</label>
           <input type="password" name="user_password" class="form-control" id="exampleInputPassword1" placeholder="Password">
           </div>
           
           <div class="form-group">
           <label for="gender">Select Gender</label>
           <br>
           <input type="radio" value="male" id="gender" name="user_gender" >Male
           <input type="radio" value="female" id="gender" name="user_gender">Female
           </div>
           
           <div class="form-group">
             <textarea name="about" class="form-control" id=""rows="2"  placeholder="Enter something"></textarea>
           </div>
           
          <div class="form-check">
          <input type="checkbox" name="check" class="form-check-input" id="exampleCheck1">
          <label class="form-check-label" for="exampleCheck1">agree terms and conditions</label>
          </div>
          <br>
         <button type="submit" class="btn btn-primary">Submit</button>
         </form>
        </div>
        
     
     
     </div>
 </div>



</main>



<!-- javascript -->
<script
  src="https://code.jquery.com/jquery-3.5.1.min.js"
  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
  crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/myjs.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>


</body>
</html>