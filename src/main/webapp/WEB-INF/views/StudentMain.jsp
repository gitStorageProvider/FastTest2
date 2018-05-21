<%@include file="common/header.jspf" %>

<fmt:message key="header.StudentMainPage"/>
<br>
<br>
<form name="studentCommand" method="post">
    <input type="hidden" name="command" value="showAllTestByStudent"/>
    <input type="submit" value="<fmt:message key="message.StudentAction.SeeAllTestHistory"/>"/>
</form>
<br>
<form name="studentCommand" method="post">
    <input type="hidden" name="command" value="startNewTest"/>
    <input type="submit" value="<fmt:message key="message.StudentAction.StartNewTest"/>"/>
</form>
<br>
<form name="studentCommand" method="post">
    <input type="hidden" name="command" value="finishTest"/>
    <input type="submit" value="<fmt:message key="message.StudentAction.FinishTest"/>"/>
</form>
<br>
<br>
