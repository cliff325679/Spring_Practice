<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
       <form:form action="processForm" modelAttribute="student">
          First Name:<form:input path="firstName"/>
          <br><br>
          Last Name:<form:input path="lastName"/>
          <br><br>
          Country:
          <form:select path="country">
              <form:options items="${theCountryOptions}"/>
          </form:select>
          <br><br>
          Favorite Language:
          Java<form:radiobutton path="favoriteLanguage" value="Java"/>
          C#<form:radiobutton path="favoriteLanguage" value="C#"/>
          PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
          <br><br>
          Operation Systems:
          Linux<form:checkbox path="operationSystems" value="Linux"/>
          MS Windows<form:checkbox path="operationSystems" value="MS Windows"/>
          Mac OS<form:checkbox path="operationSystems" value="Mac OS"/>
          <br><br>
          <input type="submit" value="Submit"/>
       </form:form>
</body>
</html>