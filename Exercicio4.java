import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main (String[] args){


        // Etapa 1 - Inserir numero

        String numeroInserido = JOptionPane.showInputDialog(null, "Insira um número: ");
        int numeroConvertido = Integer.parseInt(numeroInserido);

        
        // Etapa 2 - Calculo o antecessor

        //int resultado = numeroConvertido - 1;
        //numeroConvertido = numeroConvertido - 1;
        //numeroConvertido -=1;
        numeroConvertido--;
        

        // Etapa 3 - Mostrar o resultado
   
        JOptionPane.showMessageDialog(null, "O número antecessor é: " + numeroConvertido);
        //JOptionPane.showMessageDialog(null, "Resultado :" + (Integer.parseInt(numero) - 1))

        
        //System.out.println("O número antecessor é: " + resultado);

    }
    
}
