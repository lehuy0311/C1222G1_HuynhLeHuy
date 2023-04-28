package more_again.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean validateName(String name){
        Pattern pattern = Pattern.compile("^[A-z][a-z]+");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static  boolean validatePhoneNumber(String phoneNumber){
        Pattern pattern =Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
