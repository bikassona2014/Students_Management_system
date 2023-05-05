# Students_Management_system
This is a basic Student Management Application that allows you to add, delete, display, and update students in a MySQL database. 

The application is built using Java and has four classes: Start, Students, ConnectionToDB  and StudentDao. 

Start is the main class of the application, where the user interface is implemented using the console. Students is the class that defines the Student object, which contains studentId, studentName, studentPhone, and studentCity as its attributes.ConnectionToDB class that is used to establish a connection between the Java application and the MySQL database. StudentDao is the class that handles all the database operations like insert, delete, display, and update students.

The application connects to the MySQL database using JDBC and stores the students' details in the students table.

To use the application, you need to run the Start class. You will see a menu with five options:

1. Add Students - This option allows you to add a new student to the database by entering the student's name, phone number, and city.

2. Delete Students - This option allows you to delete a student from the database by entering the student's ID.

3. Display Students - This option displays all the students in the database.

4. Update Student - This option allows you to update a student's details by entering the student's ID and the new name, phone number, and city.

5. Exit - This option allows you to exit the application.

When you select an option, the application calls the appropriate method in the StudentDao class, which performs the required database operation.

Overall, this is a simple yet effective application that demonstrates how to use JDBC to connect to a MySQL database and perform basic database operations.


By - Bikas Mandal
