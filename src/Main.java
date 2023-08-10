// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Car car=new Car();
    MotorCycle motorCycle=new MotorCycle();

    car.start();

    motorCycle.stop();

    }
}
interface Vehicle{
    abstract void start();
    abstract void stop();

}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
        System.out.println();
    }
}
class MotorCycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle Started");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle Stopped");
        System.out.println();
    }
}