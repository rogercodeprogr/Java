
import Leitura.Leitura;
import excecao.CodPqException;
import pessoa.Pessoa;

/**
 *
 * Autor: Rogério dos Santos
 */
public class Inicio {
    
    public static void main(String[]args){
        int n= 0;
        Leitura l = new Leitura();  
        Pessoa p  = new Pessoa();     
            
            try{
               //n = Integer.parseInt(l.entDados(""));            
               p.setCod(Integer.parseInt(l.entDados("")));
               
            }            
            catch(CodPqException cpe){
                cpe.impErrCod();
                p = cpe.concertNumero(p);
               // p = cpe.concertNumero(p);
            }
            
            catch(NumberFormatException e){
                System.out.println("O número tem que ser do tipo inteiro");
            }
            finally{
                System.out.println("Voce informou o código");
            }
    }
    
    
    
}
