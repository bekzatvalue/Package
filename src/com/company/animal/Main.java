package com.company.animal;

import com.company.gadets.Laptop;
import com.company.gadets.Phone;
import com.company.gadets.Tablet;
import com.company.vehicles.Car;
import com.company.vehicles.Motorcycle;
import com.company.vehicles.Plane;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(6,"Kerry");
        Dog dog = new Dog(3,"Baikash");
        Laptop laptop = new Laptop(35000,"Sumsung");
        Phone phone = new Phone(45000,"Redmi");
        Tablet tablet = new Tablet(1500, "Huawei");
        Car car = new Car(1500000, "Mersedes Benz");
        Motorcycle motorcycle = new Motorcycle(56000,"Yamaha");
        Plane plane = new Plane(2230000, "B-52");

        System.out.println("Dog age : " + cat.age + ", Dog name : " + cat.name);
        System.out.println("Cat age : " + dog.age + ", Cat name : " + dog.name);
        System.out.println( "Laptop price : " + laptop.getPrice() + ", Laptop name " + laptop.getName());
        System.out.println("phone name :" + phone.getName() + ", phone price :" + phone.getPrice());
        System.out.println("Tablet price : " + tablet.getPrice() + ", Tablet name : " + tablet.getName());
        System.out.println("Car price :" + car.getPrice() + ", Car name : " + car.getName());
        System.out.println("Motocycle price : " + motorcycle.getPrice() + ", Motocycle name :" + motorcycle.getName());
        System.out.println("Plane price : " + plane.getPrice() + ", Palne name: " + plane.getName());






    }
}
