import javax.swing.JOptionPane;


public class Exercicio2 {
    public static void main(String[] args) {
       

    //Etapa 1 - Input dos numeros

        // Numero 1
        String Numero1;
        Numero1 = JOptionPane.showInputDialog(null, "Insira o primeiro número");

        int x = Integer.parseInt(Numero1);
        Double resultado1;
        
        // Numero 2
         String Numero2;
        Numero2 = JOptionPane.showInputDialog(null, "Insira o segundo número");

        int y = Integer.parseInt(Numero2);
        Double resultado2;

        // Numero 3
        String Numero3;
        Numero3 = JOptionPane.showInputDialog(null, "Insira o terceiro número");

        int z = Integer.parseInt(Numero3);
        Double resultado3;

        // Numero 4
        String Numero4;
        Numero4 = JOptionPane.showInputDialog(null, "Insira o quarto número");

        int a = Integer.parseInt(Numero4);
        Double resultado4;
        

    //Etapa 2 - Raiz quadrada dos números

        // Resultado 1
        resultado1 = Math.sqrt(x);

        // Resultado 2
        resultado2 = Math.sqrt(y);

        // Resultado 3
        resultado3 = Math.sqrt(z);

        // Resultado 4
        resultado4 = Math.sqrt(a);

       System.out.println("Resultado parcial das Raízes quadradas inseridas");
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    
    //Etapa 3 - Somar todos os quadrados

        Double somatotal;

        somatotal = resultado1 + resultado2 + resultado3 + resultado4;  

    

    //Etapa 4 - Mostrar o resultado
        
        System.out.println("Resultado da soma da Raiz Quadrada de todos os números inseridos: ");
        System.out.println(somatotal);
     

    }
    
}
