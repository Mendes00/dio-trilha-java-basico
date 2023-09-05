/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

/**
 *
 * @author 55539
 */
public class ContaTerminal {
    int numeroDaConta;
    String agencia;
    String nomeDoCliente;
    double saldo = 237.48;
    
    public void atualizarConta(int novaConta){
     numeroDaConta = novaConta;    
    }
    
     public void atualizarAgencia(String novaAgencia){
     agencia = novaAgencia;
     }
     
      public void atualizarNomeCliente(String novoCliente){
      nomeDoCliente = novoCliente;
      }
      
      public void imprimirInformaçõesDoCliente(){
          System.out.println("Ola, " + nomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + " sua conta eh " + numeroDaConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
      
      }
}
