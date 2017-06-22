/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.aventurier;

import java.util.ArrayList;
import model.cartesOrange.CarteDosOrange;
import model.Tuile;
import util.Utils;
import util.Utils.Pion;

/**
 *
 * @author JACQUETCorp
 */
public class Messager extends Aventurier{
    
    public Messager(String nom) {
        super(nom);
    }
    
    @Override
    public boolean donnerCarte( CarteDosOrange carteADonner, Aventurier joueur){               // le joueur courant donne une/plusieurs carte(s) a un joueur choisi
        Boolean bool = false; 
        for (CarteDosOrange carteMain : this.getMain()){ 
            if(joueur.getMain().size() + 1 < 6){
                 System.out.println("Le receveur à la place dans sa main.");              
                if (carteADonner == carteMain){                                                    // la carte se trouve bien dans la main du joueur courant
                    System.out.println("La carte est bien dans la main du joueur.");
                                                        // echange de la carte.

                        System.out.println("La carte tresor : " + carteADonner.getTresor() + " à bien été donner au joueur : "+ joueur.getNom());
                        bool = true;
                    } else {
                        System.out.println("La carte n'est pas dans la main du joueur");
                    }
            } else {
                        System.out.println("Le receveur n'as pas la place de recevoir autant de carte(s)");
                    }
        }
        
        if (bool){
            this.removeCarteMain(carteADonner); 
            joueur.addCarteMain(carteADonner);
            System.out.println("La carte tresor : " + carteADonner.getTresor() + " à bien été donner au joueur : "+ joueur.getNom());
        }

        return bool;
    }

    @Override
    public Pion getPion() {
        return Pion.ORANGE;
    }
}
    
    
    

