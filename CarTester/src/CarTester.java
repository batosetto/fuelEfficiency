
public class CarTester {

    
    public static void main(String[] args) {
        Car honda = new Car("Honda", 10, 50);
        Car nissan = new Car("Nissan", 10, 75);
        System.out.println(honda.toString());
        System.out.println(nissan.toString());
        honda.addFuel(40);
        nissan.addFuel(100);
        System.out.println(honda.toString());
        System.out.println(nissan.toString());
        honda.move(40);
        nissan.move(800);
        System.out.println(honda.toString());
        System.out.println(nissan.toString());
    }
    
}
