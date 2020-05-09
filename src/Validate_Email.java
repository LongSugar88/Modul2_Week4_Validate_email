import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Email {
    Pattern pattern;
    Matcher matcher;
    final String REGEX = "^[0-9a-zA-Z]+[0-9a-zA-Z]*@[0-9a-zA-Z]+\\.[0-9a-zA-Z]+$";

    Validate_Email(){
        pattern = Pattern.compile(REGEX);
    }

    boolean validateEmail(String something){
        matcher = pattern.matcher(something);
        return matcher.matches();
    }
    String result(boolean isAvailible){
        if(isAvailible){
            return "valid Email";
        } else
            return "invalid Email";
    }
}
