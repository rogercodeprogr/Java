package Leitura;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @Autor: Rogério dos Santos
 */
public class Leitura {
    
    public String entDados(String rotulo) {

		System.out.println("Digite um número");
		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);                
		String ret = "";
		try{
			ret = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\n Erro de sistema");
		}
		return ret;	
	}
    
}
