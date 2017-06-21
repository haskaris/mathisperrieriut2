/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.aventurier;

import java.util.ArrayList;
import model.Tuile;
import util.Utils;
import util.Utils.Pion;

/**
 *
 * @author reyneu
 */
public class Ingenieur extends Aventurier{
    
    public Ingenieur(String nom) {
        super(nom);
    }

    @Override
    public Pion getPion() {
        return Pion.ROUGE; 
    }
    
}
