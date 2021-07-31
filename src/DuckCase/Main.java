package DuckCase;

import DuckCase.Behavior.Impl.FlyRocketPowered;
import DuckCase.Entity.Duck;
import DuckCase.Entity.MallardDuck;

/**
 * @author tzx
 * @date 2021/8/1
 * @description 策略模式 测试类
 */
public class Main {
    public static void main(String[] args) {
        //针对接口/超类型编程式声明对象。后面可以用工厂模式代替new
        //会飞会叫的绿头鸭
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
        //模型鸭
        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
