package Records;

public class EmployeeExample1 {
    public static void main(String args[]) {

        // Creating object with default constructor
        EmployeeRecord e1 = new EmployeeRecord(1, "Sree", "Kolati");

        System.out.println(e1.id() + " " + e1.firstName()
                + " " + e1.lastName());

        System.out.println(e1.toString());
    }
}
