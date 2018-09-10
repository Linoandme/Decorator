public class Main {
    public static void main(String[] args){
        ConcreteComponent c =new ConcreteComponent();
        ConcreteDecoratorA ca=new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();
        /*
        * 装饰方法是：
        * 首先用ConcreteComponent实例化对象C
        * 然后用ConcreteDecoratorA的实例化对象ca来包装从C
        * 再用ConcreteDecoratorB的实例化对象cb来包装ca
        * 最终执行cb的Operation
        * */
        ca.setComponent(c);
        cb.setComponent(ca);
        cb.Operation();
    }
}
