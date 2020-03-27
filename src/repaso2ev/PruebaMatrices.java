package repaso2ev;
public class PruebaMatrices {

	public static void main(String[] args) {

		Matrices m=new Matrices();
		
		//cuadrado1
		int [][]mC1=Matrices.cuadrada1(3);
		m.muestraMatriz(mC1);
		System.out.println();
		
		//cuadrado2
		int [][]mC2=Matrices.cuadrada2(6);
		m.muestraMatriz(mC2);
		System.out.println();
		
		//palindromos
		String [][]mS=Matrices.palindromos(5,4);
		if(mS[0][0]!="null") {
		m.muestraMatrizString(mS);
		}else System.out.println("null");
		System.out.println();
		
		//max3x3
		int [][] m3x3=new int[4][3];
		for(int i=0;i<m3x3.length;i++) {
			for(int j=0;j<m3x3[i].length;j++) {
				m3x3[i][j]=(int)Math.floor(Math.random()*(10-1)+1);
				System.out.print(m3x3[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		int suma=Matrices.max3x3sum(m3x3);
		System.out.println(suma);

	}

}
