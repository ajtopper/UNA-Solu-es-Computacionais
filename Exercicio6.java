import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args){
    
    // Etapa 1 - Inserir idade da pessoa em anos
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque sua idade em anos: "));

    

    // Etapa 2 - Conversão para dias
    int calculodias = idade*365;


    // Etapa 3 - Ler o resultado
    System.out.println(calculodias);



    }
    
}
