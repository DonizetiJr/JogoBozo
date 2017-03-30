public class Dado {
    private int nLados;
    private int ladoAtual;
    private Random rand;

    /**
    *
    */
    public Dado() {
        this.nLados = 6;
        this.rand = new Random();
        this.rolar();
    }

    public Dado(int n) {
        this.nLados = n;
        this.rand = new Random();
        this.rolar();
    }

    public int getLado() {
        return this.ladoAtual;
    }

    public int rolar() {
        ladoAtual = rand.getIntRand(this.nLados) + 1;

        return this.nLados;
    }

    @Override
    public String toString() {
        String str = "";

        switch (this.ladoAtual) {
        case 1:
            str = "+-------+    \n"+
                  "|       |    \n"+
                  "|   *   |    \n"+
                  "|       |    \n"+
                  "+-------+    \n";
            break;
        case 2:
            str = "+-------+    \n"+
                  "| *     |    \n"+
                  "|       |    \n"+
                  "|     * |    \n"+
                  "+-------+    \n";
                break;
        case 3:
            str = "+-------+    \n"+
                  "| *     |    \n"+
                  "|   *   |    \n"+
                  "|     * |    \n"+
                  "+-------+    \n";
            break;
        case 4:
            str = "+-------+    \n"+
                  "| *   * |    \n"+
                  "|       |    \n"+
                  "| *   * |    \n"+
                  "+-------+    \n";
            break;
        case 5:
            str = "+-------+    \n"+
                  "| *   * |    \n"+
                  "|   *   |    \n"+
                  "| *   * |    \n"+
                  "+-------+    \n";
            break;
        case 6:
            str = "+-------+    \n"+
                  "| *   * |    \n"+
                  "| *   * |    \n"+
                  "| *   * |    \n"+
                  "+-------+    \n";
        }

        return str;
    }
}
