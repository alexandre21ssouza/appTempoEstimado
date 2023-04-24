package programa1;

import java.util.Locale;
import java.util.Scanner;

public class RotaFamiliar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Legenda da problemática:
		// 20 minutos para se arrumar para o trabalho.
		// 20 minutos para arrumar uma criança.
		// 20 minutos para tomar café com a criança.
		// 15 minutos para tomar café sozinho.
		// 25 minutos de casa até a escola
		// 30 minutos da escola para o trabalho.
		// 15 minutos de casa direto para o trabalho.
		// Depois das 7:20 adicional de engarrafamento
		// Entrada no trabalho 8:00
		// 7:00 Abertura dos portões escola crianças

		String trabalharHoje, aulaHoje;
		int despertador, somaPercurso = 0;

		System.out.println("Programe o despertador: (6 a 8 h)"); // horas
		despertador = sc.nextInt();
		System.out.println("Vai ao trabalho amanhã?  (sim ou não)");
		trabalharHoje = sc.next();
		System.out.println("Vai levar as crianças pra escola amanhã? (sim ou não)");
		aulaHoje = sc.next();

		// minutos
		int vestirTrabalho = 20;
		int vestirCrianca = 20;
		int tomarCafeSolo = 15;
		int tomarCafeCrianca = 20;
		int casaEscola = 25;
		int escolaCasa = casaEscola;
		int escolaTrabalho = 30;
		int casaTrabalho = 15;
		int addEngarrafamento = 0;




		
		sc.close();
	}

}



	



