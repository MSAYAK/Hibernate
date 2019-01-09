<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Employee Page</title>
	<link href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css" rel="stylesheet" />
	<style>
.error {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<h1>
	Add a Employee
</h1>
<c:url var="addAction" value="employee/add" ></c:url>
<form:form action="${addAction}" 
	modelAttribute="employee"  method="POST">
<table border="1">
	<c:if test="${!empty employee.firstname}">
	<tr>
		<td>
			<form:label path="employeeid">
				<spring:message text="Employee ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="employeeid" readonly="true" 
			size="8"  disabled="true" />
			<form:hidden path="employeeid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="firstname">
				<spring:message text="Employee First Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="firstname" />
			<form:errors path="firstname" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="lastname">
				<spring:message text="Employee Last Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="lastname" />
			<form:errors path="lastname" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="emailAddress">
				<spring:message text="Employee Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="emailAddress" />
			<form:errors path="emailAddress" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="salary">
				<spring:message text="Employee Salary"/>
			</form:label>
		</td>
		<td>
			<form:input path="salary" />
			<form:errors path="salary" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="phoneNumber">
				<spring:message text="Employee Number"/>
			</form:label>
		</td>
		<td>
			<form:input path="phoneNumber" />
			<form:errors path="phoneNumber" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Enter Password"/>
			</form:label>
		</td>
		<td>
			<form:input path="password" />
			<form:errors path="password" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="jobId">
				<spring:message text="Employee JobId"/>
			</form:label>
		</td>
		<td>
			<form:input path="jobId" />
			<form:errors path="jobId" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="department_id">
				<spring:message text="Enter Department ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="department_id" />
			<form:errors path="department_id" cssClass="errors"></form:errors>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="hiredate">
				<spring:message text="Country Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="hiredate" />
			<form:errors path="hiredate" cssClass="errors"></form:errors>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty employee.firstname}">
				<input type="submit"
					value="<spring:message 
					text="Edit Employee"/>" />
			</c:if>
			<c:if test="${empty employee.name}">
				<input type="submit"
					value="<spring:message 
					text="Add Employee"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Employee List</h3>
<c:if test="${!empty listEmployees}">
	<table class="tg" border="1">
	<tr>
		<th width="80">Employee ID</th>
		<th width="100">Employee FirstName</th>
		<th width="100">Employee LastName</th>
		<th width="100">Employee Email</th>
		<th width="100">Employee Salary</th>
		<th width="100">Employee Department ID</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listEmployees}" var="employee">
		<tr>
			<td>${employee.employeeid}</td>
			<td>${employee.firstname}</td>
			<td>${employee.lastname}</td>
			<td>${employee.emailAddress}</td>
			<td>${employee.salary}</td>
			<td>${employee.department_id}</td>
			
			<td><a href="
			<c:url value='/edit/${employee.id}' />" >Edit</a></td>
			<td><a href="
			<c:url value='/remove/${employee.id}' />" >Delete</a>
			</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>

