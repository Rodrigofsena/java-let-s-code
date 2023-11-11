public class newmain {
  public static void main(String[] args) {

    /*
     * boolean resultado = false;
     * System.out.println(resultado);
     */

    boolean fimDeSemana = true;
    boolean fazendoSol = true;
    boolean vamosAPraia = fimDeSemana && fazendoSol;

    // tabela verdade
    // operado && ( significa and tradução (e) )
    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = false

    // operador || (or) em portugues é (ou)
    // true || true = true
    // true || false = false
    // false || true = false
    // false || false = false

    System.out.println(vamosAPraia);
    /*
     * (Operador ternario) é quando voce atribue mais de uma opção a variavel usando
     * o (? = se) fimdesemana
     * for verdadeiro voce escreve ***** (: = caso contrario ) voce escreve ******
     */

    String mensagem = fimDeSemana ? "É Fim de semana" : "Não é fim de semana";

    System.out.println(mensagem);
  }

}
