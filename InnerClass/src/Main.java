//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //the below example is for non-static inner class

        OuterClass outer1 = new OuterClass("Nithin" , 23); //created an instance of outer class

        outer1.whichClassIsThis();


        //As inner class is non-static we much initiate using the instance of outer class

        //the type will be OuterClass.InnerClass

        OuterClass.InnerClass outerinner1 = outer1.new InnerClass();

        outerinner1.whoIsThis();



        //the below is the example for static inner class

        OuterClass2 outer2 = new OuterClass2("Munna" , 26);

        outer2.WhichClassThis();

        OuterClass2.InnerStatiClass outerinner2 = new OuterClass2.InnerStatiClass("Nikki" , 33);

        outerinner2.WhichClassThis();


    }
}