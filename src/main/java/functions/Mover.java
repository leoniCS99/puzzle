package functions;

public class Mover {

    public static String[][] mover(String insert, int[] index, String[][] tabelaEmbaralhada) {

        int[] posicaoValorInserido = Buscador.buscarIndexValorInserido(tabelaEmbaralhada,insert);

        int linhaValorInserido = posicaoValorInserido[0];
        int colunaValorInserido = posicaoValorInserido[1];
        int linhaEspacoBranco = index[0];//Linha do espaço em branco
        int colunaEspacoBranco = index[1];//Coluna do espaço em branco
        String temp;

        if(Verificador.verificarEntrada(linhaEspacoBranco,colunaEspacoBranco,
                linhaValorInserido, colunaValorInserido) == false){
            System.out.println("\n Valor insérido é inválido! ");
            System.out.println("Insira um valor valido! \n");

            return tabelaEmbaralhada;
        }

        temp = tabelaEmbaralhada[linhaEspacoBranco][colunaEspacoBranco];
        tabelaEmbaralhada[linhaEspacoBranco][colunaEspacoBranco] = tabelaEmbaralhada[linhaValorInserido][colunaValorInserido];
        tabelaEmbaralhada[linhaValorInserido][colunaValorInserido] = temp;

        return tabelaEmbaralhada;

    }

}
