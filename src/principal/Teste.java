package principal;

import java.awt.Color;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
//		int atual = 8;
//		int menos = 4;
//		int mais = 16;
//		float [][] matrizAtual = new float[atual][atual];
//		float [][] matrizMais = new float[mais][mais];
//		float [][] matrizMenos = new float[menos][menos];
//		int j = 0;
//		for(int i = 0; i < atual; i++) {
//			matrizAtual[i][j] = 7;
//			i--;
//			j++;
//			if(j == atual) {
//				j = 0;
//				i++;
//				
//			}
//			
//		}
//		
//		for(int i = 0; i < atual; i++)
//		{
//			for( j = 0; j < atual; j++)
//			{
//				System.out.print(matrizAtual[i][j] + "   ");
//				
//			}
//			System.out.println();
//			
//		}
		
		   //Cria uma cor
        Color color = new Color(randomValues(), randomValues(), randomValues());
        //pega a cor anterior e cria outr identica
        Color color2 = new Color(color.getRGB());
        //imprime o valor RGB da cor
        System.out.println(color.getRGB());
        System.out.println(color.getRed());
        System.out.println(color.getGreen());
        System.out.println(color.getBlue());
	}
	public static int randomValues() {
		int x = 0;
		do {
			x = Math.round(new Random().nextFloat() * 256);
			System.out.println("X = " + x);
		}while(x>255);
		
		return x;
	}
}
