package com.company.animal;

public class Dog {
      int age;
      String name;
      public Dog (int age, String  name) {
            this.age = age;
            this.name = name;
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
