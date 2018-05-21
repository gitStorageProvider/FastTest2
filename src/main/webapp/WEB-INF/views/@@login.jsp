<%@include file="common/header.jspf"%>
<%@include file="common/@@navigation.jspf"%>

login.jsp

<div class="container">
    <form action = "controller" method="post" >
        <input type="hidden" name="command" value="login">

        <div class="form-group w-25">
            <label for="loginInput">
                <fmt:message key="message.StudentAction.LoginAsStudent" />
            </label>
            <input type="text" name = "login" value="${login}"  class="form-control" id="loginInput" aria-describedby="loginHelp" placeholder="Login">
            <small id="loginHelp" class="form-text text-muted"><fmt:message key="message.StudentAction.LoginAsStudent" /></small>
        </div>

        <div class="form-group w-25">
            <label for="passwordInput"><fmt:message key="message.StudentAction.LoginAsStudent" /></label>
            <input type="password" name = "password" class="form-control" id="passwordInput" aria-describedby="passwordHelp" placeholder="Password">
        </div>

        <div class="form-group  has-danger  w-25">
            <label><font color = "red">${errorLoginPassMessage}</font></label>
            <label><font color = "red">${wrongCommand}</font></label>
            <label><font color = "red">${nullPage}</font></label>
        </div>

        <button type="submit"  value = "login" class="btn btn-primary w-25"><fmt:message key="message.StudentAction.LoginAsStudent" /></button>
    </form>
</div>


<%@include file="common/@@footer.jspf"%>
