package Tuan2Buoi1;

public class App {
    public static void main(String[] args) {
        Wheel michelin = new MichelinWheel();
        Wheel ordinary = new OrdinaryWheel();
        Engine diesel = new DieselEngine();
        Engine gasoLine = new GasolineEngine();

        Car luxuryCar = new Car(michelin, gasoLine); // khởi tạo luxury Car được trang bị bánh michilin và động cơ
                                                     // gasoline
        Car usedCar = new Car(ordinary, diesel); // khởi tạo used Car được trang bị bánh ordinary và động cơ diesel

    }
}
