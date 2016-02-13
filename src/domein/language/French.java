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
public class French implements Language{
    @Override
    public String getMessage(String speler) {
        return "Welcome " + speler + "! Pour commancé à jouer, clique sür jouer.";
    }

    @Override
    public String askName() {
        return "Comment tu t'appelle?";
    }
}
