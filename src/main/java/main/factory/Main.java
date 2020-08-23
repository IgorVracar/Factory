package main.factory;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
                Car auto1 = new Car();
        auto1.model = "Audi";
        auto1.buildYear = 2003;
        auto1.ccm = 2000;
        
        System.out.println("Model automobila 1 je: " + auto1.model);
             
         Car auto2 = new Car();
         auto2.model = "Fiat";
         auto2.buildYear = 2019;
         
        System.out.println("Model automobila 2 je: " + auto2.model);
        
        Car lada = new Car();
        lada.model = "Lada Niva";
        
        Car mazda = new Car();
        lada.model = "Mazda 3";
    }
    
}
