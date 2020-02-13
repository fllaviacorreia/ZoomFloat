package principal;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZoomComCores {
		static int atual = 8;
		static int menos = 4;
		static int mais = 16;
		static JButton[][] matrizAtual = new JButton[atual][atual];
		static JButton[][] matrizMais = new JButton[mais][mais];
		static JButton[][] matrizMenos = new JButton[menos][menos];
		
	public static void main(String[] args) {
		
		try {
			for(int i = 0; i < mais; i++)
			{
				for(int j = 0; j < mais; j++)
				{
					if(i<menos & j<menos) {
						matrizMenos[i][j] = new JButton();
						matrizMenos[i][j].setVisible(true);
						matrizMenos[i][j].setSize(40, 40);
						matrizMenos[i][j].setBackground(new Color(0,0,0));
					}
						
					
					if(i<atual & j < atual) {
						matrizAtual[i][j] = new JButton();
						matrizAtual[i][j].setVisible(true);
						matrizAtual[i][j].setSize(40, 40);
						matrizAtual[i][j].setBackground(new Color(0,0,0));
						
					}
						
					matrizMais[i][j] = new JButton();
					matrizMais[i][j].setVisible(true);
					matrizMais[i][j].setSize(40, 40);
					matrizMais[i][j].setBackground(new Color(0,0,0));
					
				}
			}	
			
			// GERANDO OS VALORES RANDÔMICOS PARA A 'MATRIZ ATUAL' E PARA ALGUMAS DAS
			// POSIÇÕES DA 'MATRIZ MAIS'
			for (int i = 0; i < atual; i++) {
				for (int j = 0; j < atual; j++) {
					matrizAtual[i][j] = new JButton();
					matrizAtual[i][j].setSize(40, 40);
					matrizAtual[i][j].setBackground(new Color(randomValues(), randomValues(), randomValues()));
					matrizMais[i * 2][j * 2] = matrizAtual[i][j];
					
				//configuração da posição 
					if (i == 0 && j == 0) {
						matrizAtual[i][j].setLocation(-50, 10);
					} else {
						if (i == 0 && j != 0) {
							matrizAtual[i][j].setLocation(matrizAtual[i][j - 1].getX() + 40, 10);
						} else if (i != 0 && j == 0) {
							matrizAtual[i][j].setLocation(100, matrizAtual[i - 1][j].getY() + 40);
						} else {
							matrizAtual[i][j].setLocation(matrizAtual[i][j - 1].getX() + 40,
									matrizAtual[i - 1][j].getY() + 40);
						}
					}
				}
			}

			// GERANDO OS VALORES DAS POSIÇÕES DA 'MATRIZ MAIS' QUE NÃO FORAM INICIADOS
			for (int i = 0; i < mais; i++) {
				for (int j = 0; j < mais; j++) {

					if (i % 2 == 0 & j % 2 == 1 & j + 1 < mais) { // linhas pares e colunas ímpares
						matrizMais[i][j] = new JButton();
						matrizMais[i][j].setSize(40, 40);
						matrizMais[i][j].setBackground(new Color(
								(((int) (matrizMais[i][j - 1].getBackground().getRed())
										+ (int) (matrizMais[i][j + 1].getBackground().getRed())) / 2),
								(((int) (matrizMais[i][j - 1].getBackground().getGreen())
										+ (int) (matrizMais[i][j + 1].getBackground().getGreen())) / 2),
								(((int) (matrizMais[i][j - 1].getBackground().getBlue())
										+ (int) (matrizMais[i][j + 1].getBackground().getBlue())) / 2)));

					}
					if (i % 2 == 1 & j + 1 < mais & i + 1 < mais) { // linhas ímpares e colunas pares
						matrizMais[i][j] = new JButton();
						matrizMais[i][j].setSize(40, 40);
						matrizMais[i][j].setBackground(new Color(
								(((int) (matrizMais[i - 1][j].getBackground().getRed())
										+ (int) (matrizMais[i + 1][j].getBackground().getRed())) / 2),
								(((int) (matrizMais[i - 1][j].getBackground().getGreen())
										+ (int) (matrizMais[i + 1][j].getBackground().getGreen())) / 2),
								(((int) (matrizMais[i - 1][j].getBackground().getBlue())
										+ (int) (matrizMais[i + 1][j].getBackground().getBlue())) / 2)));

					}
					if (i + 1 == mais) { // última linha
						matrizMais[i][j] = new JButton();
						matrizMais[i][j].setSize(40, 40);
						matrizMais[i][j].setBackground(new Color(
								(int) (matrizMais[i - 1][j].getBackground().getRed())
								+ random(matrizMais[i - 1][j].getBackground().getRed()),
								(int) (matrizMais[i - 1][j].getBackground().getGreen())
								+ random(matrizMais[i - 1][j].getBackground().getGreen()),
								(int) (matrizMais[i - 1][j].getBackground().getBlue())
								+ random(matrizMais[i - 1][j].getBackground().getBlue())));

					}

					if (j + 1 == mais) { // útima coluna
						matrizMais[i][j] = new JButton();
						matrizMais[i][j].setSize(40, 40);
						matrizMais[i][j].setBackground(new Color(
								((int) (matrizMais[i][j - 1].getBackground().getRed())
										+ random(matrizMais[i][j - 1].getBackground().getRed())),
								((int) (matrizMais[i][j - 1].getBackground().getGreen())
										+ random(matrizMais[i][j - 1].getBackground().getGreen())),
								((int) (matrizMais[i][j - 1].getBackground().getBlue())
										+ random(matrizMais[i][j - 1].getBackground().getBlue()))));

					}

					if (i == 0 && j == 0) {
						matrizMais[i][j].setLocation(500, 40);
					} else {
						if (i == 0 && j != 0) {
							matrizMais[i][j].setLocation(matrizMais[i][j - 1].getX() + 40, 40);
						} else if (i != 0 && j == 0) {
							matrizMais[i][j].setLocation(500, matrizMais[i - 1][j].getY() + 40);
						} else {
							matrizMais[i][j].setLocation(matrizMais[i][j - 1].getX() + 40,
									matrizMais[i - 1][j].getY() + 40);
						}
					}

				}
			}

			geraPainel();

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void geraPainel() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		JPanel painel = new JPanel();
		painel.setSize(800, 700);
		painel.setBackground(Color.BLACK);
		painel.setLayout(null);
		painel.setLocation(0, 0);
		
//		for (int i = 0; i < mais; i++) {
//			for (int j = 0; j < mais; j++) {	
//				painel.add(matrizMais[i][j]);
//			}
//		}
		
		for (int i = 0; i < atual; i++) {
			for (int j = 0; j < atual; j++) {
				painel.add(matrizAtual[i][j]);
			}
		}
		
		frame.add(painel);
	}
	
	public static int randomValues() {
		int x = 0;
		do {
			x = Math.round(new Random().nextFloat() * 256);
			System.out.println("X = " + x);
		} while (x > 255);

		return x;
	}

	public static int random(int valor) {
		int x = 0;
		do {
			x = Math.round(new Random().nextFloat() * (256 - valor));
		} while (x > 255);
		System.out.println("Valor = " + valor);
		System.out.println("X final = " + x);
		return x;
	}

}
