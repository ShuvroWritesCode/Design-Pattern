public class DuckFactory {

    public Duck createDuck(String type) {
        Duck duck;

        switch (type) {
            case "MallardDuck":
                duck = new MallardDuck();
                break;
            case "RedheadDuck":
                duck = new RedheadDuck();
                break;
            case "RubberDuck":
                duck = new RubberDuck();
                break;
            case "Goose":
                Goose goose = new Goose();
                duck = new GooseAdapter(goose);
                break;
            default:
                duck = new DecoyDuck();
                break;
        }

        return duck;
    }
}
