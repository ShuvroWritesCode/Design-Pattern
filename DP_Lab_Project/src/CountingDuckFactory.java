public class CountingDuckFactory {

    public QuackCounter createDuck(String type) {
        QuackCounter quackDuck = null;

        if (type.equals("MallardDuck")) {
            MallardDuck mallardDuck = new MallardDuck();
            quackDuck = new QuackCounter(mallardDuck);
        } else if (type.equals("RedheadDuck")) {
            RedheadDuck redheadDuck = new RedheadDuck();
            quackDuck = new QuackCounter(redheadDuck);
        } else {
            Goose goose = new Goose();
            GooseAdapter gooseAdapter = new GooseAdapter(goose);
            quackDuck = new QuackCounter(gooseAdapter);
        }

        return quackDuck;
    }
}
