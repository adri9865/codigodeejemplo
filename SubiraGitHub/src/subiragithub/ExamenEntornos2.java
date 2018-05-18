package subiragithub;

import java.util.Scanner;

public class ExamenEntornos2 {

    public static void rellenar(int num) {

        String matriz[][] = new String[8][8];

        Integer numero;
        numero = num;
        
    
//PRIMERA LINEA
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero);
                j++;
                numero++;
            }
        }
        
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
        
//SEGUNDA LINEA
        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-4);
                j++;
                numero++;
            }
        }
        
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
        
//TERCERA LINEA
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-8);
                j++;
                numero++;
            }
        }
        
        for (int i = 2; i < 3; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
//CUARTA LINEA
        for (int i = 3; i < 4; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-12);
                j++;
                numero++;
            }
        }
        
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
//QUINTA LINEA
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-16);
                j++;
                numero++;
            }
        }
        
        for (int i = 4; i < 5; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
//SEXTA LINEA
        for (int i = 5; i < 6; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-20);
                j++;
                numero++;
            }
        }
        
        for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
//SEPTIMA LINEA
        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-24);
                j++;
                numero++;
            }
        }
        
        for (int i = 6; i < 7; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
//OCTAVA LINEA
        for (int i = 7; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                matriz[i][j] = String.valueOf(numero-28);
                j++;
                numero++;
            }
        }
        
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = " X ";
                j++;
                numero++;
            }
        }
        
       

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|  ");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" |");
        }

    }

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        
        rellenar(num);
    }
    
}
