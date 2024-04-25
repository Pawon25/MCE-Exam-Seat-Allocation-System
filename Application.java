import java.sql.*;

import javax.swing.JOptionPane;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class Application {
    @SuppressWarnings("unused") //* Used just o ignore any unused variables */
   
    
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        
        String File="C:\\Users\\Dell\\Desktop\\PDFfile\\open.pdf";

            Document document=new Document();

            PdfWriter.getInstance(document, new FileOutputStream(File));

            document.open();
        try {
            String url = "jdbc:mysql://localhost:3306/";
//!Connection establishment
            String databaseName = "mce_database";
            String userName = "root";
            String password = "pavan";    
            Connection connection = DriverManager.getConnection(url,userName, password);
            JOptionPane.showMessageDialog(null, "Database Connected \n(‾◡◝)\n", "Hey Pavan, new update⚠️", JOptionPane.INFORMATION_MESSAGE);
//!MySql connection done
Statement statement = (Statement) connection.createStatement();
String query = "Use "+databaseName;
statement.execute(query);
System.out.println("\n\n\n"+"Connected to "+databaseName +"\n\n\n");
//!DB seclected

// ?----------------------------------------------------------------------------------

//!Room counting 
Statement roomstatement=connection.createStatement();
int count=0;
String countquery="SELECT COUNT(*) FROM rooms";
ResultSet Countresultset=roomstatement.executeQuery(countquery);
while (Countresultset.next()) {
    count=Countresultset.getInt(1);
}

int[] roomcapacity=new int[count];
String[] roomname=new String[count];
String roomquery= "Select * from rooms";
ResultSet roomresultset=roomstatement.executeQuery(roomquery);
int i=0;
while (roomresultset.next()) {
    roomname[i]=roomresultset.getString(1);
    roomcapacity[i]=roomresultset.getInt(3);
    i++;
}
//!Rooms data fetched
// ?----------------------------------------------------------------------------------
//* Setting room tracking variables
int tillroomalloted=0;

// !Creating an arraylist for to store usn
ArrayList<String> SelectedUSN=new ArrayList<>();
// !--------------------------------------

            query= "select * from department";
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()) {
                int depno=resultSet.getInt(1);
                String depname=resultSet.getString(2);
                System.out.println(depno+"\t"+depname+"\n");

                //!Selecting Courses of particular department
                Statement StatementCourse=connection.createStatement();
                String courquery = "select * from courses where department="+depno;
                ResultSet courqueryresultset=StatementCourse.executeQuery(courquery);
                while (courqueryresultset.next()) {
                    String courseid=courqueryresultset.getString(1);
                    String coursename=courqueryresultset.getString(2);
                    System.out.println("Course Code: "+courseid+"\n");
                    document.newPage();
                    Paragraph Seperator=new Paragraph("==========================================================================");
                    document.add(Seperator);
                    Paragraph pdfparacourse=new Paragraph("Course Code: "+courseid);
                                    document.add(pdfparacourse);
                    pdfparacourse=new Paragraph("______________________________________________________________________________");
                    document.add(pdfparacourse);
                    pdfparacourse=new Paragraph("Course Name: "+coursename);
                                    document.add(pdfparacourse);                    
                    pdfparacourse=new Paragraph("______________________________________________________________________________");
                                    document.add(pdfparacourse);
                //!Selecting Students who have chose course in that department 
                    Statement StatementStudent=connection.createStatement();
                    String Stuquery = "select * from student,courses where student.semester=courses.semester and student.department=" +depno+ " and courses.Department="+depno;
                    Stuquery = "SELECT student.USN,  student.semester, student.department, courses.course_name, courses.semester AS course_semester FROM student JOIN courses ON student.semester = courses.semester and student.department = courses.department WHERE student.department ="+depno+ " AND courses.Department = " +depno+" GROUP BY student.USN, student.semester, student.department, courses.course_name, courses.semester;";

                    String countingStudents="SELECT COUNT(*) FROM student, courses WHERE student.semester = courses.semester AND student.department = "+depno+  "AND courses.department = student.department and course_code="+ courseid;
                    

                    ResultSet Stuqueryresultset=StatementStudent.executeQuery(Stuquery);
                    while (Stuqueryresultset.next()) {
                        String USN=Stuqueryresultset.getString(1);
                            SelectedUSN.addLast(USN);  
                            }
                            int USNindex=0;
                            for (int roompointer = 0; roompointer < roomname.length; roompointer++) {
                                System.out.println("-------------------------------------------------------------");
                                System.out.println("RoomName:"+roomname[roompointer]+"\t\t"+courseid);
                                
                                pdfparacourse=new Paragraph(" ");
                                document.add(pdfparacourse);
                                document.add(pdfparacourse);
                                document.add(pdfparacourse);
                                pdfparacourse=new Paragraph("Room Name: " +roomname[roompointer]);
                                document.add(pdfparacourse);

                                pdfparacourse=new Paragraph("----------------------------------------------------------------------------------------------------------------------------------");
                                document.add(pdfparacourse);

                                for(int seatpointer=1; seatpointer<roomcapacity[roompointer];seatpointer=seatpointer+1){
                                    System.out.print(SelectedUSN.get(USNindex++)+"\tSeat.no"+seatpointer+"\t\t\t\t");
                                    tillroomalloted++;
                                    String pdfword=SelectedUSN.get(USNindex-1)+"  Seat.no: "+seatpointer+"                                                  "+SelectedUSN.get(USNindex)+"  Seat.no: "+ ++seatpointer;
                                    String spacingfor_singledigit=SelectedUSN.get(USNindex-1);

                                    if(seatpointer<10){
                                        seatpointer--;
                                    pdfword=SelectedUSN.get(USNindex-1)+"  Seat.no: " + seatpointer + "                                                     "+SelectedUSN.get(USNindex)+"  Seat.no: "+ ++seatpointer;
                                    }

                                    Paragraph pdfpara=new Paragraph(pdfword);
                                    document.add(pdfpara);
                                    if(seatpointer%2==0){
                                        System.out.println();
                                    }
                                    USNindex++;
                                }
                                if (USNindex>SelectedUSN.size() || tillroomalloted>roomname.length) {
                                    break;
                                }
                            }
                        }
                        
                        
                    }
                    document.close();

        } catch (Exception e) {
            // TODO: handle exception 
            //* This section activates only when the mce_databse is not connected to JDBC API or QueryErrors
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There is a database connection issue or Query Error \n( ＞﹏＜ )\n Please check the login credentials", "Hey Pavan, new update⚠️", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}