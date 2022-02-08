/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import excecao.CodPqException;

/**
 *
 * @author Acer
 */
public class Pessoa {
    
    int cod;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) throws CodPqException {
        
        if(cod > 10){
            this.cod = cod;
            System.out.println("Código válido");
        }
        else
           throw new CodPqException();
        
    }
    
}
