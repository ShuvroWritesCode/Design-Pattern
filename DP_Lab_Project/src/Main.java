public class Main {
    public static void main(String[] args) {
        // Creating DuckFactory and CountingDuckFactory instances
        DuckFactory duckFactory = new DuckFactory();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();

        // Creating ducks using DuckFactory
        Duck[] ducks = {
                duckFactory.createDuck("MallardDuck"),
                duckFactory.createDuck("RedheadDuck"),
                duckFactory.createDuck("RubberDuck"),
                duckFactory.createDuck("Goose"),
                duckFactory.createDuck("DecoyDuck")
        };

        // Creating counting ducks using CountingDuckFactory
        Quackable[] countingDucks = {
                countingDuckFactory.createDuck("MallardDuck"),
                countingDuckFactory.createDuck("RedheadDuck"),
                countingDuckFactory.createDuck("Goose"),
                countingDuckFactory.createDuck("DecoyDuck")
        };

        // Creating observers for counting ducks
        QuackObserver observer1 = new QuackObserver(countingDucks[0]);
        QuackObserver observer2 = new QuackObserver(countingDucks[1]);

        // Testing individual duck functionalities
        System.out.println("*** Individual Ducks ***");
        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            System.out.println();
        }

        // Testing counted duck functionalities
        System.out.println("*** Counted Ducks ***");
        for (Quackable countingDuck : countingDucks) {
            countingDuck.quack();
            countingDuck.quack();
            countingDuck.quackSound();
            System.out.println("Number of quacks: " + ((QuackCounter) countingDuck).getQuacks());
            System.out.println();
        }

        // Creating Flock and adding ducks
        Flock flock = new Flock();
        for (Quackable countingDuck : countingDucks) {
            flock.add(countingDuck);
        }

        Flock bigFlock = new Flock();
        bigFlock.add(flock);
        bigFlock.add(countingDucks[0]);
        bigFlock.add(countingDucks[1]);
        bigFlock.add(countingDucks[2]);

        System.out.println("*** Flock Quacking ***");
        flock.quack();

        System.out.println("*** Big Flock Quacking ***");
        bigFlock.quack();
    }
}
