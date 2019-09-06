<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.fName} ${student.lName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>
Operating Systems: 
<c:forEach items= "${student.operatingSystems}" var="current">
<c:out value="${current}"/>
</c:forEach>

</body>

</html>
