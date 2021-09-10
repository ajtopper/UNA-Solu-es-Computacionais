import javax.swing.JOptionPane;

public class Dolares {
          public static void main(String[] args) {
            String cotacaoTexto;
            String quantidadeTexto;
            double valorCotacao;
            double quantidadeDolares;
            double valorEmReais;

        
          // 1a etapa: Leitura da cotação e da quantidade de dolares
          cotacaoTexto = JOptionPane.showInputDialog("Digite a cotação");
          quantidadeTexto = JOptionPane.showInputDialog("Digite a quantidade");
                //quantidadeDolares = JOptionPane.showInputDialog("Digite a quantidade de Dólares");


          // 2a etapa: converter de dolar para real
          valorCotacao = Double.parseDouble(cotacaoTexto);
          quantidadeDolares = Double.parseDouble(quantidadeTexto);

          valorEmReais = valorCotacao * quantidadeDolares;

          
          // 3a etapa: mostra o resultado da conversao
          System.out.println(valorEmReais);
               
          //JOptionPane.showMessageDialog(cotacaoTexto);
          //JOptionPane.showMessageDialog(null, resultado);  
        }
      
      
      
      
      }