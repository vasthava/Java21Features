package StringTemplates;

import static java.util.FormatProcessor.FMT;

public class StringTemplatesHighlights {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /* Template Expressions support Variables, Member Fields and Methods */
                StringTemplatesHighlights sth=new StringTemplatesHighlights();
                sth.setName("Sree");
                String name="Sree" ;
                String message;

                //variable
                message = STR."Greetings \{name}!";
                System.out.println(message);

                //method
                message = STR."Greetings \{sth.getName()}!";
                System.out.println(message);

                //field
                message = STR."Greetings \{sth.name}!";
                System.out.println(message);

    /*Arithmetic Operations*/

        int x = 10, y = 20;
        String s = STR."\{x} + \{y} = \{x + y}";
        System.out.println(s);

    /*Double Quotes are Supported without Escape*/

        boolean result = true;  //Can be false also

        String msg = STR."The employee record for \{name} \{result ? "does" : "does not"} exists.";

        System.out.println(msg)    ;




        String jsonBlockWithFMT=interpolationOfJSONBlockWithFMT("1002",35000,"PIC");
        System.out.println(jsonBlockWithFMT);
    }

   static String interpolationOfJSONBlockWithFMT(String  employeeId, float salary, String department) {
        return FMT
                . """
{
"Employee Id": "%1s\{ employeeId }",
"Salary": "%2.2f\{ salary }",
"department": "%1s\{ department }"
}
""" ;
    }

}
