package case_study.utils;

import case_study.models.Booking;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReadFileBooking {
    private static final String PATH = "src/case_study/data/booking.csv";

    public static Set<Booking> read(){
        Set<Booking> bookings = new LinkedHashSet<>();
        String line = "";
        String[] temp;
        Booking booking;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if(file.length() == 0){
            return bookings;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null){
                    temp = line.split(",");
                    booking = new Booking(temp[0], Utils.parseStringToLocalDate(temp[1]),
                            Utils.parseStringToLocalDate(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5]);
                    bookings.add(booking);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return bookings;
        }
    }
}
