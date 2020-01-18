package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] v1 = new int[(int) Math.floor(Math.random() * 41 + 10)];
		System.out.println("Longitud vector: " + v1.length);
		
		v1[0] = (int) Math.floor(Math.random() * 201 - 100);
		for (int i = 1; i < v1.length-1; i++) {
			v1[i] = (int) Math.floor(Math.random() * 201 - 100);
			for (int j = 0; j <i; j++) {
				if (v1[j] == v1[i]) {
					System.out.print("Repite valor "+v1[i]+" en Pos " + i +" y "+ j);
					v1[i] = (int) Math.floor(Math.random() * 201 - 100);
					System.out.println(", se sustituye en la pos "+i+" por el valor "+v1[i]+".");
				}
			}
		}

		int[] v2 = new int[v1.length];
		int k = v1.length - 1;
		for (int j = 0; j < v1.length; j++) {
			v2[k] = v1[j];
			k--;
		}
		
		System.out.println("\nVector 1        Vector 2");
		for (int j = 0; j < v1.length; j++) {
			System.out.println("Pos " + j + ":\t" + v1[j] + "\t" + v2[j]);
		}
		in.close();
	}
}
