package com.company.animal;

public class Cat {
      int age;
      String name;
      public Cat(int age, String  name) {
            this.age = age;
            this.name = name;
      }
      public Cat() {

      }
      public void setName(String name) {
            this.name = name;
      }
      public String getName() {
            return name;
      }
      public void setAge(int age) {
            this.age = age;
      }
      public int getAge() {
            return age;
      }
}

