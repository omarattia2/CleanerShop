public class Rooms_info extends Cleaining {
    /* l represent to larg , s to small , ch to charg , co to cost , n to number , l_s to larg and small */
        /*** this class to get the construction of the Rooms code ***/

    private int l_rooms_n, s_rooms_n , tax = 6;
    private  double l_rooms_ch , s_rooms_ch ;
    private double l_rooms_co = 35 ;
    private double s_rooms_co = 25  ;
    private final double TaxRat2 = 0.06;
    private double  l_sRoomCost , total;

    // this for taxes Rat
    public void setTax (int tax1) {
        tax = tax1;
    }
    public int getTax() {
        return tax;
    }

    // this for rooms number
    public void setLroomsN(int l_r_n1) {
        l_rooms_n = l_r_n1;
    }
    public void setSroomsN (int s_r_n1) {
        s_rooms_n = s_r_n1;
    }
    public int getRoomsN() {
        return l_rooms_n + s_rooms_n;
    }
    public void rPrintN() {
        System.out.println("the Number of Large rooms: " + l_rooms_n + " rooms" + "\n" + "the number of small rooms: " + s_rooms_n + " rooms");
    }

    // this for rooms cost
    public void setLroomsCo (double l_r_co1 ){
        l_rooms_co = l_r_co1 ;
    }
    public void setSroomsCo (double s_r_co1){
        s_rooms_co = s_r_co1 ;
    }

    // this for rooms charg
    public void setLroomsCh(double l_r_ch1) {
        l_rooms_ch = l_r_ch1;
    }
    public double getLroomsch() {

        return 0;
    }
    public void setSroomsCh ( double s_r_ch1) {
        s_rooms_ch = s_r_ch1;
    }

    public double getSroomsch() {

        return 0;
    }
    public double setL_sRoomCost() {


        return 0;
    }
    public double Total (){


        return 0;
    }







}
