package Hotel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class HotelReservationSystem {
    public static void dayofWeek(String date,String Enddate,String type,List<Hotels> hotelsList) {
        //20012000
        Hotels hotels = new Hotels();
        int Startday = Integer.parseInt(date.substring(0, 2));
        int Startmonth = Integer.parseInt(date.substring(2, 4));
        int Startyear = Integer.parseInt(date.substring(4));
        int Endday = Integer.parseInt(date.substring(0, 2));
        int Endmonth = Integer.parseInt(date.substring(2, 4));
        int Endyear = Integer.parseInt(date.substring(4));
//        LocalDate myObj = LocalDate.now(); // Create a date object

        int numberofDays= Startday-Endday;
        for(int i=0;i<=hotelsList.size();i++) {
            // for one hotel
            int rates = 0;
            if (type.equals("Regular")) {
                for (int j = 0; j < numberofDays; j++) {
                    rates = rates + hotels.getRegularRatesforweekDays();
                }
            } else if (type.equals("Rewarded")) {
                for (int j = 0; j < numberofDays; j++) {
                    rates = rates + hotels.getRegularRatesforweekEndDays();
                }
            }
        }
        for(int i=0;i<=hotelsList.size();i++) {
            // for one hotel
            int ratesforsecond = 0;
            if (type.equals("Regular")) {
                for (int j = 0; j < numberofDays; j++) {
                    ratesforsecond = ratesforsecond + hotels.getRegularRatesforweekDays();
                }
            } else if (type.equals("Rewarded")) {
                for (int j = 0; j < numberofDays; j++) {
                    ratesforsecond = ratesforsecond + hotels.getRegularRatesforweekEndDays();
                }
            }

        }

        for(int i=0;i<=hotelsList.size();i++) {
            // for one hotel
            int ratesforthird = 0;
            if (type.equals("Regular")) {
                for (int j = 0; j < numberofDays; j++) {
                    ratesforthird = ratesforthird + hotels.getRegularRatesforweekDays();
                }
            } else if (type.equals("Rewarded")) {
                for (int j = 0; j < numberofDays; j++) {
                    ratesforthird = ratesforthird + hotels.getRegularRatesforweekEndDays();
                }
            }
        }

//            LocalDate Startdate = LocalDate.of(Startyear, Startmonth, Startday);
//            DayOfWeek dayOfWeek = Startdate.getDayOfWeek();
//            int dayofWeekValue = dayOfWeek.getValue();
//            Startday++;

    }
    public static void getCheapHotel(String type, int dayofWeek, List<Hotels> hotels){
        for(int i=0;i<hotels.size();i++){
            int rates=0;
            if(type.equals("regular")){
                if(dayofWeek>=1 && dayofWeek<=5){
//                    hotels
//                    rates=rates[i][0];
                }
            }
        }

    }

}