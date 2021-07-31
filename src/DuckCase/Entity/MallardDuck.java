package DuckCase.Entity;

import DuckCase.Behavior.Impl.FlyNoWay;
import DuckCase.Behavior.Impl.FlyWithWings;
import DuckCase.Behavior.Impl.Quack;

/**
 * @author tzx
 * @date 2021/8/1
 * @description 绿头鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }


    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
