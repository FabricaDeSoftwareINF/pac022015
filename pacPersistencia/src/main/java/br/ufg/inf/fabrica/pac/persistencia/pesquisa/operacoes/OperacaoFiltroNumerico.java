package br.ufg.inf.fabrica.pac.persistencia.pesquisa.operacoes;

import br.ufg.inf.fabrica.pac.persistencia.pesquisa.Operacao;

/**
 *
 * @author Danillo
 */
public abstract class OperacaoFiltroNumerico implements Operacao {

    public final static int IGUAL = 0;
    public final static int DIFERENTE = 1;
    public final static int MAIOR_QUE = 2;
    public final static int MAIOR_OU_IGUAL_QUE = 3;
    public final static int MENOR_QUE = 4;
    public final static int MENOR_OU_IGUAL_QUE = 5;

    private final Number valor;

    public OperacaoFiltroNumerico(Number valor) {
        this.valor = valor;
    }

    public Number getValor() {
        return valor;
    }
}
