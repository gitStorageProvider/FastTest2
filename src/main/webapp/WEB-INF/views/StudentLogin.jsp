<%@include file="common/header.jspf" %>

<fmt:message key="message.StudentAction.LoginAsStudent"/>
<br>
<br>
<form name="LoginForm" method="post">
    <input type="hidden" name="command" value="studentLogin"/>
    <h4><fmt:message key="label.Email"/></h4>
    <input type="email" name="email" size="36" class="input" required/>
    <input type="submit" value="<fmt:message key="label.Login"/>"/>
</form>
<br>
<form name="GoToAdminLoginForm" method="post">
    <input type="hidden" name="command" value="goToAdminLoginPage"/>
    <br/>
    <br/>
    <input type="submit" value="<fmt:message key="message.AdminAction.LoginAsAdmin"/>"/>
</form>