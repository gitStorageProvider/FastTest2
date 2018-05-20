<%@include file="common/header.jspf" %>

<fmt:message key="header.AdminMainPage"/>
<br>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="addAdmin"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.AddAdmin"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="addQuestion"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.AddQuestion"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="deleteAdmin"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.DeleteAdmin"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="deleteQuestion"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.DeleteQuestion"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="deleteStudent"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.DeleteStudent"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="deleteTestById"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.DeleteCompletedTest"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="editAdmin"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.UpdateAdmin"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="editQuestion"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.UpdateQuestion"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="showAllAdmins"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.ShowAllAdmins"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="showAllQuestions"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.ShowAllQuestions"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="showAllStudents"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.ShowAllStudents"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="showAllTestByStudent"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.ShowAllStudentCompleteTests"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="showLastTests"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.ShowLastCompleteTests"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="editStudent"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.UpdateStudent"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="logout"/>
    <input type="submit" value="<fmt:message key="message.CommonAction.Logout"/>"/>
</form>
<br>
<form name="adminCommand" method="post">
    <input type="hidden" name="command" value="registerStudent"/>
    <input type="submit" value="<fmt:message key="message.AdminAction.AddStudent"/>"/>
</form>
<br>
<br>
<br>
<br>
