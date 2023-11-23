public class RedheadDuck extends QuackableBeing {
    @Override
    public void quack(){
        notifyObservers();
        System.out.println("Quack Quack from Redhead Duck!");
    }
    @Override
    public void quackSound(){
        System.out.println("Redhead Duck is sounding Quack Quack");
    }
}