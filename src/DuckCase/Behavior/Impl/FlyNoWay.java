package DuckCase.Behavior.Impl;

import DuckCase.Behavior.FlyBehavior;

/**
 * @author tzx
 * @date 2021/8/1
 * @description
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can not fly~");
    }
}
