package unidad4;

import java.util.Arrays;

public class Mezcla {

	public static void main(String[] args) {
		int [] v1=new int[(int)(Math.random()*91+10)];
		llenarV(v1);
		Arrays.sort(v1);
		System.out.println(Arrays.toString(v1));
		int [] v2=new int[(int)(Math.random()*91+10)];
		llenarV(v2);
		Arrays.sort(v2);
		System.out.println(Arrays.toString(v2));
		int [] v3=mezclaV(v1,v2);
		System.out.println(Arrays.toString(v3));
		
	}
	
	static void llenarV(int[]v) {
		for(int i=0;i<v.length;i++){
			v[i]=(int)(Math.random()*101);
		}
	}
	
	static int[] mezclaV(int[]v1,int[]v2) {
		int []v3=new int[v1.length+v2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<v1.length&&j<v2.length) {
			if (v1[i]<v2[j]) {
				v3[k]=v1[i];
				i++;
			}else {
				v3[k]=v2[j];
				j++;
			}
			k++;
		}
		if(i<v1.length)	{
			for (int x=i;x<v1.length;x++) {
				v3[k]=v1[x];
				k++;
			}
		}else {
			for(int y=j;j<v2.length;j++) {
				v3[k]=v2[y];
				k++;
			}
		}
		return v3;
	}

}
