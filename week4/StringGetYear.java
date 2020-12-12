import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringGetYear {
    public static String getYear(String str){

        Pattern compile = Pattern.compile("[0-9]{4}");
        Matcher matcher = compile.matcher(str);
        String yearStr = null;
        if (matcher.find()){
            yearStr = matcher.group(0);
        }
        String year = yearStr.toString();
        return year;
    }

    public static void main(String[] args) {
        try {

            String year = StringGetYear.getYear("oooooo99oo");
            System.out.println(year);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}

