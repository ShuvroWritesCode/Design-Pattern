import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock extends QuackableBeing {

    private List<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    public Iterator<Quackable> iterator() {
        return ducks.iterator();
    }

    @Override
    public void quackSound() {
        for (Quackable duck : ducks) {
            duck.quackSound();
        }
    }
}
