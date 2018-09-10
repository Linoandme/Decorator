public class ConcreteDecoratorA extends Decorator {
    //本类独有的功能，以区别于ConcreteDecoratorB
    private String addState;


    //首先运行Component的Operation，再执行本类的功能，如addState，相当于对原Component进行了修饰。
    @Override
    public void Operation() {
        super.Operation();
        addState="添加装饰的属性";
        System.out.println("具体装饰对象A的操作");
    }

}
