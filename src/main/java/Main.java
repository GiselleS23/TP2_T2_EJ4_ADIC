/* 4.- Desarrolle un diagrama de flujo que calcule el total de consumo de un cliente en un restaurant dada la cantidad consumida de 4 productos y el precio unitario de cada uno.
  Sacchetti, Maria Giselle C2 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double precUnitProd1;
    double precUnitProd2;
    double precUnitProd3;
    double precUnitProd4;

    double cantProd1;
    double cantProd2;
    double cantProd3;
    double cantProd4;

    double totalConsumo;
    

    System.out.println("Ingrese el precio unitario del producto 1");
    precUnitProd1 = scanner.nextDouble();
    System.out.println("Ingrese la cantidad del producto 1");
    cantProd1 = scanner.nextDouble();

    System.out.println("Ingrese el precio unitario del producto 2");
    precUnitProd2 = scanner.nextDouble();
    System.out.println("Ingrese la cantidad del producto 2");
    cantProd2 = scanner.nextDouble();

    System.out.println("Ingrese el precio unitario del producto 3");
    precUnitProd3 = scanner.nextDouble();
    System.out.println("Ingrese la cantidad del producto 3");
    cantProd3 = scanner.nextDouble();

    System.out.println("Ingrese el precio unitario del producto 4");
    precUnitProd4 = scanner.nextDouble();
    System.out.println("Ingrese la cantidad del producto 4");
    cantProd4 = scanner.nextDouble();

    totalConsumo = (precUnitProd1 * cantProd1) + (precUnitProd2 * cantProd2) + (precUnitProd3 * cantProd3)
        + (precUnitProd4 * cantProd4);
    System.out.println("El total del consumo del cliente es: "+ totalConsumo);
    scanner.close();
  }

}