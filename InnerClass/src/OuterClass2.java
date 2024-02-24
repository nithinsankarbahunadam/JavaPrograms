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
}
