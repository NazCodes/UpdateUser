<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action='confirmupdate' method='POST'>  
        <div class="container">   
            <label>New UserID : </label>   
            <input type="text" placeholder="Enter New UserID" name="newuserid" required>  
            <label>New Name : </label>   
            <input type="text" placeholder="Enter New Name" name="newname" required>  
            <button type="submit">Update</button>     
        </div>   
    </form>     
</body>
</html>