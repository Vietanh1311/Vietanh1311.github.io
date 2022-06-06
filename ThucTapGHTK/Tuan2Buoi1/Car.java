package Tuan2Buoi1;

public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheel=" + wheel + "]";
    }
    

}
