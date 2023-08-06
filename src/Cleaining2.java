public class Cleaining2 extends Rooms_info{
    /**** this class to make the calcoulation of any other mathoud ****/

   private  double TaxRat2 = 0.06;
   private double  l_sRoomCost , total ,l_rooms_ch , s_rooms_ch;
    private int l_rooms_n, s_rooms_n;
    private double l_rooms_co = 35 ;
    private double s_rooms_co = 25  ;
    private static int numberOFclients;

    public void setL_sRoomCost(double Ls_r_ch1) {
        l_sRoomCost = Ls_r_ch1;
    }
    public void setLroomsN(int l_r_n1) {

        l_rooms_n = l_r_n1;
    }
    public int getLroomsN (){
        return l_rooms_n;
    }
    public void setSroomsN(int s_r_n1) {
        s_rooms_n = s_r_n1;
    }
    public double getLroomsch() {
        l_rooms_ch = l_rooms_co * l_rooms_n ;
        return l_rooms_ch;
    }
    public double getSroomsch() {
        s_rooms_ch = s_rooms_co * s_rooms_n ;
        return s_rooms_ch;
    }
    public double getL_sRoomCost() {
       l_sRoomCost = l_rooms_ch + s_rooms_ch ;

        return l_sRoomCost;
    }

    public double Total (){
        total = (getL_sRoomCost() * TaxRat2)+getL_sRoomCost();

        return total;
    }
    public static int numberOFclients() {
        return numberOFclients;
    }

    public void rPrintN()  /**** rPrintN = Rooms print Number ****/
    {
        System.out.println("the Number of Large rooms: " + l_rooms_n + " rooms" + "\n" + "the number of small rooms: " + s_rooms_n + " rooms");
    }

}

