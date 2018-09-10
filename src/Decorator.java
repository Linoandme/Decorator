public class Decorator implements Component {
    protected Component component;
    //设置Component
    public void setComponent(Component component){
        this.component=component;
    }
    //重写Operation方法，实际执行的是Component的Operation
    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
        }
    }
}
