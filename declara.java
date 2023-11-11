import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class declara {
    public static void main(String[] args) {

        // Olá, {}. Hoje é {dia da samana}, BOM DIA

        /*
         * String nome = "Sena";
         * // faz oque esta na variavel nome ficar toda em maiusculo
         * System.out.println(nome.toUpperCase());
         * // faz ficar em toda em menusculo
         * System.out.println(nome.toLowerCase());
         * // dis quantos caracteres tem o nome
         * System.out.println(nome.length());
         * 
         * String nomedofa = "Cadu";
         * // usando para comparada as duas variavel, se alguma letra tiver diferente,
         * maiusculo ou menusculo
         * // nao dar um erro ou vai dar falso
         * System.out.println(nome.equals(nomedofa));
         * // Faz a mesma coisa, mas ignora caso mude as letras de maiuculo ou
         * menusculo.
         * System.out.println(nome.equalsIgnoreCase(nomedofa));
         */

        // Pradão mundial : ISO 8601

        String nome = "Cadu";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "Br");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        }

        else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde!";
        }

        else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa Noite!";
        }

        else {
            saudacao = "Ola.";
        }

        System.out.printf("Ola,%s. Hoje é %S, %s. %n ", nome, diaDaSemana, saudacao.toUpperCase());

    }

}
