package case_study.utils;

import case_study.models.Booking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class WriteFileBooking {
    private static final String PATH = "src/case_study/data/booking.csv";

    public static void write(Set<Booking> bookings){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Booking booking: bookings) {
                bufferedWriter.write(booking.writeToCSV());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
