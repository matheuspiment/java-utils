package com.github.matheuspiment.utils.year;

/**
 * Created by aluno on 10/10/18.
 */
public class Year {

    /**
     * Construtor da classe.
     *
     * @throws IllegalStateException Caso a classe seja instaciada.
     */
    public Year() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param year          Ano a ser testado.
     * @return              Asirmação se o ano é ou não bissexto.
     *
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */

    public static boolean isLeapYear(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            return true;
        }

        return false;
    }
}
