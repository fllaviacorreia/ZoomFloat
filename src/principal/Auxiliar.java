//package principal;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.util.Random;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Auxiliar {
//
//	private static final int EXIT_ON_CLOSE = 0;
//
//	public static void main(String[] args) {
//		int atual = 8;
//		int menos = 4;
//		int mais = 16;
//		JButton[][] matrizAtual = new JButton[atual][atual];
//		JButton[][] matrizMais = new JButton[mais][mais];
//		JButton[][] matrizMenos = new JButton[menos][menos];
//		try {
//
//			
//			 //limpando a matriz 
//			 for(int i = 0; i < mais; i++) { 
//				 for(int j = 0; j < mais; j++) { 
//					 if(i<menos & j<menos) 
//						 matrizMenos[i][j] = null;
//			 
//					 if(i<atual & j < atual) 
//						 matrizAtual[i][j] = null;
//			  
//					 matrizMais[i][j] = null; 
//				} 
//			  }
//			 
//
//			/*
//			 * // VERIFICANDO SE A LIMPEZA DOS VETORES EST� FUNCIONANDO
//			 * System.out.println("MATRIZ ATUAL\n"); for(int i = 0; i < atual; i++) {
//			 * for(int j = 0; j < atual; j++) { System.out.print(matrizAtual[i][j] + "   ");
//			 * 
//			 * } System.out.println();
//			 * 
//			 * }
//			 * 
//			 * System.out.println("MATRIZ MENOS\n"); for(int i = 0; i < menos; i++) {
//			 * for(int j = 0; j < menos; j++) { System.out.print(matrizMenos[i][j] + "   ");
//			 * 
//			 * }
//			 * 
//			 * System.out.println(); }
//			 * 
//			 * System.out.println("MATRIZ MAIS\n"); for(int i = 0; i < mais; i++) { for(int
//			 * j = 0; j < mais; j++) { System.out.print(matrizMais[i][j] + "   ");
//			 * 
//			 * }
//			 * 
//			 * System.out.println(); }
//			 */
//
//			// GERANDO OS VALORES RAND�MICOS PARA A 'MATRIZ ATUAL' E PARA ALGUMAS DAS
//			// POSI��ES DA 'MATRIZ MAIS'
//			for (int i = 0; i < atual; i++) {
//				for (int j = 0; j < atual; j++) {
//					matrizAtual[i][j] = new JButton();
//					matrizAtual[i][j].setSize(40, 40);
//					matrizAtual[i][j].setBackground(new Color(Math.round(new Random().nextFloat() * 256), Math.round(new Random().nextFloat() * 256), Math.round(new Random().nextFloat() * 256)));
//					matrizMais[i * 2][j * 2] = matrizAtual[i][j];
//					if (i == 0 && j == 0) {
//						matrizAtual[i][j].setLocation(10, 10);
//					} else {
//						if (i == 0 && j != 0) {
//							matrizAtual[i][j].setLocation(matrizAtual[i][j - 1].getX() + 40, 10);
//						} else if (i != 0 && j == 0) {
//							matrizAtual[i][j].setLocation(10, matrizAtual[i - 1][j].getY() + 40);
//						} else {
//							matrizAtual[i][j].setLocation(matrizAtual[i][j - 1].getX() + 40,
//									matrizAtual[i - 1][j].getY() + 40);
//						}
//					}
//					matrizMais[i * 2][j * 2] = matrizAtual[i][j];
//				}
//
//			}
//
//			
//		//GERANDO OS VALORES DAS POSI��ES DA 'MATRIZ MAIS' QUE N�O FORAM INICIADOS
//			for(int i = 0; i < mais; i++)
//			{
//				for(int j = 0; j < mais; j++)
//				{
//					
//					if(i % 2 == 0 & j % 2 == 1 & j+1<mais){ //linhas pares e colunas �mpares
//						matrizMais[i][j] = new JButton();
//						matrizMais[i][j].setSize(40, 40);
//						matrizMais[i][j].setBackground(new Color((((int) (matrizMais[i][j-1].getBackground().getRed()) + (int) (matrizMais[i][j+1].getBackground().getRed()))/2), 
//								(((int) (matrizMais[i][j-1].getBackground().getGreen()) +(int) (matrizMais[i][j+1].getBackground().getGreen()))/2) , 
//								(((int) (matrizMais[i][j-1].getBackground().getBlue()) +(int) (matrizMais[i][j+1].getBackground().getBlue()))/2)));
//						
//					}
//					if(i%2 == 1 & j+1<mais & i+1<mais){ //linhas �mpares e colunas pares
//			
//						matrizMais[i][j] = ( matrizMais[i-1][j]+matrizMais[i+1][j] ) / 2;
//					}		
//					if(i+1 == mais) { // �ltima linha 
//						Random number = new Random();
//						matrizMais[i][j] = matrizMais[i-1][j] + number.nextFloat();
//					}
//					
//					if(j+1 == mais) { // �tima coluna
//						Random number = new Random();
//						matrizMais[i][j] = matrizMais[i][j-1] + number.nextFloat();
//					}
//					
//					if (i == 0 && j == 0) {
//						matrizMais[i][j].setLocation(400, 10);
//					} else {
//						if (i == 0 && j != 0) {
//							matrizMais[i][j].setLocation(matrizMais[i][j - 1].getX() + 40, 10);
//						} else if (i != 0 && j == 0) {
//							matrizMais[i][j].setLocation(10, matrizMais[i - 1][j].getY() + 40);
//						} else {
//							matrizMais[i][j].setLocation(matrizMais[i][j - 1].getX() + 40,
//									matrizMais[i - 1][j].getY() + 40);
//						}
//					}
//					
//				}
//			}
//			//GERANDO OS VALORES DAS POSI��ES DA 'MATRIZ MENOS' COM A M�DIA DAS POSI��ES DA 'MATRIZ ATUAL'	
//			for(int i = 0; i < menos; i++) {
//				for(int j = 0; j < menos; j++) {
//					
//					
//						//DADOS PARA PRIMEIRA POSI��O
//						if (i == 0 && j == 0) {
//							matrizMenos[i][j] = (matrizAtual[i][j] + matrizAtual[i][j + 1] + matrizAtual[i + 1][j] + matrizAtual[i + 1][j + 1]) / 4;
//						}
//					//DADOS PARA A PR�XIMA POSI��O	
//						else
//							matrizMenos[i][j] = (matrizAtual[i * 2][j * 2] + matrizAtual[i * 2][j * 2 + 1] + matrizAtual[i * 2 + 1][j * 2]+ matrizAtual[i * 2 + 1][j * 2 + 1]) / 4;
//
//					}
//				}
//			}
//			
//			JFrame frame = new JFrame();
//			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//			frame.setSize(710, 600);
//			frame.setVisible(true);
//			JPanel painel = new JPanel();
//			painel.setSize(600, 600);
//			painel.setBackground(Color.WHITE);
//			painel.setLayout(null);
//			System.out.println("\nMATRIZ_ATUAL\n");
//			for (int i = 0; i < atual; i++) {
//				for (int j = 0; j < atual; j++) {
//					painel.add(matrizAtual[i][j]);
//
//				}
//
//			}
//			
//			
//			for (int i = 0; i < mais; i++) {
//				for (int j = 0; j < mais; j++) {
////					if(matrizMais[i][j] != null) {
////						if (i == 0 && j == 0) {
////						matrizMais[i][j].setLocation(400, 10);
////					} else {
////						if (i == 0 && j != 0) {
////							matrizMais[i][j].setLocation(matrizMais[i][j - 2].getX() + 40, 10);
////						} else if (i != 0 && j == 0) {
////							matrizMais[i][j].setLocation(10, matrizMais[i - 2][j].getY() + 40);
////						} else {
////							matrizMais[i][j].setLocation(matrizMais[i][j - 2].getX() + 40, matrizMais[i - 2][j].getY() + 40);
////						}
////					}
//					painel.add(matrizMais[i][j]);
//
////					}
//					
//				}
//
//			}
//
//			frame.add(painel);
//
////			System.out.println("\nMATRIZ_ZOOM_MENOS\n");
////			for(int i = 0; i < menos; i++)
////			{
////				for(int j = 0; j < menos; j++)
////				{
////					System.out.print(matrizMenos[i][j] + "   ");
////					
////				}
////				
////				System.out.println();
////			}
////			
////			System.out.println("\nMATRIZ_ZOOM_MAIS\n");
////			for (int i = 0; i < mais; i++) {
////				for (int j = 0; j < mais; j++) {
////					System.out.print(matrizMais[i][j] + "   ");
////
////				}
////
////				System.out.println();
////			}
//
//		} catch (Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//
//	}
//}
