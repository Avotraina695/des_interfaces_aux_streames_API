
import java.util.Comparator;
import java.util.List;


public class Exercice3 {
    public static void main(String[] args){
        List<Double> notes = List.of(12.0 , 10.3 , 7.5 , 4.0 , 10.0);

        System.out.print("Affichage des nombre superieures ou egales a 10 :");
        notes.stream()
                .filter(n -> n >= 10)
                .forEach(System.out::println);

        System.out.println("Calcul le nombre d'admis ");
        long nombreAdmis = notes.stream()
                .filter(n -> n >= 10)
                        .count();
        System.out.println("Le nombre d'admis est : " + nombreAdmis);
        System.out.print("La moyenne est :");
        double moyenne = notes.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(moyenne);
        System.out.print("Affichage meilleur note : ");
        double maximum = notes.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
        System.out.println(maximum);

        List<Double> trie = notes.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Notes triees :"+ trie);
    }
}
