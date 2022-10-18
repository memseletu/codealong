public class LiskovSubstituitionPrinciple {
    //states that objects of a superclass should be replaceable with the objects of the subclass without breaking the apllication.
    //what we want is to have the objects of our subclasses behaving the same way as the objects of our superclass.
    // A ChildClass should only extend a ParentClass if we can replace a ParentClass object by a ChildClass object
    // without changing the behavior of the program, otherwise we should use Composition or Delegation

    public static void main(String[] args) {

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();
        ostrich.fly();

        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.greet();
        sparrow.fly();
    }
}
class Bird {

    public void greet() {
        System.out.println("greeting...");
    }

    public void fly() {
        System.out.println("flying...");
    }

}

class Sparrow extends Bird {}

class Ostrich extends Bird {}


//eventhough Ostrich is a bird, it doesnt make sense to have its object being able to fly because it cant.
//see better example below.
class LSP{

    public static void main(String[] args) {

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();

        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}

class Bird1 {

    public void greet() {
        System.out.println("greeting...");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Sparrow1 extends FlyingBird {
}

class Ostrich1 extends Bird {

}


