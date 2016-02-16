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
public class Dutch implements Language{
    @Override
    public String getMessage(String speler) {
        return "Welkom " + speler + "! Om een nieuw spel te starten, druk op start.";
    }

    @Override
    public String askName() {
        return "Hoe heet je?";
    }
    
}
