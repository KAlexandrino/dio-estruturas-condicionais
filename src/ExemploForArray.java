public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Utilização do metodo FOR EACH, onde é focado basicamente em coleções (Arrays), sua sintaxe é bem mais convidativa
        // e simples, dependendo do caso poide ser uma boa escolha. (Isso quando trabalhamos focados na coleção, e interagir sobre eles)
        for (String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

        // Utilização do metodo FOR em sua forma mais comum
        // for (int x=0; x<alunos.length; x++) {
        //     System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        // }
    }
}
