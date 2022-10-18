public class InterfaceSegregationPrinciple {
    //client should not be forced to implement an interface that it does not use.
    public static void main(String[] args) {

    }
}

interface Worker {
    void work();
    void sleep();
}

class Human implements Worker {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot implements Worker {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}
//it does not make sense to have the robot worker implementing the sleep() method.
//so the problem can be solved by breaking up the interface into smaller and more specific interfaces.
//example shown below;

interface Worker1 {
    void work();
}

interface Sleeping {
    void sleep();
}

class Human1 implements Worker1, Sleeping {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot1 implements Worker1 {

    @Override
    public void work() {}
}
