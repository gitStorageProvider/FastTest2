Project description:
Rapid testing system for Students. Student is registered by e-mail, his success is tied
to him and messages with the result of the tests will be sent to this email. In the 
system there is a catalog of tests on topics, an authorized student can pass the tests.
At the end of the test, a form should be displayed on the page showing the student's
errors. All the data on academic progress and completed courses are displayed on the
Administrator page as a summary table for all Students.

Requirements:
MySQL Community Server 5.7 or newer
JVM 8 or newer
Apache Tomcat 9 or newer

Installation:
Use the script for DB initialization: \sqlScripts\db.sql
default DB user 
			login: root
			password: 
Default setting for Apache connection pool: webapp\META-INF\context.xml
\resources\log4j.properties
Default setting for logging: \resources\log4j.properties