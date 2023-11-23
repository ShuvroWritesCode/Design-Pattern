public class MallardDuck extends QuackableBeing {
    @Override
    public void quack(){
        notifyObservers();
        System.out.println("Quack Quack from Mallard Duck!");
    }
    @Override
    public void quackSound(){
        System.out.println("Mallard is sounding Quack Quack!");
    }
}