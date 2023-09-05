/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author 55539
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
        
        System.out.println("Digite o seu nome:");
        String nome_cliente = scanner.nextLine();
        contaTerminal.atualizarNomeCliente(nome_cliente);
        
        System.out.println("Digite a sua agencia:");
        String agencia = scanner.nextLine();
        contaTerminal.atualizarAgencia(agencia);
        
        System.out.println("Digite a sua conta:");
        int conta = scanner.nextInt();
        contaTerminal.atualizarConta(conta);
        
        contaTerminal.imprimirInformaçõesDoCliente();
    }    
}
