<%@include file="common/header.jspf" %>

<fmt:message key="message.AdminAction.LoginAsAdmin"/>
<br>
<br>
<form name="LoginForm" method="post">
    <input type="hidden" name="command" value="adminLogin"/>
    <h4><fmt:message key="label.Login"/></h4>
    <input type="text" name="email" size="36" class="input" required/>
    <h4><fmt:message key="label.Password"/></h4>
    <input type="password" name="email" size="36" class="input" required/>
    <input type="submit" value="<fmt:message key="label.Login"/>"/>
</form>
<br>
<form name="GoToStudentLoginForm" method="post">
    <input type="hidden" name="command" value="goToStudentLoginPage"/>
    <br/>
    <br/>
    <input type="submit" value="<fmt:message key="message.AdminAction.LoginAsStudent"/>"/>
</form>