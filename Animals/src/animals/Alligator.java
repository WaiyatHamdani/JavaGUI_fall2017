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
public class Alligator extends Animal implements Predator {

    @Override // is an overide so the name will come up as Alligator
    public String getName() {
         return "Alligator";
    }

    @Override 
    public String talk() {
        return "Growl";
    }

    @Override
    public String hunt() {
        return "Alligator hunting the water's edge";
    }
    
}
