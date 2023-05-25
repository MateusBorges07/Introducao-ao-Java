import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringEDatas {
    public static void main(String[] args) {

        //ola, {nome}. Hoje é {dia-da-semana}, Bom dia.


        //iso 8601
        String nome = "Mateus";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //Locale brasil = new Locale("pt","BR");

        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour()>= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour()>= 12 && agora.getHour() <18) {
            saudacao = "boa tarde";
        } else if (agora.getHour()>= 18 && agora.getHour() < 24) {
            saudacao = " boa noite";
        }else {
            saudacao = "Ola.";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
