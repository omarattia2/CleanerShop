
import java.util.Scanner;
public class Cleaining {
    /*** the class is for the client information ***/


    private String cName, cAddress, date; /* c to client */
    private static int numberOFclients;
    private int cAge;
    private int cid;

    public Cleaining() {
        cid = 0000;
        cName = "xxxxxx";
        cAddress = "cccccccc";
        date = "00/00/0000 ";
        numberOFclients++;
    }

    public Cleaining(int id1, String n1, String A1, String d1) {
        cid = id1;
        cName = n1;
        cAddress = A1;
        date = d1;
        numberOFclients++;

    }

    public void setCleaining(int id1, String n1, String A1, String d1) {
        cid = id1;
        cName = n1;
        cAddress = A1;
        date = d1;

    }

    public void setId (int id1){
        cid = id1 ;
    }
    public int getId (){
        return cid ;
    }

    public static Cleaining getCleaining () {
        int id1;
        String  n1;
        String A1;
        String d1;
        Scanner Client_info = new Scanner(System.in);
        System.out.println("Enter your Id : ");
        id1 = Client_info.nextInt();

        System.out.println("Enter your Name: ");
        n1 = Client_info.nextLine();
        n1 = Client_info.nextLine();

        System.out.println("Enter your Address: ");
        A1 = Client_info.nextLine();

        System.out.println("Enter your datee like (02/09/1999) " );
        d1 = Client_info.nextLine();
        return new Cleaining(id1,n1,A1,d1);

    }

    public void cPrint() {
        System.out.println("ID: " + cid + ", NAME: " + cName + ", Address: " + cAddress + ", The day: " + date);
    }



    public static int numberOFclients() {
        return numberOFclients;
    }



}
