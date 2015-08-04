/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.strategy;

/**
 *
 * @author User
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
       
}
