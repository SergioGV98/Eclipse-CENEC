package Practica2;

import java.util.Random;

public class Mapas {
	public static char[][] matrizAgua(byte nFilas, byte nColumnas) {
		char[][] matriz = new char[nFilas][nColumnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = '~';
			}
		}
		return matriz;
	}

	public static void ponerTerreno(char[][] mapa, byte nContinentes) {
		Random ran = new Random();
		byte azarFila;
		byte azarColumna;
		for (byte i = 0; i < nContinentes; i++) {
			azarFila = (byte) ran.nextInt(mapa.length);
			azarColumna = (byte) ran.nextInt(mapa[i].length);
			if (mapa[azarFila][azarColumna] == '~') {
				mapa[azarFila][azarColumna] = '#';
			} else {
				i--;
			}
		}
	}

	public static void extenderTerreno(char[][] mapa) {
		Random ran = new Random();
		byte cuarenta;
		for (byte i = 0; i < mapa.length; i++) {
			for (byte j = 0; j < mapa[i].length; j++) {
				cuarenta = (byte) ran.nextInt(101);
				if (i != 0 && i != mapa.length - 1 && j != 0 && j != mapa[i].length - 1) {
					if (mapa[i][j] == '#') {
						if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
							mapa[i][j - 1] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i - 1][j - 1] != '#' && cuarenta <= 40) {
							mapa[i - 1][j - 1] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i - 1][j] != '#' && cuarenta <= 40) {
							mapa[i - 1][j] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i - 1][j + 1] != '#' && cuarenta <= 40) {
							mapa[i - 1][j + 1] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i][j + 1] != '#' && cuarenta <= 40) {
							mapa[i][j + 1] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i + 1][j + 1] != '#' && cuarenta <= 40) {
							mapa[i + 1][j + 1] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
							mapa[i + 1][j] = '%';
						}
						cuarenta = (byte) ran.nextInt(101);
						if (mapa[i + 1][j - 1] != '#' && cuarenta <= 40) {
							mapa[i + 1][j - 1] = '%';
						}
					}
				} else if (i == 0 && j == 0 && mapa[i][j] == '#') {
					if (mapa[i][j + 1] != '#' && cuarenta <= 40) {
						mapa[i][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j + 1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
						mapa[i + 1][j] = '%';
					}
				}else if(i==0&&j==mapa[i].length-1&& mapa[i][j] == '#') {
					if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
						mapa[i][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
						mapa[i + 1][j] = '%';
					}
				}else if(i==mapa.length-1&&j==0&& mapa[i][j] == '#') {
					if (mapa[i][j + 1] != '#' && cuarenta <= 40) {
						mapa[i][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j + 1] != '#' && cuarenta <= 40) {
						mapa[i - 1][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j] != '#' && cuarenta <= 40) {
						mapa[i - 1][j] = '%';
					}
				}else if(i==mapa.length-1&&j==mapa[i].length-1&& mapa[i][j] == '#') {
					if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
						mapa[i][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i - 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j] != '#' && cuarenta <= 40) {
						mapa[i - 1][j] = '%';
					}
				}else if(j!=0&&i==0&& mapa[i][j] == '#') {
					if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
						mapa[i][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
						mapa[i + 1][j] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j + 1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i][j + 1] != '#' && cuarenta <= 40) {
						mapa[i][j + 1] = '%';
					}
				}else if(j!=0&&i==mapa.length-1&& mapa[i][j] == '#') {
					if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
						mapa[i][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i - 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j] != '#' && cuarenta <= 40) {
						mapa[i - 1][j] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j + 1] != '#' && cuarenta <= 40) {
						mapa[i - 1][j + 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i][j + 1] != '#' && cuarenta <= 40) {
						mapa[i][j + 1] = '%';
					}
				}else if(i!=0&&i!=mapa.length-1&&j==mapa[i].length-1&&mapa[i][j] == '#') {
					if (mapa[i][j - 1] != '#' && cuarenta <= 40) {
						mapa[i][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
						mapa[i + 1][j] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j - 1] != '#' && cuarenta <= 40) {
						mapa[i - 1][j - 1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i-1][j] != '#' && cuarenta <= 40) {
						mapa[i-1][j] = '%';
					}
				}else if(i!=0&&i!=mapa.length-1&&j==0&&mapa[i][j] == '#') {
					if (mapa[i][j +1] != '#' && cuarenta <= 40) {
						mapa[i][j +1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j] != '#' && cuarenta <= 40) {
						mapa[i + 1][j] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i + 1][j+1] != '#' && cuarenta <= 40) {
						mapa[i + 1][j+1] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i - 1][j] != '#' && cuarenta <= 40) {
						mapa[i - 1][j] = '%';
					}
					cuarenta = (byte) ran.nextInt(101);
					if (mapa[i-1][j+1] != '#' && cuarenta <= 40) {
						mapa[i-1][j+1] = '%';
					}
				}
			}
		}
	}
}
