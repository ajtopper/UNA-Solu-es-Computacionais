import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        //double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario atual"));
        //double novoSalario = 0;

        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario atual"));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste do salario atual"));
        

        /*if (salario > 2000)
        {
            novoSalario = salario + (salario *(5 / 100));
        }
        else {
            novoSalario = salario + (salario *(10 / 100));
        }*/

        double novoSalario = salario + (salario *(percentual / 100));

        //System.out.println("Salario Atual: " + salario);
        JOptionPane.showMessageDialog(null, "Salario Atual: " + salario + "\nPercentual: " + percentual);
        JOptionPane.showMessageDialog(null, "Seu Novo Salario é: " + novoSalario);
      
    }
}
