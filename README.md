
# MCE-Exam-Seat-Allocation-System

A project built for my colleges' exam section to solve a problem of inefficient exam room and seat allocation for students and invigilators using Java, MySql, JDBC-API and itextPDF-API.




![Logo](https://www.mcehassan.ac.in/assets/images/MCE_logo.png)


<h1>Phase01: Writing a java code to implement student distribution</h1>
<h4>Input: Filled an static array with all required elements like roomdeatils,itavailability,USN to be followed, capacity etc.</h4>
<h4>Ouput</h4><PRE><p>-------------------------------------------
        RoomName        Capacity        Availability
        -------------------------------------------
        SA101   |       30      |       NAN
        SA102   |       30      |       NAN
        AB201   |       25      |       Available
        AB202   |       25      |       Available
        CRB1    |       35      |       Available
        CRB2    |       35      |       Available
        ME101   |       30      |       NAN
        ME102   |       30      |       NAN
        Audi    |       60      |       Available
        -------------------------------------------
        -------------------------------------------
        CourseName              No of Students
        -------------------------------------------
        IS501           |       40
        IS502           |       40
        IS503           |       41
        IS504           |       40
        IS505           |       39
        -------------------------------------------
        
        
        =========================================================================================================================
        |Room:SA101|
        
        4MC21IS1 Seat.no:1      |4MC21IS2 Seat.no:2     |4MC21IS3 Seat.no:3     |4MC21IS4 Seat.no:4     |4MC21IS5 Seat.no:5     |
        4MC21IS6 Seat.no:6      |4MC21IS7 Seat.no:7     |4MC21IS8 Seat.no:8     |4MC21IS9 Seat.no:9     |4MC21IS10 Seat.no:10   |
        4MC21IS11 Seat.no:11    |4MC21IS12 Seat.no:12   |4MC21IS13 Seat.no:13   |4MC21IS14 Seat.no:14   |4MC21IS15 Seat.no:15   |
        4MC21IS16 Seat.no:16    |4MC21IS17 Seat.no:17   |4MC21IS18 Seat.no:18   |4MC21IS19 Seat.no:19   |4MC21IS20 Seat.no:20   |
        4MC21IS21 Seat.no:21    |4MC21IS22 Seat.no:22   |4MC21IS23 Seat.no:23   |4MC21IS24 Seat.no:24   |4MC21IS25 Seat.no:25   |
        4MC21IS26 Seat.no:26    |4MC21IS27 Seat.no:27   |4MC21IS28 Seat.no:28   |4MC21IS29 Seat.no:29   |4MC21IS30 Seat.no:30   |
        =========================================================================================================================
        
        
        
        =========================================================================================================================
        |Room:AB201|
        
        4MC21IS61 Seat.no:1     |4MC21IS62 Seat.no:2    |4MC21IS63 Seat.no:3    |4MC21IS64 Seat.no:4    |4MC21IS65 Seat.no:5    |
        4MC21IS66 Seat.no:6     |4MC21IS67 Seat.no:7    |4MC21IS68 Seat.no:8    |4MC21IS69 Seat.no:9    |4MC21IS70 Seat.no:10   |
        4MC21IS71 Seat.no:11    |4MC21IS72 Seat.no:12   |4MC21IS73 Seat.no:13   |4MC21IS74 Seat.no:14   |4MC21IS75 Seat.no:15   |
        4MC21IS76 Seat.no:16    |4MC21IS77 Seat.no:17   |4MC21IS78 Seat.no:18   |4MC21IS79 Seat.no:19   |4MC21IS80 Seat.no:20   |
        4MC21IS81 Seat.no:21    |4MC21IS82 Seat.no:22   |4MC21IS83 Seat.no:23   |4MC21IS84 Seat.no:24   |4MC21IS85 Seat.no:25   |
        =========================================================================================================================
        
        
        =========================================================================================================================
        |Room:AB202|
        
        4MC21IS86 Seat.no:1     |4MC21IS87 Seat.no:2    |4MC21IS88 Seat.no:3    |4MC21IS89 Seat.no:4    |4MC21IS90 Seat.no:5    |
        4MC21IS91 Seat.no:6     |4MC21IS92 Seat.no:7    |4MC21IS93 Seat.no:8    |4MC21IS94 Seat.no:9    |4MC21IS95 Seat.no:10   |
        4MC21IS96 Seat.no:11    |4MC21IS97 Seat.no:12   |4MC21IS98 Seat.no:13   |4MC21IS99 Seat.no:14   |4MC21IS100 Seat.no:15  |
        4MC21IS101 Seat.no:16   |4MC21IS102 Seat.no:17  |4MC21IS103 Seat.no:18  |4MC21IS104 Seat.no:19  |4MC21IS105 Seat.no:20  |
        4MC21IS106 Seat.no:21   |4MC21IS107 Seat.no:22  |4MC21IS108 Seat.no:23  |4MC21IS109 Seat.no:24  |4MC21IS110 Seat.no:25  |
        =========================================================================================================================
        
        
        =========================================================================================================================
        |Room:CRB1|
        
        4MC21IS111 Seat.no:1    |4MC21IS112 Seat.no:2   |4MC21IS113 Seat.no:3   |4MC21IS114 Seat.no:4   |4MC21IS115 Seat.no:5   |
        4MC21IS116 Seat.no:6    |4MC21IS117 Seat.no:7   |4MC21IS118 Seat.no:8   |4MC21IS119 Seat.no:9   |4MC21IS120 Seat.no:10  |
        4MC21IS121 Seat.no:11   |4MC21IS122 Seat.no:12  |4MC21IS123 Seat.no:13  |4MC21IS124 Seat.no:14  |4MC21IS125 Seat.no:15  |
        4MC21IS126 Seat.no:16   |4MC21IS127 Seat.no:17  |4MC21IS128 Seat.no:18  |4MC21IS129 Seat.no:19  |4MC21IS130 Seat.no:20  |
        4MC21IS131 Seat.no:21   |4MC21IS132 Seat.no:22  |4MC21IS133 Seat.no:23  |4MC21IS134 Seat.no:24  |4MC21IS135 Seat.no:25  |
        4MC21IS136 Seat.no:26   |4MC21IS137 Seat.no:27  |4MC21IS138 Seat.no:28  |4MC21IS139 Seat.no:29  |4MC21IS140 Seat.no:30  |
        4MC21IS141 Seat.no:31   |4MC21IS142 Seat.no:32  |4MC21IS143 Seat.no:33  |4MC21IS144 Seat.no:34  |4MC21IS145 Seat.no:35  |
        =========================================================================================================================
        
        
        =========================================================================================================================
        |Room:CRB2|
        
        4MC21IS146 Seat.no:1    |4MC21IS147 Seat.no:2   |4MC21IS148 Seat.no:3   |4MC21IS149 Seat.no:4   |4MC21IS150 Seat.no:5   |
        4MC21IS151 Seat.no:6    |4MC21IS152 Seat.no:7   |4MC21IS153 Seat.no:8   |4MC21IS154 Seat.no:9   |4MC21IS155 Seat.no:10  |
        4MC21IS156 Seat.no:11   |4MC21IS157 Seat.no:12  |4MC21IS158 Seat.no:13  |4MC21IS159 Seat.no:14  |4MC21IS160 Seat.no:15  |
        4MC21IS161 Seat.no:16   |4MC21IS162 Seat.no:17  |4MC21IS163 Seat.no:18  |4MC21IS164 Seat.no:19  |4MC21IS165 Seat.no:20  |
        4MC21IS166 Seat.no:21   |4MC21IS167 Seat.no:22  |4MC21IS168 Seat.no:23  |4MC21IS169 Seat.no:24  |4MC21IS170 Seat.no:25  |
        4MC21IS171 Seat.no:26   |4MC21IS172 Seat.no:27  |4MC21IS173 Seat.no:28  |4MC21IS174 Seat.no:29  |4MC21IS175 Seat.no:30  |
        4MC21IS176 Seat.no:31   |4MC21IS177 Seat.no:32  |4MC21IS178 Seat.no:33  |4MC21IS179 Seat.no:34  |4MC21IS180 Seat.no:35  |
        =========================================================================================================================
        
        
        =========================================================================================================================
        |Room:Audi|
        
        4MC21IS241 Seat.no:1    |4MC21IS242 Seat.no:2   |4MC21IS243 Seat.no:3   |4MC21IS244 Seat.no:4   |4MC21IS245 Seat.no:5   |
        4MC21IS246 Seat.no:6    |4MC21IS247 Seat.no:7   |4MC21IS248 Seat.no:8   |4MC21IS249 Seat.no:9   |4MC21IS250 Seat.no:10  |
        4MC21IS251 Seat.no:11   |4MC21IS252 Seat.no:12  |4MC21IS253 Seat.no:13  |4MC21IS254 Seat.no:14  |4MC21IS255 Seat.no:15  |
        4MC21IS256 Seat.no:16   |4MC21IS257 Seat.no:17  |4MC21IS258 Seat.no:18  |4MC21IS259 Seat.no:19  |4MC21IS260 Seat.no:20  |
        4MC21IS261 Seat.no:21   |4MC21IS262 Seat.no:22  |4MC21IS263 Seat.no:23  |4MC21IS264 Seat.no:24  |4MC21IS265 Seat.no:25  |
        4MC21IS266 Seat.no:26   |4MC21IS267 Seat.no:27  |4MC21IS268 Seat.no:28  |4MC21IS269 Seat.no:29  |4MC21IS270 Seat.no:30  |
        4MC21IS271 Seat.no:31   |4MC21IS272 Seat.no:32  |4MC21IS273 Seat.no:33  |4MC21IS274 Seat.no:34  |4MC21IS275 Seat.no:35  |
        4MC21IS276 Seat.no:36   |4MC21IS277 Seat.no:37  |4MC21IS278 Seat.no:38  |4MC21IS279 Seat.no:39  |4MC21IS280 Seat.no:40  |
        4MC21IS281 Seat.no:41   |4MC21IS282 Seat.no:42  |4MC21IS283 Seat.no:43  |4MC21IS284 Seat.no:44  |4MC21IS285 Seat.no:45  |
        4MC21IS286 Seat.no:46   |4MC21IS287 Seat.no:47  |4MC21IS288 Seat.no:48  |4MC21IS289 Seat.no:49  |4MC21IS290 Seat.no:50  |
        4MC21IS291 Seat.no:51   |4MC21IS292 Seat.no:52  |4MC21IS293 Seat.no:53  |4MC21IS294 Seat.no:54  |4MC21IS295 Seat.no:55  |
        4MC21IS296 Seat.no:56   |4MC21IS297 Seat.no:57  |4MC21IS298 Seat.no:58  |4MC21IS299 Seat.no:59  |4MC21IS300 Seat.no:60  |
        =========================================================================================================================
        =========================================================================================================================</p></PRE>




<h1>Phase02: Final Project🚀</h1>
<h2>Database: MySql </h2>
<h5 italic >We chose MySql database to store our college data since we felt it is bit easier comapered to other databses and we avoided giving user inputs after we realised it becomes so time consuming and spoils user experience of staffs</h5>

<h3>Tables</h3>
<PRE><p>+------------------------+
| Tables_in_mce_database |
+------------------------+
| courses                |
| department             |
| faculty                |
| rooms                  |
| student                |
+------------------------+</p></PRE>

<h3>Database Table Description</h3>
<PRE><p>
mysql> desc courses;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| Course_Code | varchar(10) | NO   | PRI | NULL    |       |
| Course_Name | varchar(40) | YES  |     | NULL    |       |
| Department  | int         | YES  | MUL | NULL    |       |
| Semester    | int         | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+

mysql> desc department;
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| DepartmentID | int          | NO   | PRI | NULL    |       |
| Name         | varchar(100) | YES  |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+

mysql> desc faculty;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| FacultyID  | varchar(15) | NO   | PRI | NULL    |       |
| Department | int         | YES  | MUL | NULL    |       |
| Name       | varchar(40) | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+

mysql> desc rooms;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| RoomNo     | varchar(15) | NO   | PRI | NULL    |       |
| Department | int         | YES  | MUL | NULL    |       |
| Capacity   | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+

mysql> desc student;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| USN        | varchar(20) | NO   | PRI | NULL    |       |
| Department | int         | YES  | MUL | NULL    |       |
| Semester   | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
</p></PRE>

<h2>Java Program and APIs</h2>

<PRE><p> 
The code begins with a series of import statements that import necessary classes and packages for JDBC (Java Database Connectivity) and iTextPDF, which is a library used for creating PDF documents in Java.
The code specifies the path (C:\\Users\\Dell\\Desktop\\PDFfile\\open.pdf) where the PDF file will be created and creates a Document object to represent the PDF document. It then opens the document using document.open().The code establishes a connection to a MySQL database using JDBC. It specifies the database URL, database name, username, and password.

Room Counting:The code executes a query to count the number of rooms (rooms table) in the database and fetches their names and capacities.
Main Database Operations:Within a loop over departments, the code fetches courses and students data from the database, then performs the following tasks for each course:Selects students who have chosen the course.Iterates over rooms and assigns seats to students, creating a list of students and their allocated seats.Writes the student and seat information to the PDF document.
Exception Handling:The code includes a try-catch block to catch any exceptions that might occur during database connection or query execution. If an exception occurs, it prints the stack trace and displays an error message using JOptionPane.
Closing Resources:Finally, the code closes the PDF document and handles any exceptions that might occur during the process.
</p></PRE>

![Flow](Input (1).png)
![Flow](images/Input (1).png)


