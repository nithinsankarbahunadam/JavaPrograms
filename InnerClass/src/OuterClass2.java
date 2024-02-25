public class OuterClass2 {
    protected String FirstName;

    protected int personage;

    public OuterClass2(String FirstName, int personage){

        this.FirstName=FirstName;

        this.personage=personage;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getPersonage() {
        return personage;
    }

    public void setPersonage(int personage) {
        this.personage = personage;
    }

    public void WhichClassThis(){
        System.out.println("This is Outerclass which has static innerclass");
    }

    public static class InnerStatiClass{

        String surname;

        int personAge;

        public InnerStatiClass(String surname, int personAge){
            this.surname=surname;
            this.personAge=personAge;

        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getPersonAge() {
            return personAge;
        }

        public void setPersonAge(int personAge) {
            this.personAge = personAge;
        }

        public void WhichClassThis(){
            System.out.println("This is static innerclass");
        }
    }
}
