package DuckCase.Behavior.Impl;

import DuckCase.Behavior.QuackBehavior;

/**
 * @author tzx
 * @date 2021/8/1
 * @description
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!");
    }
}
