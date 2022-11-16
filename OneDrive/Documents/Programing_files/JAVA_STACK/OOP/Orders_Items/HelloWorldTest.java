class CarTest {
    public static void main(String[] args) {
    
        // Create a new car, and assign it some values
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "white";
    
        // Create another new car, and assign it some values
        Car client2Car = new Car();
        client2Car.year = 2018;
        client2Car.make = "Mazda";
        client2Car.model = "CX-3";
        client2Car.color = "navy";

        Car client3Car = new Car();
        client3Car.year = 2012;
        client3Car.make = "Cadillac";
        client3Car.model = "ATS";
        client3Car.color = "Silver";
    
        // Now they have their own individual data stored together.
        System.out.println("Car 1 make: " + client1Car.make);
        System.out.println("Car 1 model: " + client1Car.model);
    
    	System.out.println("Car 2 make: " + client2Car.make);
        System.out.println("Car 2 model: " + client2Car.model);

        System.out.println("Car 3 make: " + client3Car.make);
        System.out.println("Car 3 model: " + client3Car.model);
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        car.setNumberOfWheels(4);
        car.setColor("green");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}
class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Person1");
        Person person2 = new Person(5, "Person2");
        person1.objectMethods(person2);
    }
}