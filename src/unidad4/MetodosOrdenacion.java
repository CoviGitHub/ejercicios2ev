package unidad4;

public class MetodosOrdenacion {
	static int aux = 0;
	static int pos = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] naipes = { 6, 5, 8, 4, 2, 7, 9, 3, 1, 0 };
		ordInsercion(naipes);
		ordSeleccion(naipes);
		ordInterc(naipes);
	}

	static void ordInsercion(int[] v) {//Tbn llamdo método de la baraja
		System.out.println("Ordenación por Inserción directa");
		for (int i = 0; i < v.length; i++) {
			pos = i;
			aux = v[i];
			while (pos > 0 && v[pos - 1] > aux) {
				v[pos] = v[pos - 1];
				pos--;
			}
			v[pos] = aux;
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}
		System.out.println();
	}

	static void ordSeleccion(int[] v) {
		System.out.println("Ordenación por Selección directa");
		for (int i = 0; i < v.length - 1; i++) {
			pos = i;
			for (int j = i + 1; j < v.length - 1; j++) {
				if ((v[j]) < v[pos]) {
					pos = j;
				}
			}
			aux = v[i];
			v[i] = v[pos];
			v[pos] = aux;
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}
		System.out.println();
	}

	static void ordInterc(int[] v) {//Tbn. llamado método de la burbuja
		System.out.println("Ordenación por Intercambio directo");
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}

	}
}
