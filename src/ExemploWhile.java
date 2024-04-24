import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0; //declarando o valor inicial da variavel
        while(mesada>0) { //condição do WHILE para ser testada, no caso ENQUANTO mesada for menor que 0 o loop continua
            Double valorDoce = valorAleatorio(); // atribuindo a uma variavel um método de geração de valores aleatórios
            if(valorDoce > mesada) //condição para que o valor gerado se for maior que o restante da mesada se igualem
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho"); //imprimindo os doces sendo adicionados no carrinho
            mesada = mesada - valorDoce; //fazendo os descontos do valor de cada doce
        }
        System.out.println("Mesada:" + mesada); //imprimindo o saldop final da mesada
        System.out.println("Joãozinho gastou toda a sua mesada em doces"); //mensagem de finalização do teste
        
   }

   //método para geração de numeros aleatórios
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);   //range dos numeros que podem ser gerados
   }
}