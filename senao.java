public class senao {
    public static void main(String[] args) {

        int nota = 100;

        // se (if) nota for maior ou igual a 70, então aprovodo
        // se nao (else) reprovado
        // if else

        /*
         * if (nota >= 70) {
         * System.out.println("Você passou");
         * }
         * else {
         * System.out.println("Voce não passou");
         * }
         */

        // criando outro exemplo
        // Graduação : A 80 B 70 C 60 D 0

        /*
         * if (nota >= 80){
         * System.out.println("Graduação A");}
         * 
         * else if ( nota < 80 && nota >= 70){
         * System.out.println("Graduação B");}
         * else if ( nota < 70 && nota >= 60){
         * System.out.println("Graduação c");}
         * else if ( nota < 60 && nota >= 0){
         * System.out.println("Graduação D");}
         * else {
         * System.out.println("Nota invalida!");}
         */

        // mesmo codigo mas feito de uma forma diferente.

        String Graduacao;

        if (nota >= 80) {
            Graduacao = "A";
        }

        else if (nota < 80 && nota >= 70) {
            Graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            Graduacao = "C";
            ;
        } else if (nota < 60 && nota >= 0) {
            Graduacao = "D";
            ;
        } else {
            Graduacao = "";

        }
        switch (Graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado");
                break;
            default:
                System.out.println("Graduação invalida");

                // O if else é uma forma de fazer um validação
                // switch é outra forma de fazer um validação.
                /*
                 * as duas pode ser usadas separada, que vai obter o mesmo resultado ou
                 * juntas que tambem vao obter o mesmo resultado
                 */
        }
    }
}