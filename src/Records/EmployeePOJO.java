package Records;

/*
A sample Employee class that demonstrates POJO features

 */

public class EmployeePOJO {


        // Member variables of this class
        private String firstName;
        private String lastName;
        private int Id;

        // Constructor of this class
        public EmployeePOJO(String firstName, String lastName,
                        int Id)
        {

            this.firstName = firstName;
            this.lastName = lastName;
            this.Id = Id;
        }

        // Setter-getter Method 1
        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        // Setter-getter Method 2
        public String getFirstName() { return firstName; }

        // Setter-getter Method 3
        public void setLastName(String lasstName)
        {

            this.lastName = lastName;
        }

        // Setter-getter Method 3
        public String getLastName() { return lastName; }

        // Setter-getter Method 4
        public void setId(int Id) { this.Id = Id; }

        // Setter-getter Method 5
        public int getId() { return Id; }

        // Setter-getter Method 6
        public String toString()
        {
            return "Employee [firstName=" + firstName
                    + ", lastName=" + lastName + ", Id=" + Id + "]";
        }

        // Method 7
        // Overriding hashCode method
        @Override public int hashCode()
        {

            final int prime = 31;
            int result = 1;

            result = prime * result + Id;
            result = prime * result
                    + ((firstName == null)
                    ? 0
                    : firstName.hashCode());
            result
                    = prime * result
                    + ((lastName == null) ? 0
                    : lastName.hashCode());

            return result;
        }

        // Method 8
        // Overriding equals method to
        // implement with data structures
        @Override public boolean equals(Object obj)
        {

            // This refers to current instance itself
            if (this == obj)
                return true;

            if (obj == null)
                return false;

            if (getClass() != obj.getClass())
                return false;

            EmployeePOJO other = (EmployeePOJO)obj;

            if (Id != other.Id)
                return false;

            if (firstName == null) {
                if (other.firstName != null)
                    return false;
            }

            else if (!firstName.equals(other.firstName))
                return false;

            if (lastName == null) {
                return other.lastName == null;
            }

            else return lastName.equals(other.lastName);
        }
    }


