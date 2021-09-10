import javax.swing.JOptionPane;


public class Exercicio7 {

    public static void main(String[] args){
    
        // Etapa 1 - Inserir idade da pessoa em anos
        int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem? "));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos meses você tem? "));
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias você tem? "));
    
        
    
        // Etapa 2 - Conversão para dias
        int calculodias = anos*365 + (meses*30 + (dias));
    
    
        // Etapa 3 - Ler o resultado
        System.out.println(calculodias);
    
    
    
        }
        
    }
    

