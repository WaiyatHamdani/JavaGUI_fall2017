/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author 00220682
 */
public class Cat extends Animal {
    @Override
    public String getName(){
        return "Cat";
    }
    @Override
    public String talk(){
        return "Meow";
    }
}
