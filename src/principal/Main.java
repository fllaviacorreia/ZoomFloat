package principal;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int atual = 8;
		int menos = 4;
		int mais = 16;
		float [][] matrizAtual = new float[atual][atual];
		float [][] matrizMais = new float[mais][mais];
		float [][] matrizMenos = new float[menos][menos];
		
		try {
			
/*	//limpando a matriz		
			for(int i = 0; i < mais; i++)
			{
				for(int j = 0; j < mais; j++)
				{
					if(i<menos & j<menos)
						matrizMenos[i][j] = 0;
					
					if(i<atual & j < atual)
						matrizAtual[i][j] = 0;
					
					matrizMais[i][j] = 0;
				}
			}		*/
			
		/*	
		 //	VERIFICANDO SE A LIMPEZA DOS VETORES ESTÁ FUNCIONANDO
		 	System.out.println("MATRIZ ATUAL\n");
			for(int i = 0; i < atual; i++)
			{
				for(int j = 0; j < atual; j++)
				{
					System.out.print(matrizAtual[i][j] + "   ");
					
				}
				System.out.println();
				
			}
			
			System.out.println("MATRIZ MENOS\n");
			for(int i = 0; i < menos; i++)
			{
				for(int j = 0; j < menos; j++)
				{
					System.out.print(matrizMenos[i][j] + "   ");
					
				}
				
				System.out.println();
			}
			
			System.out.println("MATRIZ MAIS\n");
			for(int i = 0; i < mais; i++)
			{
				for(int j = 0; j < mais; j++)
				{
					System.out.print(matrizMais[i][j] + "   ");
					
				}
				
				System.out.println();
			}
			*/
			
		//GERANDO OS VALORES RANDÔMICOS PARA A 'MATRIZ ATUAL' E PARA ALGUMAS DAS POSIÇÕES DA 'MATRIZ MAIS'	
			for(int i = 0; i < atual; i++)
			{
				for(int j = 0; j < atual; j++)
				{
					Random number = new Random();
					matrizAtual[i][j] = number.nextFloat()*256;
					
					matrizMais[i*2][j*2] = matrizAtual[i][j];
				}
			}
			
		//GERANDO OS VALORES DAS POSIÇÕES DA 'MATRIZ MAIS' QUE NÃO FORAM INICIADOS
			for(int i = 0; i < mais; i++)
			{
				for(int j = 0; j < mais; j++)
				{
					
					if(i % 2 == 0 & j % 2 == 1 & j+1<mais)
						matrizMais[i][j] = (matrizMais[i][j-1]+matrizMais[i][j+1])/2;
					
					if(i%2 == 1 & j+1<mais & i+1<mais)
						matrizMais[i][j] = ( matrizMais[i-1][j]+matrizMais[i+1][j] ) / 2;
					
					if(i+1 == mais) {
						Random number = new Random();
						matrizMais[i][j] = matrizMais[i-1][j] + number.nextFloat();
					}
					
					if(j+1 == mais)
					{
						Random number = new Random();
						matrizMais[i][j] = matrizMais[i][j-1] + number.nextFloat();
					}
					
					//GERANDO OS VALORES DAS POSIÇÕES DA 'MATRIZ MENOS' COM A MÉDIA DAS POSIÇÕES DA 'MATRIZ ATUAL'	
					if(i<menos & j<menos) {
						//DADOS PARA PRIMEIRA POSIÇÃO
						if (i == 0 && j == 0) {
							matrizMenos[i][j] = (matrizAtual[i][j] + matrizAtual[i][j + 1] + matrizAtual[i + 1][j] + matrizAtual[i + 1][j + 1]) / 4;
						}
					//DADOS PARA A PRÓXIMA POSIÇÃO	
						else
							matrizMenos[i][j] = (matrizAtual[i * 2][j * 2] + matrizAtual[i * 2][j * 2 + 1] + matrizAtual[i * 2 + 1][j * 2]+ matrizAtual[i * 2 + 1][j * 2 + 1]) / 4;

					}
				}
			}
			
			System.out.println("\nMATRIZ_ATUAL\n");
			for(int i = 0; i < atual; i++)
			{
				for(int j = 0; j < atual; j++)
				{
					System.out.print(matrizAtual[i][j] + "   ");
					
				}
				System.out.println();
				
			}
			
			System.out.println("\nMATRIZ_ZOOM_MENOS\n");
			for(int i = 0; i < menos; i++)
			{
				for(int j = 0; j < menos; j++)
				{
					System.out.print(matrizMenos[i][j] + "   ");
					
				}
				
				System.out.println();
			}
			
			System.out.println("\nMATRIZ_ZOOM_MAIS\n");
			for(int i = 0; i < mais; i++)
			{
				for(int j = 0; j < mais; j++)
				{
					System.out.print(matrizMais[i][j] + "   ");
					
				}
				
				System.out.println();
			}
			
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
