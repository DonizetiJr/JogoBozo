/**
* Esta classe representa um dado. A quantidade de lados é variado.
* @author Edylson T. & Donizeti Jr.
*/
public class Dado {
    private int nLados;
    private int ladoAtual;

    /**
    * Inicializa um dado de 6 lados o rola uma vez.
    */
    public Dado() {
        this.nLados = 6;
        this.rolar();
    }

    /**
    * @param n Valor que representa quantos lados o dado terá e o rola.
    * @throws Caso seja passado um n valendo 0 ou menor.
    */
    public Dado(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("Tentativa de criação de um dado de 0 lados ou menos.");
        }
        
        this.nLados = n;
        this.rolar();
    }

    public int getLado() {
        return this.ladoAtual;
    }

    /**
    * Escolhe um número aleatório do dado
    * @return O lado sorteado
    */
    public int rolar() {
        Random rand = new Random();
        ladoAtual = rand.getIntRand(this.nLados) + 1;

        return this.nLados;
    }

    @Override
    public String toString() {
        String str = "";

        switch (this.ladoAtual) {
        case 1:
            str = "+-----+    \n"+
                  "|     |    \n"+
                  "|  *  |    \n"+
                  "|     |    \n"+
                  "+-----+    \n";
            break;
        case 2:
            str = "+-----+    \n"+
                  "|*    |    \n"+
                  "|     |    \n"+
                  "|    *|    \n"+
                  "+-----+    \n";
                break;
        case 3:
            str = "+-----+    \n"+
                  "|*    |    \n"+
                  "|  *  |    \n"+
                  "|    *|    \n"+
                  "+-----+    \n";
            break;
        case 4:
            str = "+-----+    \n"+
                  "|*   *|    \n"+
                  "|     |    \n"+
                  "|*   *|    \n"+
                  "+-----+    \n";
            break;
        case 5:
            str = "+-----+    \n"+
                  "|*   *|    \n"+
                  "|  *  |    \n"+
                  "|*   *|    \n"+
                  "+-----+    \n";
            break;
        case 6:
            str = "+-----+    \n"+
                  "|*   *|    \n"+
                  "|*   *|    \n"+
                  "|*   *|    \n"+
                  "+-----+    \n";
        }

        return str;
    }
}
