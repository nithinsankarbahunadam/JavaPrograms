
//This class is an example of static class
public class OuterClass {

    protected String name;
    protected int age;

    public OuterClass(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }


    public void whichClassIsThis(){
        System.out.println("This is OuterClass");
    }

    public Class InnerClass{

         public void whoIsThis(){
             System.out.println("This is InnerClass");
        }

    }

}
