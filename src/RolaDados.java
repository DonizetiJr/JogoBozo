public class RolaDados {

  private Dado[] dados;
  private int dadosc;

  /**
  * Construtor que cria e armazena vários objetos do tipo Dado.
  * @param n quantidade de dados a serem criados.
  */
  public RolaDados(int n) {
      this.dados = new Dado[n];
      this.dadosc = n;
      
      for (int i = 0; i < this.dadosc; i++) {
          this.dados[i] = new Dado();
          try {
              Thread.sleep(100);
          } catch(InterruptedException e) { }
      }
  }

  /**
  * Rola todos os dados, gerando novos valores
  * @return array com valor de cada dado
  */
  public int[] rolar() {
      int[] r = new int[this.dadosc];

      for (int i = 0; i < this.dadosc; i++) {
          r[i] = this.dados[i].rolar();
      }

      return r;
  }

  /**
  * Rola apenas os dados especificados
  * @param quais - É um array de booleanos que indica quais dados devem ser rolados.
  * @return array com valor de cada dado
  */
  public int[] rolar(boolean[] quais) {
      int[] r = new int[this.dadosc];

      for (int i = 0; i < this.dadosc; i++) {
          if (quais[i] == true) {
              r[i] = this.dados[i].rolar();
          }
      }

      return r;
  }
  

  /**
  * Rola apenas os dados especificados
  * @param s - É um String que possui o número dos dados a serem rolados.
  * @return array com valor de cada dado
  */
  public int[] rolar(String s) {
      int[] r = new int[this.dadosc];
      if (!s.isEmpty()) {
    	  String[] str = s.split(" ");
    	  
    	  for (int i = 0; i < str.length; i++) {
			int pos = Integer.parseInt(str[i]);
			if (pos > 0 && pos <= this.dadosc) {
				dados[pos - 1].rolar();
			}
		}
      }
      
      for (int i = 0; i < dadosc; i++) {
		r[i] = dados[i].getLado();
	}
      
      return r;
  }

  /**
  * Usa a representação em string do dados, para mostrar o valor de todos os dados do conjunto.
  */
    @Override
    public String toString() {
        String r = "";
        String[][] str = new String[this.dadosc][];

        for (int i = 0; i < dadosc; i++) {
           str[i] = this.dados[i].toString().split("\\n");
        }

        for (int i = 0; i < dadosc; i++) {
            r += i + 1;
            r += "            ";
        }

        r += "\n";

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < dadosc; j++) {
              	r += str[j][i];
            }

            r += '\n';
        }

        r += '\n';
        return r;
    }

}
