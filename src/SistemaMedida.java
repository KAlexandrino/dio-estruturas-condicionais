public class SistemaMedida {
    public static void main(String[] args) {

        //Utilizando o método "Switch case" onde, caso o objetivo seja atinjido em alguma das situações ele interrompe a aplicação utilizando o BREAK
        //Nesse caso em especifico não trouxe um beneficio performatico em nivel de sintaxe para nosso projeto.
        //Para cada cenário é ideal analisar se realmente a troca é benéfica
        String sigla = "A";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                break;
        }

        // MÉTODO PADRÃO UTILIZANDO O IF/ELSE
        // String sigla = "A";

        // if(sigla == "P")
        //     System.out.println("PEQUENO");
        // else if(sigla == "M")
        //     System.out.println("MEDIO");
        // else if(sigla == "G")
        //     System.out.println("GRANDE");
        // else
        //     System.out.println("INDEFINIDO");

    }
}
