import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            System.out.println("              welcom to our cleaner shop         ");
            System.out.println("          ---------------------------------       ");
            System.out.println("our prices are :\n" +"1-cleaning larg rooms from (min 65m ) cost :35 $");
            System.out.println("2-cleaning small rooms from ( max 60m ) cost :25 $\n"+"3-Taxes : 6%");
            System.out.println("          ---------------------------------       ");
            System.out.println("we need from you to give us some information ");
            System.out.println("          ---------------------------------       ");
            Scanner Client_info = new Scanner(System.in); /*** this code for the client information (to put in). ***/
                int id1;
                String n1, A1 , d1 ;
                     System.out.println("Enter your Id : ");
                         id1 = Client_info.nextInt();

                     System.out.println("Enter your Name: ");
                        n1 = Client_info.nextLine();
                         n1 = Client_info.nextLine();

                    System.out.println("Enter your Address: ");
                         A1 = Client_info.nextLine();

                      System.out.println("Enter your datee like (02/09/1999) " );
                         d1 = Client_info.nextLine();                                         /**** end of scan code ***/

                    Cleaining c1 = new Cleaining(id1,n1,A1,d1 );                         /**** puting the scane information to use ****/
                       c1.cPrint();
            System.out.println("*************************");
            System.out.println("*"+" The Clients Number :"+Cleaining.numberOFclients()+" *");
            System.out.println("*************************");
            System.out.println("");

            Rooms_info tax = new Rooms_info() ;
            Cleaining2 c11 = new Cleaining2() ;

            Scanner LargRoomN = new Scanner(System.in);  /***  the clieant make the amount of larg rooms he,she want to clean *******/
            int N1;
            System.out.println("Enter Amount of Larg Rooms:");
            N1 = Client_info.nextInt();
                  c11.setLroomsN(N1);

            Scanner smallRoomN = new Scanner(System.in);   /***  the clieant make the amount of small rooms he,she want to clean *******/
            int N2;
            System.out.println("Enter Amount of Small Rooms: ");
            N2 = Client_info.nextInt();
                 c11.setSroomsN(N2);


                        System.out.println("the taxes are : "+tax.getTax()+"%" );
                             System.out.println("-------");
                        c11.rPrintN();
                             System.out.println("-------");

                         System.out.println("the Total larg rooms cost : " +  c11.getLroomsch() );
                          System.out.println("the Total small rooms cost : " +  c11.getSroomsch() );
                              System.out.println("==============");
                          System.out.println("The larg and small rooms cost : " +  c11.getL_sRoomCost() );
                           System.out.println("The total cost  with taxes : " +  c11.Total() );
                              System.out.println("==============");


            Cleaining c2 = new Cleaining( );
            c2.getCleaining( );
            c2.cPrint();
            System.out.println("*************************");
            System.out.println("*"+" The Clients Number :"+Cleaining.numberOFclients()+" *");
            System.out.println("*************************");
            System.out.println("");

            Cleaining2 c3 = new Cleaining2() ;
            c3.setLroomsN(2);
            c3.setSroomsN(3);

            System.out.println("-------");
            c11.rPrintN();
            System.out.println("-------");

            System.out.println("the Total larg rooms cost : " +  c11.getLroomsch() );
            System.out.println("the Total small rooms cost : " +  c11.getSroomsch() );
            System.out.println("==============");
            System.out.println("The larg and small rooms cost : " +  c11.getL_sRoomCost() );
            System.out.println("The total cost with taxes : " +  c11.Total() );
            System.out.println("==============");









        }


}
