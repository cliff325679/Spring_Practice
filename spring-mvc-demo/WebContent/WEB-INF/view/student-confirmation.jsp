<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
The student is confirmed:${student.firstName} ${student.lastName}
<br><br>
Country:${student.country}
<br><br>
FavoriteLanguage:${student.favoriteLanguage}
<br><br>
OS:
<ul>
    <c:forEach var="temp" items="${student.operationSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>