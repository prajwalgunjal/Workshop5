package Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Hotel.HotelReservationSystem.dayofWeek;


public class HotelReservationSystemMain {


    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Scanner sc = new Scanner(System.in);
        // 3 hotels and their rates
        String[] hotels ={"lakewood","Bridgewood","RidgeWood"};
        List<Hotels> hotelslist = new ArrayList<>();
        Hotels hotels1 = new Hotels("LakeWood",3, 110,90,80,80);
        Hotels hotels2 = new Hotels("Bridgewood",4,160,60,110,50);
        Hotels hotels3 = new Hotels("RidgeWood",5,220,150,100,40);
        hotelslist.add(hotels1);
        hotelslist.add(hotels2);
        hotelslist.add(hotels3);
        // taking input
        System.out.println("ENter the type(Regular / rewarded)");
        String type =sc.next();
        System.out.println("Enter the Start of booking");
        System.out.println("Enter the End of booking");
        String Startdate =sc.next();
        String EndDate =sc.next();
        System.out.println();


        dayofWeek(Startdate,EndDate,type,hotelslist);
//        int cheapHotel =HotelReservationSystem.getCheapHotel(type,dayofWeek,hotelslist);

    }
}
