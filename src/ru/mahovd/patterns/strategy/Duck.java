/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.strategy;

/**
 *
 * @author User
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    
    //Permanent part
    public abstract void display();
    
    //Temporary part, should been incapsulated
    public void performFly(){
        flyBehavior.fly();
    }
    
    //Temporary part, should been incapsulated
    public void performQuack(){
        quackBehavior.quack();
    }
    
    //Permanent  part
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
}
