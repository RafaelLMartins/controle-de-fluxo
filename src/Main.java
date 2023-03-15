import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int numero = 20;
        String dia = "segunda";
        int variavel = 6;

        if (numero == 1){
            System.out.println("Ferias de Janeiro");
        } else if (numero == 2) {
            System.out.println("Fevereiro");
        } else if (numero == 3) {
            System.out.println("Março");
        } else if (numero == 4) {
            System.out.println("Abril");
        } else if (numero == 5) {
            System.out.println("Maio");
        } else if (numero == 6) {
            System.out.println("Junho");
        }else if(numero == 7){
            System.out.println("Férias de Julho");
        }else if(numero == 8){
            System.out.println("Agosto");
        }else if(numero == 9){
            System.out.println("setembro");
        }else if(numero == 10) {
            System.out.println("outubro");
        } else if (numero == 11) {
            System.out.println("novembro");
        } else if (numero==12) {
            System.out.println("Dezembro");
        }else System.out.println("digite um mês válido");

        switch (dia){
            case "segunda":
                System.out.println(1);
                break;
            case "terça":
                System.out.println(2);
                break;
            case "quarta":
                System.out.println(3);
                break;
            case "quinta":
                System.out.println(4);
                break;
            case "sexta":
                System.out.println(5);
                break;
            case "sabado":
                System.out.println(6);
                break;
            case "domingo":
                System.out.println(7);
                break;
        }
        switch (variavel){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
        }
        String mes= "janeiro";
        switch (mes){
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
}
}