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
public interface Language {
    abstract String askName();
    abstract String getMessage(String speler);
}
