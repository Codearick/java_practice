public class Inheritance {
    public static void main(String [] args) {
        Fish shark = new Fish();

        shark.eat();
    }
}

//Base class
class Animal{
    String color; 

    void eat(){
        System.out.println("This Animal Eats...");
    }

    void breathe(){
        System.out.println("This Animal Breathes...");
    }
}

//Derived class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims in water...");
    }
}