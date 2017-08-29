package aula05;

import java.util.ArrayList;
import java.util.List;

public class Aula05 {

    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.AbrirConta("CC");
        System.out.println(p1);
        
        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.AbrirConta("CP");
        System.out.println(p2);
        
        p1.Depositar(300);
        p2.Depositar(500);
        
        System.out.println(p1);
        System.out.println(p2);
    
        p2.Sacar(100);
        
        System.out.println(p1);
        System.out.println(p2);
        
        p1.FecharConta();
        p1.Sacar(350);
        p1.FecharConta();
    }
    
}
