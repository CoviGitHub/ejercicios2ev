package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alumnos {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException, NumberFormatException {

		System.out.print("Número de alumnos?");
		int num = 0;
		int exc = 0;
		do {
			try {
				num = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("No es un dato válido, inténtalo de nuevo.");
				exc = 0;
			}
		} while (exc == 0 || num <= 0);
		exc = 0;

		float[][] numAluNotas = new float[num][];
		String[] nomAlu = new String[numAluNotas.length];
		for (int i = 0; i < numAluNotas.length; i++) {
			System.out.println("Nombre alumno " + (i + 1) + ": ");

			nomAlu[i] = in.readLine();
			numAluNotas[i] = notas();
		}

		String[] menu = { "1. Mostrar la nota media de todos los alumnos.",
				"2. Mostrar la nota media de un alumno determinado.",
				"3. Visualizar las notas por evaluación y la nota final de cada evaluación.",
				"4. Visualizar las notas por evaluación y la nota final de un alumno determinado.",
				"5. Calcular la nota media del curso.",
				"6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.",
				"7. Salir." };

		int opc = 0;
		do {
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			System.out.println("Elige una opción");
			opc = Integer.parseInt(in.readLine());
			opciones(opc, nomAlu, numAluNotas);
		} while (opc != 7);
		in.close();
	}

	static float[] notas() throws IOException {
		float[] notas = new float[3];
		System.out.println("Sus notas");
		for (int i = 0; i < 3; i++) {
			System.out.print("Eval " + (i + 1) + ": ");
			float nota = 0;

			int exc = 0;
			do {
				try {
					nota = Float.parseFloat(in.readLine());
					exc = 1;
				} catch (NumberFormatException ex) {
					System.out.print("No es una nota, inténtalo de nuevo.");
					exc = 0;
				}
			} while (exc == 0 || nota < 0 || nota > 10);
			exc = 0;

			notas[i] = nota;
		}
		return notas;
	}

	static void opciones(int opc, String[] nomAlu, float[][] numAluNotas) throws IOException {
		switch (opc) {
		case 1:
			opc1(nomAlu, numAluNotas);
			System.out.println();
			break;
		case 2:
			opc2(nomAlu, numAluNotas);
			System.out.println();
			break;
		case 3:
			opc3(nomAlu, numAluNotas);
			System.out.println();
			break;
		case 4:
			opc4(nomAlu, numAluNotas);
			System.out.println();
			break;
		case 5:
			opc5(numAluNotas);
			System.out.println();
			break;
		case 6:
			opc6(nomAlu, numAluNotas);
			System.out.println();
			break;
		default:
			if (opc != 7) {
				System.out.println("Opción no válida");
			}
			break;
		}
	}

	static void opc1(String[] nomAlu, float[][] numAluNotas) {
		for (int i = 0; i < nomAlu.length; i++) {
			float notMedia = 0;
			System.out.print("Nota media de " + nomAlu[i] + ": ");
			for (int j = 0; j < numAluNotas[i].length; j++) {
				notMedia += numAluNotas[i][j];
			}
			notMedia /= 3;
			System.out.printf("%.2f\n", notMedia);
		}
	}

	static void opc2(String[] nomAlu, float[][] numAluNotas) throws IOException {
		for (int i = 0; i < nomAlu.length; i++) {
			System.out.print((i + 1) + ". " + nomAlu[i] + "\n");
		}
		System.out.println("Elige el alumno");
		int selAlu = 0;
		selAlu = 0;
		int exc = 0;
		do {
			try {
				selAlu = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("No es una opción, inténtalo de nuevo: ");
				exc = 0;
			}
		} while (exc == 0 || selAlu <= 0 || selAlu > nomAlu.length);
		exc = 0;

		float notMedia = 0;
		String selNomAlu = "";
		for (int i = 0; i < nomAlu.length; i++) {
			if ((selAlu - 1) == i) {
				selNomAlu = nomAlu[i];
				for (int j = 0; j < numAluNotas[i].length; j++) {
					notMedia += numAluNotas[i][j];
				}
			}
		}
		System.out.printf("%s tiene de nota media %.2f\n", selNomAlu, (notMedia / 3));
	}

	static void opc3(String[] nomAlu, float[][] numAluNotas) {
		float[] totEv = new float[3];

		for (int i = 0; i < nomAlu.length; i++) {
			float total = 0;
			System.out.print(nomAlu[i] + ":\t");
			for (int j = 0; j < numAluNotas[i].length; j++) {
				total += numAluNotas[i][j];
				totEv[j] += numAluNotas[i][j];
				System.out.printf("Eval %d: %.2f\t", (j + 1), numAluNotas[i][j]);
			}
			System.out.printf("Nota final: %.2f\n", (total / numAluNotas[i].length));
		}
		System.out.printf("\nNota final por evaluaciones:\n\t Eval 1: %.2f \t Eval 2: %.2f \t Eval 3: %.2f \n",
				(totEv[0] / nomAlu.length), (totEv[1] / nomAlu.length), (totEv[2] / nomAlu.length));
		System.out.printf("Nota media total: %.2f\n", ((totEv[0] + totEv[1] + totEv[2]) / nomAlu.length / 3));
	}

	static void opc4(String[] nomAlu, float[][] numAluNotas) throws IOException {
		for (int i = 0; i < nomAlu.length; i++) {
			System.out.println((i + 1) + ". " + nomAlu[i]);
		}
		System.out.println("Elige el alumno");
		int selAlu = 0;
		int exc = 0;
		do {
			try {
				selAlu = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("No es una opción, inténtalo de nuevo: ");
				exc = 0;
			}
		} while (exc == 0 || selAlu <= 0 || selAlu > nomAlu.length);
		exc = 0;

		float total = 0;
		for (int i = 0; i < nomAlu.length; i++) {
			if ((selAlu - 1) == i) {
				System.out.print(nomAlu[i] + ": \t");
				for (int j = 0; j < numAluNotas[i].length; j++) {
					total += numAluNotas[i][j];
					System.out.printf("Eval %d: %.2f\t", (j + 1), numAluNotas[i][j]);
				}
			}
		}
		System.out.printf("Nota final: %.2f\n", (total / 3));
	}

	static void opc5(float[][] numAluNotas) {
		float notaMedia = 0;
		for (int i = 0; i < numAluNotas.length; i++) {
			for (int j = 0; j < numAluNotas[i].length; j++) {
				notaMedia += numAluNotas[i][j];
			}
		}
		notaMedia /= 3;
		System.out.printf("Nota media del curso: \t %.2f\n", (notaMedia / numAluNotas.length));
	}

	static void opc6(String[] nomAlu, float[][] numAluNotas) {
		float max = Integer.MIN_VALUE;
		float min = Integer.MAX_VALUE;
		String aluNotaMax = "";
		String aluNotaMin = "";
		int evalMax = Integer.MIN_VALUE;
		int evalMin = Integer.MAX_VALUE;
		for (int i = 0; i < numAluNotas.length; i++) {
			for (int j = 0; j < numAluNotas[i].length; j++) {
				if (numAluNotas[i][j] > max) {
					max = numAluNotas[i][j];
					aluNotaMax = nomAlu[i];
					evalMax = j + 1;
				}
				if (numAluNotas[i][j] < min) {
					min = numAluNotas[i][j];
					aluNotaMin = nomAlu[i];
					evalMin = j + 1;
				}
			}
		}
		System.out.printf("%s tiene la nota más alta %.2f en la evaluacion %d\n", aluNotaMax, max, evalMax);
		System.out.printf("%s tiene la nota más baja %.2f en la evaluacion %d\n", aluNotaMin, min, evalMin);
	}

}
