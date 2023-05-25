public class Condicionais {
    public static void main(String[] args) {

        int nota = 80;
        String graducacao;

        //nota for maior ou igual do 70, aprovado
        if (nota >= 80) {
            graducacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graducacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graducacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graducacao = "D";
        } else {
            graducacao = "";
        }
        switch (graducacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não Aprovado");
                break;
            default:
                System.out.println("Graduação invalida");
                break;
        }

    }
}