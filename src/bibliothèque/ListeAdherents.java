/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothèque;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author p2103678
 */
public class ListeAdherents {
    private ArrayList<Adherent> index;
    
    public ListeAdherents() {
        index = new ArrayList<Adherent>();
    }
    
    public void add(String nom, String prenom, int anneeDeNaissance) throws AgeException {
        if (anneeDeNaissance < 2010) {
            throw new AgeException();
        }
        
        index.add(new Adherent(anneeDeNaissance, nom, prenom));
    }
    
    public boolean isAdherent(String nom, String prenom) {
        for (Adherent i : index) {
            if (i.getNom() == nom && i.getPrenom() == prenom) {
                return true;
            }
        }
        return false;
    }
    
    public int adherentBornInYear(int a) {
        AtomicInteger nb = new AtomicInteger(0);
        index.forEach((i) -> {
            if (i.getAnneeDeNaissance() == a) {
                int test = nb.get();
                nb.getAndSet(test + 1);
            }
        });
        return nb.get();
    }
}
