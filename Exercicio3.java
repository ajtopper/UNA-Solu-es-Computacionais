import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args){

// Etapa 1 Qual a "item" pessoa vendeu

String itemVendido;
itemVendido = JOptionPane.showInputDialog(null, "Qual item você vendeu? ");



//Etapa 2 Quantas unidades desse "item" a pessoa vendeu
String unidadesVendidas;
unidadesVendidas = JOptionPane.showInputDialog(null, "Quantas unidades foram vendidas? ");
double unidade = Double.parseDouble(unidadesVendidas);


//Etapa 3 Por quanto cada unidade desse "item" foi vendido
String valorVendido;
valorVendido = JOptionPane.showInputDialog(null, "Por quanto foi vendido cada unidade? ");
double valor = Double.parseDouble(valorVendido);


//Etapa 4 Soma dos valores quantidades x valor do "item"
double soma;
soma = unidade * valor;



//Etapa 5 Soma total dos valores da Etapa 4 + a porcentagem de 5%
double percentual;
percentual = 5.0;
double somapercentual;
somapercentual =  soma + (soma *(percentual / 100));




//Etapa 6 Exibir soma total...

System.out.println("O valor somado dos item " + itemVendido + " é: ");
System.out.println(soma);
System.out.println(itemVendido + " terá um valor final somado a comissão de: ");
System.out.println(somapercentual);

/*String somaString;
somaString = Double.toString(soma);

String somapercentualString;
somapercentualString = Double.toString(somapercentual);*/




    }
    
}
