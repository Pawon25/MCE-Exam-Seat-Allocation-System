/**
 A rough code of our logic implementation. The data we are using here in array is just to show that the distribution is performing through this code
 We will be using a database to store the large college database through which exam coordinator gives excel for feeding data
 */
public class FirstPhase {
    public static void main(String[] args) {
        System.err.println("Welcome");
        
        String[] examrooms={"SA101","SA102","AB201","AB202","CRB1","CRB2","ME101","ME102","Audi"};
        int[] capacity={30,30,25,25,35,35,30,30,60};
        int[] available={0,0,1,1,1,1,0,0,1};
        //Printing the exam room data
        System.out.println("\n");
        System.out.println("-------------------------------------------");
        System.out.println("RoomName"+"\t"+"Capacity"+"\t"+"Availability");
        System.out.println("-------------------------------------------");
        for(int i=0;i<examrooms.length;i++){
            System.out.print(examrooms[i] +"\t|\t"+capacity[i]);
            //Checking whether rooms are available or not
            if(available[i]==0){System.out.println("\t|\tNAN");}
            else{System.out.println("\t|\tAvailable");}
        }
        System.out.println("-------------------------------------------");
        
        String[] Course={"IS501","IS502","IS503","IS504","IS505"};
        int[] Opted={40,40,41,40,39};
        System.out.println("-------------------------------------------");
        System.out.println("CourseName"+"\t\t"+"No of Students");
        System.out.println("-------------------------------------------");
        for(int i=0;i<Course.length;i++){
            System.out.print(Course[i] +"\t\t|\t"+Opted[i]+"\t\t\t\n");
        }
        System.out.println("-------------------------------------------");

        int USN=01;
        int classno=0;
        for(classno=0;classno<examrooms.length;classno++){
            System.out.println("\n");
            System.out.println("=========================================================================================================================");
            System.out.println("|Room:"+examrooms[classno]+"|\n");

            for(int cap=0;cap<capacity[classno];cap++){
                if(cap%5==0 & cap!=0){
                    //Goes to new line at evry 5 entries: Just for better view
                    System.out.print("\n");
                }
                System.out.print("4MC21IS"+ USN++ +" Seat.no:"+(cap+1)+"\t|");
            }
            System.out.println();
            System.out.println("=========================================================================================================================");
        }
            System.out.println("=========================================================================================================================");
    }
    
}