/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.DomeinController;
import domein.language.*;
import java.util.Scanner;

/**
 *
 * @author BelgoBits
 */
public class Translation {

    private DomeinController dc = new DomeinController();

    public Translation() {
        translate();
    }

    public void translate() {

        int getal = 0;
        boolean invoerFout = true;
        try {
            System.out.println("\n 1. English \n 2. Dutch \n 3. French");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                if (sc.hasNextInt()) {
                    int waarde = sc.nextInt();
                    if (0 < waarde && waarde < 4) {
                        getal = waarde;
                    } else {
                        throw new IndexOutOfBoundsException("Choose between 1,2 and 3.");
                    }
                } else {
                    throw new IllegalArgumentException("Geef een geheel getal in.");
                }
            } else {
                throw new IllegalArgumentException("Je moet een getal ingeven.");
            }
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            e.getMessage();
        }

        if (getal == 1) {
            dc.setLanguage(new English());
        }
        if (getal == 2) {
            dc.setLanguage(new Dutch());
        }
        if (getal == 3) {
            dc.setLanguage(new French());
        }

        System.out.println(dc.getLanguage().askName());
        Scanner nickname = new Scanner(System.in);
        System.out.println(dc.getLanguage().getMessage(nickname.next()));
    }
}
