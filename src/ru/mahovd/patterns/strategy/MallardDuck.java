/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.strategy;

/**
 *
 * @author User
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
    
}
