package javaEight.newFeatures;

// Sealed classes are used to restrict the inheritance of a class
// only the permitted classes can extend the sealed class
// it also works with interfaces
sealed class Animal permits Cat, Dog, Lion {

}

final class Cat extends Animal {

}

final class Dog extends Animal {

}

final class Lion extends Animal {

}

public class SealedDemo {

    public static void main(String[] args) {

    }
}
