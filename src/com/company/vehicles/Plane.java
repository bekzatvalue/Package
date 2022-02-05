package com.company.vehicles;

public class Plane {
      int price;
      String name;
      public Plane (int price, String name ) {
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
