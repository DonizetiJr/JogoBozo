import java.lang.IllegalArgumentException;

public class Placar {
    private int[] pontos;

    // constantes
    public static final int POSICAO_FULLHAND = 7;
    public static final int POSICAO_SEQUENCIA = 8;
    public static final int POSICAO_QUADRA = 9;
    public static final int POSICAO_QUINA = 10;

    public static final int PONTUACAO_FULLHAND = 15;
    public static final int PONTUACAO_SEQUENCIA = 20;
    public static final int PONTUACAO_QUADRA = 30;
    public static final int PONTUACAO_QUINA = 40;

    public Placar() {
        this.pontos = new int[10];
    }

    public void add(int posicao, int[] dados) throws IllegalArgumentException {
        if (posicao < 1 || posicao > this.pontos.length) {
            throw new IllegalArgumentException("Posição fora do intervalo do vetor");
        }
        if (this.pontos[posicao-1] != 0) {
            throw new IllegalArgumentException("Posição já ocupada");
        }
        if (posicao < POSICAO_FULLHAND) {
            for (int lado : dados) {
                if (posicao == lado)
                    this.pontos[posicao-1] += posicao;
            }
        } else {
            int[] frequencia = new int[6];

            switch(posicao) {
            case POSICAO_FULLHAND:
                for (int lado : dados)
                    frequencia[lado-1]++;

                boolean dupla = false;
                boolean tripla = false;
                for (int freq : frequencia) {
                    if (freq == 2) dupla = true;
                    if (freq == 3) tripla = true;
                }

                if (dupla && tripla)
                    this.pontos[POSICAO_FULLHAND-1] = PONTUACAO_FULLHAND;
                break;
            case POSICAO_SEQUENCIA:
                for (int lado : dados)
                    frequencia[lado-1]++;

                for (int freq : frequencia) {
                    if (freq > 1) return;
                }

                this.pontos[POSICAO_SEQUENCIA-1] = PONTUACAO_SEQUENCIA;
                break;
            case POSICAO_QUADRA:

                for (int lado : dados)
                    frequencia[lado-1]++;

                for (int freq : frequencia)
                    if (freq == 4) {
                        this.pontos[POSICAO_QUADRA-1] = PONTUACAO_QUADRA;
                        return;
                    }

                break;
            case POSICAO_QUINA:
                int i = 0;
                while (i < 4 && dados[i] == dados[i+1]) i++;

                if (i == 4)
                    this.pontos[POSICAO_QUINA-1] = PONTUACAO_QUINA;
            }
        }
    }

    public int getScore() {
        int somaPontos = 0;

        for (int ponto : this.pontos)
            somaPontos += ponto;

        return somaPontos;
    }

    private boolean estaOcupada(int posicao) {
        return (this.pontos[posicao] != 0);
    }

    public String toString() {
        String str = "";

        for (int i = 0; i < 3; i++) {
            str += estaOcupada(i+0) ? this.pontos[i+0+1]+"\t" : "("+(i+0+1)+")\t";
            str += estaOcupada(i+6) ? "|\t"+this.pontos[i+6+1]+"\t|" : "|\t("+(i+6+1)+")\t|";
            str += estaOcupada(i+3) ? "\t"+this.pontos[i+3+1]+"\n" : "\t("+(i+3+1)+")\n";
            str += "-----------------------------------\n";
        }

        str += estaOcupada(9) ?
        "\t|\t"+this.pontos[9]+"\t|\t\n" :
        "\t|\t"+"(9)"+"\t|\t   \n";

        return str;
    }

}
