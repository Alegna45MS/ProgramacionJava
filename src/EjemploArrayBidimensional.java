public class EjemploArrayBidimensional {

		public static void main(String[] args) {
			int[][] matriz=new int [3][3];
			int num=2;
			
			//matriz[0][0]=2;
			//matriz[0][1]=4;
			//matriz[0][2]=6;
			//matriz[1][0]=8;
			//...
			//matriz[2][2]=18;
			//rellenamos el array
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					matriz[i][j]=num;
					num=num+2;
				}
			}
			//mostramos array en formarto matriz
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
			

		}

	}