# DBMS-project-group-17

# Auto Repair and Service Management System Database Project
A fully automated Automotive repair and service management backed service, built using Java.

[ER Diagram!](https://github.com/smarabattula/autor/blob/main/project_submission/ER.pdf)
<br>

***Submission:***

1. The files submitted for the projects are under the folder `project_submission` in the git repo!

2. The SQL files for this project can be found under "db_creation.sql" and "db_populate.sql".

<br>

## How to run and compile the code

1. In the zip file there is a file named "config.properties". Please open the file and replace the values there with valid/correct login credentials to access the NCSU oracle remote database. 
Your file content should be in the below manner.

```
user=smaraba
passwd=abcd1234
```

2. After updating the login details in the file, please access the remote oracle repository using below steps.
   
          a. login/ssh to remote.eos.ncsu.edu using your UnityID and Unity password.
          
          b. After logggin in, tranfer all the project files.
          
          c. To set up the necessry drivers to communicate with the orcle, run the following commands:
  
            ( i )   add oracle12
            ( ii )  export CLASSPATH=.:/afs/eos.ncsu.edu/software/oracle12/oracle/product/12.2/client/jdbc/lib/ojdbc8.jar
            (iii) add jdk
            
  
3. To initialize the database, run the jar file named “initializeDB” using the following command: `java -jar initializeDB.jar`

***Note:*** 
As the jar file reads directly from SQL, all the SQL files must be in the same directory as this jar file.

To reset the database, this file can be re-run. After the database is reseted, all the old tables are dropped and the sample data is recreated.

4.  To launch the application, run the file named “dbms_project.jar" using the following command.

```
java -jar dbms_project.jar

```
Now you should be able to interact with the database and can use the Auto Repair and Service Management System.

<br>

## Contributors
Saketh Vangala     (svangal@ncsu.edu),  
Sasank Marabattula (smaraba@ncsu.edu),     
Varun Deepak Gudhe (vgudhe@ncsu.edu),  
Sukruthi Modem     (smodem@ncsu.edu)  
