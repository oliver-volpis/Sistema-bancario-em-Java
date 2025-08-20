import java.util.Scanner;

public class SistemaBancario {
  public static void main (String[] args) {
    
    int escolha = 0;
     System.out.print("""
      Operações:
      -------------------------
      | (1) Consultar Saldo   |
      | (2) Realizar Depósito |
      | (3) Realizar Saque    |
      | (4) Sair              |
      -------------------------
     """); 
     
    System.out.println("\nQual sua opção : ");
    Scanner opcao = new Scanner (System.in);
    escolha = opcao.nextInt(0);
  }
  
}
