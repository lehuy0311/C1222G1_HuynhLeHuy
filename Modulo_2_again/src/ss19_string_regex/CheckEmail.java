package ss19_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static final String REGEX_EMAIL = "^[A-Za-z0-9]{6,32}@[A-Za-z0-9]{2,12}\\.[A-Za-z0-9]{2,12}$";
    private Pattern pattern;
    private Matcher matcher;

    public static String checkEmail() {
        return REGEX_EMAIL;
    }


}