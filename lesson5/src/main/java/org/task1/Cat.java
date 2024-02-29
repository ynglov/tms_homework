package org.task1;

public class Cat {
    public String name;
    public int age;
    public String catBreed;

    public Cat(String name, int age, String catBreed) {
        this.name = name;
        this.age = age;
        this.catBreed = catBreed;
    }

    public Cat(String name, int age) {
        this(name, age, "no breed");
    }
    public void showCat(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(catBreed);
    }
    public String newName(String name){
        this.name = name;
        return this.name;
    }
}
