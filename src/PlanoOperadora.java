public class PlanoOperadora {
    public static void main(String[] args) {
        
        // Modo condicional switch/case
        // Aqui sim, existe um ganho benéfico na utilização do método SWITCH CASE
        // Sem a utilização do BREAK para que cada caso complemente o outro, ajudando e facilitando o objetivo final
        String plano = "B"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}

        // MÉTODO CONDICIONAL PADRÃO UTILIZANDO IF/ELSE
        // String plano = "M"; //M / T

        // if(plano == "B") {
		// 	System.out.println("100 minutos de ligação");
		// }else if(plano == "M") {
		// 	System.out.println("100 minutos de ligação");
		// 	System.out.println("Whats e Intagram grátis");	
		// }else if(plano == "T") {
		// 	System.out.println("100 minutos de ligação");
		// 	System.out.println("Whats e Intagram grátis");	
		// 	System.out.println("5Gb Youtube");
        // }
        }
    }
}
