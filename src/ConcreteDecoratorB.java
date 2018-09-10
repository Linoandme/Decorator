public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    //本类独有的方法，区别于ConcreteDecoratorA
    private void AddedBehavior() {
    }
}
