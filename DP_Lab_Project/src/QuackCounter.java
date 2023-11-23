public class QuackCounter extends QuackableBeing {
    private final Quackable duck;
    private int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.numberOfQuacks = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        this.numberOfQuacks++;
        notifyObservers();
        System.out.println("It has quacked " + this.numberOfQuacks + " times");
    }

    public int getQuacks() {
        return this.numberOfQuacks;
    }

    @Override
    public void quackSound() {
        System.out.println("Mallard is sounding Quack Quack!");
    }
}
