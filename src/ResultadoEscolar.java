public class ResultadoEscolar {
    public static void main(String[] args) {

    int nota = 6;

    // Utilizando o metodo ternario para reduzir o código.
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

    System.out.println(resultado);


    // metodo mais normativo, utilizando o if, else. Não está errado mas pode ser reduzido utilizando as opções ternarias como o exemplo acima!

    //     int nota = 6;

    //     if (nota >= 7)
    //     System.out.println("Aprovado!");

    //     else if (nota >5 && nota<7)
    //     System.out.println("Prova de recuperação!");

    //     else
    //     System.out.println("Reprovado!");
    // 
}
}
