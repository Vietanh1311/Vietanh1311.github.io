package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import java.util.Optional;

import com.example.demo.Model.Car;

import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
    private ArrayList<Car> cars;

    public CarDao() {
        cars = new ArrayList<Car>(List.of(new Car(1, "Vios", "Nhật", 200, 1200,
                "https://sieuthioto.org/wp-content/uploads/2020/08/xe-toyota-vios-2021.jpg"),
                new Car(2, "Ford", "Mỹ", 400, 700,
                        "https://cdn.baogiaothong.vn/files/tung.le/2018/08/25/124341-a8877edb-third-gen-ford-ecosport-render-1.jpg"),
                new Car(3, "Vinfast", "Việt Nam", 200, 1000,
                        "https://img.websosanh.vn/v10/users/review/images/g3bzha4icws7z/1555576009364_7672008.jpg?compress=85"),
                new Car(4, "Mazda", "Đức", 500, 1500,
                        "https://tuvanmuaxe.vn/upload/upload_img/images/mazda-3-2019-sedan-tuvanmuaxe-2.jpg")));
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public Optional<Car> get(Integer id) {
        return cars.stream().filter(car -> car.getId().equals(id)).findFirst();
    }

    public void add(Car t) {
        Optional<Car> car = get(t.getId());
        if (!car.isPresent()) {
            cars.add(t);
        }
    }
    public void update(Car t) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId().equals(t.getId())) {
                cars.set(i, t);
            }
        }
    }
    public void deleteByID(Integer id) {
        Optional<Car> car = get(id);
        if (car.isPresent() && cars.size() >= 1) {
            cars.remove(car.get());
        }
    }
    public List<Car> searchModel(String str) {
        ArrayList<Car> array = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getModel().indexOf(str) != -1) {
                array.add(cars.get(i));
            }
        }
        return array;
    }


}
