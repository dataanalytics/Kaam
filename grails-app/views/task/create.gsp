<%@ page contentType="text/html;charset=ISO-8859-1" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<meta name="layout" content="main"/>
		<title>Create a Task</title>
	</head>
	<body>
		<g:form action="save" class="inputform" >
			<fieldset>
				<dl>
					<dt>Description</dt>
					<dd><g:textArea name="description" value="${task.description} cols="40" rows="10"></g:textArea>
					<dt>Completion date</dt>
					<dd><g:datePicker name="completionDate" value="${task.completionDate}"></g:datePicker>
				</dl>
			</fieldset>
			<g:submitButton name="Save" value="Save"/>
			
			<g:link action="create">Cancel</g:link>
		</g:form>
	</body>
</html>