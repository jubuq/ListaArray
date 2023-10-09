import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class OrdenarArrayList {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite os números separados por espaço:");
 String input = scanner.nextLine();
 Integer[] numerosArray = Arrays.stream(input.split("\\s+"))
 .filter(s -> !s.equalsIgnoreCase("fim"))
 .map(Integer::parseInt)
 .toArray(Integer[]::new);
 ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(numerosArray));
 Collections.sort(numeros);
 System.out.println("Valores ordenados em ordem crescente:");
 for (int numero : numeros) {
 System.out.println(numero);
 }
 scanner.close();
 }
}