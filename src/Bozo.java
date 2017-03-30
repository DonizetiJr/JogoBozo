import java.io.IOException;

/**
* @author Edylson T.(5248962) & Donizeti Jr.(9393882)
*/
public class Bozo {

    public Bozo() {

    }

    /**
    * Execução do jogo do bozó
    */
    public static void main(String[] args) throws IOException {
        Placar placar = new Placar();
        RolaDados rd = new RolaDados(5);
        
        int tmp;
        int[] dados = new int[5];
        String str = "";
        
        for (int i = 0; i < 10; i++) {
			System.out.println("Enter para inciar a rodada.");
			EntradaTeclado.leString();
			dados = rd.rolar();

			System.out.println(rd);
			System.out.println("Digite os números dos dados a serem rolados: ");
			
			while (true) {
				try {
					str = EntradaTeclado.leString();
					dados = rd.rolar(str);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Entrada inválida, digite novamente: ");
				}
			}

			System.out.println(rd);
			System.out.println("Digite os números dos dados a serem rolados: ");

			while (true) {
				try {
					str = EntradaTeclado.leString();
					dados = rd.rolar(str);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Entrada Inválida.");
				}
			}

			System.out.println(rd);
			System.out.println("Placar atual: \n" + placar);
			System.out.println("Selecione uma posição: ");
			
			while (true) {
				try {
					tmp = EntradaTeclado.leInt();
					placar.add(tmp, dados);
					break;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
        System.out.println("Score: " + placar.getScore());
			
			System.out.println("Novo placar: \n" + placar);
		}
        
        System.out.println("Score: " + placar.getScore());
    }
}
