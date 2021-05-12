/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author vinys
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco conta1 = new ContaBanco();
        conta1.setDono("Vinicius");
        conta1.setNumConta(12345);
        conta1.setSaldo(20f);
        conta1.setStatus(true);
        conta1.setTipo("cp");
        
        conta1.depositar(100f);
        conta1.pagarMensal();
    }
    
}
