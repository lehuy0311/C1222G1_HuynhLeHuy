package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
//    private static final String REGEX_VILLA = "^(SVVL)-\\d{4}$";
//    private static final String REGEX_HOUSE = "^(SVHO)-\\d{4}$";
//    private static final String REGEX_ROOM= "^(SVRO)-\\d{4}$";

    public static boolean validateServiceID(String serviceType, String type) {

        String regex= "";

        if (type.equals("HO")) regex = "^(SVHO)-\\d{4}$";
        else if (type.equals("VL")) regex = "^(SVVL)-\\d{4}$";
        else regex = "^(SVRO)-\\d{4}$";

       // Pattern pattern = Pattern.compile(type.equals("HO") ? REGEX_HOUSE : type.equals("RO") ? REGEX_ROOM : REGEX_VILLA);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(serviceType);
        return matcher.matches();
    }

    public static boolean validateName(String serviceName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNum){
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
    }

    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^\\w+@\\w+.com$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static String parseLocalDateToString(LocalDate date){


        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return simpleDateFormat.format(date);
    }

    public static LocalDate parseStringToLocalDate(String dateInString){
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate result = null;
        try{
            result =  LocalDate.parse(dateInString, simpleDateFormat);
        } catch (DateTimeParseException e){
            // check format of LocalDate but cannot check valid range for dd // MM
            System.out.println("Please fix your DOB format as follows: dd-MM-yyyy (11-01-1990)");
        }
        return result;
    }

    public static boolean checkOverlapBetweenStartAndEndDate(LocalDate startDate, LocalDate endDate){
        return endDate.isAfter(startDate) && startDate.isAfter(LocalDate.now());
    }

    public static boolean checkOverlappedInterval(LocalDate startDate, LocalDate endDate, String serviceID){
        Set<Booking> bookings = ReadFileBooking.read();

//        if((starDate1.isBefore(endDate2LocalDate) || starDate1.equals(endDate2LocalDate))
//                && (endDate1.isAfter(startDate2) || endDate1.equals(startDate2))){

        for (Booking booking:bookings) {
            if(serviceID.equals(booking.getBookingID())){
                if((booking.getStartDate().isBefore(endDate) || booking.getStartDate().equals(endDate))
                        && (booking.getEndDate().isAfter(startDate)) || booking.getEndDate().equals(startDate)){
                    return false;
                }
            }
        }

        return true;
    }
}
