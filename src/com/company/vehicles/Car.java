package com.company.vehicles;

public class Car {
       int price;
       String name;
       public Car(int price,String  name) {
              this.price = price;
              this.name = name;
       }
       public void setPrice(int price) {
              this.price = price;
       }
       public int getPrice() {
              return price;
       }
       public void setName(String name) {
              this.name = name;
       }
       public String getName() {
              return name;
       }
}
