<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
    <%
        // Retrieve the session object
        HttpSession currentSession = request.getSession(false);

    	if(currentSession != null){
    		currentSession.invalidate();
    	}

    	// Redirect to the login page if the session is not valid
        response.sendRedirect("index.html");
    %>



</body>
</html>