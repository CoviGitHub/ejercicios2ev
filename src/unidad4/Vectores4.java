package unidad4;

public class Vectores4 {

	public static void main(String[] args) {
		int[] v = new int[(int) Math.floor(Math.random() * 491 + 10)];
		System.out.println("Tamaño del vector: " + v.length + "\n");
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) Math.floor(Math.random() * 201 -100);
		}
		int[] vRep = new int[v.length];

		if (v.length <= 50) {
			System.out.println("Valores de vector menor o igual a 50 elementos");
			for (int i = 0; i < v.length; i++) {
				System.out.print(v[i] + "  ");
			}
		}

		for (int i = 1; i < v.length; i++) {
			if (v[i - 1] == v[i]) {
				vRep[i - 1] = v[i - 1];
				vRep[i] = v[i];
			}
		}
		int countSecRep = 0;
		System.out.println("\nSecuencias de valores repetidos");
		System.out.println("---------------------------------");
		
		for (int i = 0; i < vRep.length-1; i++) {
			if (vRep[i] != 0) {
				if (vRep[i + 1] != vRep[i]) {
					countSecRep++;
				}
			}
		}
		System.out.println("Hay " + countSecRep
				+ ((countSecRep == 1) ? " secuencia" : " secuencias")+" de números repetidos\nPosiciones");
		for (int i = 0; i < vRep.length; i++) {
			if (vRep[i] != 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println("\nValores repetidos");
		for (int i = 0; i < vRep.length; i++) {
			if (vRep[i] != 0) {
				System.out.print(vRep[i] + "\t");
			}
		}
	}
}
