public class Dado {
    private int nLados;
    private int ladoAtual;

    /**
    *
    */
    public Dado() {
        this.nLados = 6;
        this.rolar();
    }

    public Dado(int n) {
        this.nLados = n;
        this.rolar();
    }

    public int getLado() {
        return this.ladoAtual;
    }

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
