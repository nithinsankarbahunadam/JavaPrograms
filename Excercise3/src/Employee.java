public class Employee {
    protected int id;

    protected String firstname;

    protected String lastname;

    protected String title;

    protected int salary;

    public Employee(int id, String firstname, String lastname, String title, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.salary = salary;
    }

    public void display(){
        System.out.println("The employee id : " + this.id + " firstname : " + this.firstname + " lastname : " + this.lastname +
                " job title : " + this.title + " and salary : " + this.salary);
    }
}
