//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle ATV = new Vehicle(45,3);

        Bicycle BSA = new Bicycle(30 ,10);

        System.out.println(ATV);

        System.out.println(BSA);


        Vehicle[] veharra = new Vehicle[3];

        veharra[0]= new Bicycle(30,10);
        veharra[1]= new Bicycle(45,3);
        veharra[2] = new Vehicle(60,4);

        for (int i=0; i<3; i++) System.out.println(veharra[i]);
        
        System.out.println("Changing array type to object");

        Object[] vehObj = new Object[3];

        vehObj[0]= new Bicycle(30,10);
        vehObj[1]= new Bicycle(45,3);
        vehObj[2] = new Vehicle(60,4);

        for (int i=0; i<3; i++) System.out.println(vehObj[i]);

        System.out.println("Changing the array type to bicycle");

        Bicycle[] vehBic = new Bicycle[3];

        vehBic[0]= new Bicycle(30,10);
        vehBic[1]= new Bicycle(45,3);
        vehBic[2] = (Bicycle) new Vehicle(60,4);

        for (int i=0; i<2; i++) System.out.println(vehBic[i]);
        Bicycle bicycle = (Bicycle) vehBic[2];
        System.out.println(bicycle);






    }
}