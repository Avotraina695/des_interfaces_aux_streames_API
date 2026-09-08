import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Exercice2 {
    public static void main(String[] args){
        List<String> noms = List.of("Anna", "Bob", "Alexandre", "Alice", "Bruno");
        // Affichage de tous les noms
        System.out.println("##Affichage de tous les noms");
        noms.forEach(System.out::println);

        //Affichage des noms qui commencent par A
        System.out.println("##Affichage des noms qui commencent par A");
        noms.stream()
                .filter(nom -> nom.startsWith("A"))
                .forEach(System.out::println);

        // Transformation  de tous les noms en majuscules
        System.out.println("##Transformation  de tous les noms en majuscules");
        List<String> nomsMajuscules = noms.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Nom en majuscules : " + nomsMajuscules);

        // Trie par ordre alphabetique
        System.out.println("Trie par ordre alphabetique");
        List<String> nomsTries =   noms.stream()
                .sorted()
                .toList();
        System.out.println("Nom trie par ordre alphabetique :" + nomsTries);
        // Trie par a l'inverse
        System.out.println("Trie a l'inverse");
        List<String>nomsTrieInverse = noms.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Nom trie a l'inverse " + nomsTrieInverse);
        // Noms ayant superieur a 5
        System.out.println("Nom ayant plus de 5 caracteres");
        long compteurNomSup5 =  noms.stream()
                .filter(nom -> nom.length() > 5)
                .count();

        System.out.println("Nombre de nom ayant plus de 5 caracteres :" + compteurNomSup5);
    }
}
