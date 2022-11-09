package Lesson12;

// Неправильное использование интерфейсов
class Lorry extends Car implements Stopable,Moveable {

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }

    // Необходимо переопределить метод
    @Override
    void open() {
        System.out.println("Car is open");
    }
}
