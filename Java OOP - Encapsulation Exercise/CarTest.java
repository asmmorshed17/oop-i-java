
/*
Exercise 8: Car with Speed Control
Create a class Car:
• Private fields: brand (String), speed (int).
• Provide constructors, getters, and setters (speed cannot be negative).
-------------------------------------------------------------------------
• Add methods:
o accelerate(int amount) – increases speed.
o brake(int amount) – decreases speed but not below zero.
o showStatus() – prints brand and current speed.
• In the main method, test accelerating and braking on different cars

*/


class Car {

    // Private fields
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Setting to 0.");
            this.speed = 0;
        }
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }

    // Accelerate
    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            System.out.println(brand + " accelerated by " + amount + " km/h.");
        } else {
            System.out.println("Invalid acceleration amount!");
        }
    }

    // Brake
    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;
            if (speed < 0) {
                speed = 0;
            }
            System.out.println(brand + " slowed down by " + amount + " km/h.");
        } else {
            System.out.println("Invalid brake amount!");
        }
    }

    // Show status
    public void showStatus() {
        System.out.println("Brand: " + brand + ", Current Speed: " + speed + " km/h");
    }
}

// Main class
public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 50);
        Car car2 = new Car("Honda", 80);

        car1.showStatus();
        car1.accelerate(20);
        car1.brake(30);
        car1.showStatus();

        System.out.println();

        car2.showStatus();
        car2.accelerate(50);
        car2.brake(150); // speed should not go below 0
        car2.showStatus();
    }
}


/*
Brand: Toyota, Current Speed: 50 km/h
Toyota accelerated by 20 km/h.
Toyota slowed down by 30 km/h.
Brand: Toyota, Current Speed: 40 km/h

Brand: Honda, Current Speed: 80 km/h
Honda accelerated by 50 km/h.
Honda slowed down by 150 km/h.
Brand: Honda, Current Speed: 0 km/h
 */