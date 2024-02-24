//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //the below example is for non-static innerclass

        OuterClass outer1 = new OuterClass("Nithin" , 23); //created an instance of outerclass


        //As inner class is non-static we much initiate using the instance of outer class

        //the type will be OuterClass.InnerClass

        OuterClass.InnerClass outerinner1 = outer1.new InnerClass();



    }
    }
}