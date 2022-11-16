class Car {
    public int year;
    public String make;
    public String model;
    public String color;
}

class Vehicle {
    private int numberOfWheels;
    private String color;
    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String color) {
        this.color = color;        // 1
    }
}

class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }
    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}