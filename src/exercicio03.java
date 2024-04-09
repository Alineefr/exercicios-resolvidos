import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        // Declare uma string nome e inicializando
        String nome = "Aline";
         System.out.printf("Olá, meu nome é %s", nome);
 
         //Declarando o scanner
        Scanner novoScanner = new Scanner(System.in);
        System.out.printf("\nDigite seu sobrenome: ");
        
        
        //Declarando a variavel sobrenome e inicializando com o scanner
        String sobrenome = novoScanner.nextLine();

        // imprimindo o nome completo
        System.out.printf("seu nome é %s %s" , nome, sobrenome);

        novoScanner.close();


                
                
                 
            
        
    }
}
