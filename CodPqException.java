/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

import Leitura.Leitura;
import pessoa.Pessoa;

/**
 *
 * @author Rogério dos Santos
 */
public class CodPqException extends Exception {
    
    /*public CodPqException(){
        System.out.println("Gerou e lancou um objeto do tiop CodPqException");       
} */
    
    public void impErrCod(){
        System.out.println("Valor do código é pequeno");
    }  
    
    public Pessoa concertNumero(Pessoa p) {
        Leitura l = new Leitura();       
        try{
             //n = Integer.parseInt(l.entDados(""));
              p.setCod(Integer.parseInt(l.entDados("")));
        }
        catch(CodPqException cpe){
             p = cpe.concertNumero(p);
            
        }
        
         catch(NumberFormatException e){
                System.out.println("O número tem que ser do tipo inteiro");  
         }
        
        return p;
           
    }
    
}
