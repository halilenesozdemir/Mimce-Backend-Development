class Car {
    String color;
    String model;

    void drive(){
        System.out.println("I'm a car");
    }
}


public class Main {
    // Main metodunun asıl amacı işletim sistemi ile iletişime geçmek ve bu metod olmadan programı çalıştıramayız.
    // JDK = JRE + Development Tool
    // Java Runtime Environment(JRE) = JVM + Library Class
    // Write Once Run Everywhere!
    public static void main(String[] args){
        // camelCase
        // Don't repeat yourself!
       // String internetSubeButonu = "İnternet Şubesi";
        //System.out.println(internetSubeButonu);

        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota Corolla";
        myCar.drive();

        float f = 123.21F;
        long a = 232235235235352L;   // Integer number too large.
        // long > int fakat memory'yi mantıklı kullanmak gerekiyor.
        // Numeric Literal ==> 100000, 1_000_000;

    }
}
