/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.language;

/**
 *
 * @author BelgoBits
 */
public class English implements Language{
    @Override
    public String getMessage(String speler) {
        return "Welcome " + speler + "! To start a new game press the start button.";
    }

    @Override
    public String askName() {
        return "What is you're name?";
    }
    
}
