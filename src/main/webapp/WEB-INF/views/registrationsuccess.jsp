<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="<a class="vglnk" href="http://java.sun.com/jsp/jstl/core" rel="nofollow"><span>http</span><span>://</span><span>java</span><span>.</span><span>sun</span><span>.</span><span>com</span><span>/</span><span>jsp</span><span>/</span><span>jstl</span><span>/</span><span>core</span></a>" %>
 
 
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Confirmation Page</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
    <div class="generic-container">
        <div class="alert alert-success lead">
            ${success}
        </div>
         
        <span class="well pull-left">
            <a href="<c:url value='/add-document-${user.id}' />">Click here to upload/manage your documents</a>   
        </span>
        <span class="well pull-right">
            Go to <a href="<c:url value='/list' />">Users List</a>
        </span>
    </div>
</body>
 
</html>