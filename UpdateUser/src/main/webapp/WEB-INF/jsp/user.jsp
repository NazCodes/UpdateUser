<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action='updateuser' method='POST'>  
        <div class="container">   
            <label>UserID : </label>   
            <input type="text" placeholder="Enter UserID" name="userid" required>  
            <label>Name : </label>   
            <input type="text" placeholder="Enter Name" name="name" required>  
            <button type="submit">Verify</button>     
        </div>   
    </form>     
</body>
</html>