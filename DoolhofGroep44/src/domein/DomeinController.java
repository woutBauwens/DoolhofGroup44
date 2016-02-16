/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import domein.language.Dutch;
import domein.language.English;
import domein.language.French;
import domein.language.Language;

/**
 *
 * @author BelgoBits
 */
public class DomeinController {
    private Language taal;
    
    public DomeinController(){
        String test2;
    }
    
    public void maakSpeler(String name){
        if(name.equals("Bart")){
            System.out.println(name + "is leuk");
        }
    }
    /*
    public void setLanguage(String language){
        if(language.equals("English")){
            setLanguage(new English());
        }
        if(language.equals("French")){
            setLanguage(new French());
        }
        if(language.equals("Dutch")){
            setLanguage(new Dutch());
        }
    }
    */
    public void setLanguage(Language language){
        taal = language;
    }
    
    public Language getLanguage(){
        return taal;
    }
}
