package StringTemplates;

import java.text.MessageFormat;

public class StringTemplatesHowto {
    /*"Greetings {{ name }}!";  //Angular
   `Greetings ${ name }!`;   //Typescript
    $"Greetings { name }!"    //Visual basic
    f"Greetings { name }!"    //Python*/

    public static void main(String[] args) {
        String name= "Sree";
        String message;


        //Traditional ways to format a string!!!

        //concatenation
        message = "Greetings " + name + "!";

        //String.format()
        message = String.format("Greetings %s!", name);	//concatenation

        //MessageFormat
        message = new MessageFormat("Greetings {0}!").format(name);

        //StringBuilder
        message = new StringBuilder().append("Greetings ").append(name).append("!").toString();


        message = STR."Greetings \{ name }!";
        System.out.println(message);
    }

}
