public class LocalInnerClass {

    protected String className;

    protected int number;

    public LocalInnerClass(String className, int number) {
        this.className = className;
        this.number = number;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void showLocalInnerClass() {
        System.out.println("This is a method");

        class ClassLocalInner{

            String localName="This message is from local Inner class";

            public ClassLocalInner(String name){
                this.localName=name;
            }

            public void showMessage(){
                System.out.println("This message is from local Inner class");
            }
        }

        ClassLocalInner localInner1 = new ClassLocalInner("Assign to local Inner");

        localInner1.showMessage();

    }
}
