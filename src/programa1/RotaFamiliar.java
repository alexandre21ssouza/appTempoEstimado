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

			if (despertador >= 6 && despertador <= 8) {

			if (despertador <= 6) {
				addEngarrafamento = 0;
			} else if (despertador > 6) {
				addEngarrafamento = 15; // minutos
			} else if (despertador >= 7) { // hora
				addEngarrafamento = 30; // minutos
			}

		} else if (despertador < 6 && aulaHoje.equals("sim")) {
			System.out.println("As crianças vão chegar muito cedo para entrar na escola!");

			System.out.println("Programe o despertador: (6 a 8 h)"); // horas
			despertador = sc.nextInt();

		} else {
			System.out.println("Neste horário você vai se atrasar demais!");

			System.out.println("Programe o despertador: (6 a 8 h)"); // horas
			despertador = sc.nextInt();
		}

		if (trabalharHoje.equals("sim") && aulaHoje.equals("sim")) {
//		
			somaPercurso = vestirTrabalho + vestirCrianca + tomarCafeCrianca + casaEscola + escolaTrabalho
					+ addEngarrafamento;

		} else if (trabalharHoje.equals("sim") && aulaHoje.equals("não")) {
			somaPercurso = vestirTrabalho + tomarCafeSolo + casaTrabalho + addEngarrafamento;

		} else if (trabalharHoje.equals("não") && aulaHoje.equals("sim")) {
			somaPercurso = vestirCrianca + tomarCafeCrianca + casaEscola + escolaCasa + addEngarrafamento;

		}

		int horas;
		int minutos;

		horas = ((somaPercurso / 60) % 24) + despertador;
		minutos = somaPercurso % 60;

		if (trabalharHoje.equals("não") && aulaHoje.equals("sim")) {
			System.out.println("Vai Chegar em casa:  " + horas + " h " + " e " + minutos + " minutos ");

		} else if (trabalharHoje.equals("não") && aulaHoje.equals("não")) {
			System.out.println("Bom descanso para todos!");

		} else {

			System.out.println("Vai Chegar no trabalho:  " + horas + " h " + " e " + minutos + " minutos ");

			switch (horas) {

			case 6 :
				System.out.println("Você vai chegar no horário!");
				break;
			case 8:
				System.out.println("Você vai chegar atrasado!");
				break;
			}
		}


		
		sc.close();
	}

}



	



