package PatternMatching;

import java.math.BigDecimal;


public class PatternMatchingbeforeJava21 {
    // BEFORE JAVA 21
    static String asStringValue (Object anyValue){
        String result = null;
        if (anyValue instanceof String str) {
            result = str;
        } else if (anyValue instanceof BigDecimal bd) {
            result = bd.toEngineeringString();
        } else if (anyValue instanceof Integer i){
            result = Integer.toString(i);
        } else{
            result = "n/a";
        }
        return result;
    }
    // JAVA 21+
    static String asStringValue2 (Object anyValue){
        boolean b = true;
        return switch (anyValue) {
            case BigDecimal bd ->  bd.toEngineeringString();
            case Integer i -> Integer.toString(i);
            case String s  when s.isEmpty() ->  "empty";


            case String s   ->  s;
            default -> "n/a";

        };
    }


    public static void main(String[] args) {


        BigDecimal bd=new BigDecimal(21);
        System.out.println(asStringValue(bd));
        String s="";
        System.out.println(asStringValue2(s));
    }
}
