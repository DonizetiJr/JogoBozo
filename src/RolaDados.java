public class RolaDados {
  Dado[] dados;
	
  public RolaDados() {
  }
	
  // Construtor que cria e armazena vários objetos do tipo Dado. 
  public RolaDados(int n) {
	  this.dados = new Dado[n];
	  for (int i = 0; i < this.dados.length; i++) {
		this.dados[i] = new Dado();
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			;
		}
	}
  }

  // Retorna o valor de cada um dos dados
  public int[] rolar() {
	  int[] r = new int[this.dados.length];
	  
	  for (int i = 0; i < r.length; i++) {
		r[i] = this.dados[i].rolar();
	  }
	  
	  return r;
	  
  }

  // quais - É um array de booleanos que indica quais dados devem ser rolados.
  public int[] rolar(boolean[] quais) {
	  int[] r = new int[this.dados.length];
	  
	  for (int i = 0; i < r.length; i++) {
		if (quais[i] == true) {
			r[i] = this.dados[i].rolar();
		} else {
			r[i] = this.dados[i].getLado();
		}
	  }
	  
	  return r;
  }
  

  // s - É um String que possui o número dos dados a serem rolados.
  public int[] rolar(String s) {
	  int count = 0;
	  int[] r = new int[this.dados.length];
	  
	  String[] splited = s.split("\\s+");
	  
	  for (int i = 0; i < r.length; i++) {
		  if (i == Integer.parseInt(splited[count])) {
			  r[i] = this.dados[i].rolar();
			  count++;
		  } else {
			  r[i] = this.dados[i].getLado();
		  }
	  }
	  
	  return r;

  }

  // Usa a representação em string do dados, para mostrar o valor de todos os dados do conjunto.
  public String toString() {
	  int num = this.dados.length;
	  String resultados = "";
	  
	  for (int i = 0; i < num; i++) {
		resultados += this.dados[i].toString();
		resultados += "\t";
	  }
	  
	  return resultados;
  }

}
