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
public class Lion extends Animal implements Predator {

    @Override
    public String hunt() {
         return "Lion hunting gazelle";
    }
    
    @Override
    public String getName(){
        return "Lion";
    }
    
    @Override
    public String talk(){
        return "Roar";
    }
    
}
