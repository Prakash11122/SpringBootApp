<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to product data page</h3>
<table border="1">
     <tr>
         <th>ID</th>
         <th>CODE</th>
         <th>COST</th>
         <th>VENDER</th>
         </tr>
         
               <c:forEach items="${products }" var="ob">
         <tr>
              <td>${ob.prodId }</td>
              <td>${ob.prodCode }</td>
              <td>${ob.prodCost }</td>
              <td>${ob.prodVender }</td>
              </tr>
              </c:forEach>
         

</table>

</body>
</html>