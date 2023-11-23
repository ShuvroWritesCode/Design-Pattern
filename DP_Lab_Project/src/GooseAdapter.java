public class GooseAdapter extends QuackableBeing {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        notifyObservers();
        goose.honk();
    }

    @Override
    public void quackSound() {
        System.out.println("Goose is sounding honk honk!");
    }
}
