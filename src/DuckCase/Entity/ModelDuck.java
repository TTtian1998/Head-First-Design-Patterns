package DuckCase.Entity;

import DuckCase.Behavior.Impl.FlyNoWay;
import DuckCase.Behavior.Impl.Quack;

/**
 * @author tzx
 * @date 2021/8/1
 * @description
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
