/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifpb
 */
import java.util.Random;
public class Arma {
   public int danoMax;
   public String Arma(String nome, int durabilidade, int danoMax){
       return nome +"Durabilidade: "+ durabilidade+"Dano Maximo: "+danoMax;
   }
   public int atacar(int durabilidade){
       Random ataque = new Random();
       int danoAtaque = ataque.nextInt(danoMax+1);
        durabilidade -=1;
        if(durabilidade<=0){
            danoAtaque = 0;
        }
        return danoAtaque;
   }public boolean usarApenasUmaMao(){
       //vazio;
   return false;
   }
}
