# Exercices Java — Lambdas, Interfaces fonctionnelles et Streams

## 📚 Description

Ce projet contient plusieurs exercices en **Java** permettant de pratiquer :

* les interfaces fonctionnelles ;
* les expressions lambda ;
* les références de méthodes ;
* les `Streams` Java ;
* le filtrage avec `filter()` ;
* la transformation avec `map()` ;
* le tri avec `sorted()` ;
* le comptage avec `count()` ;
* les opérations numériques avec `mapToDouble()` ;
* le calcul de moyenne et de maximum.

---

## 📁 Exercices

### Exercice 1 — Interface fonctionnelle et opérations

L'exercice définit une interface fonctionnelle `Operation` :

```java
@FunctionalInterface
interface Operation {
    double calculer(double a, double b);
}
```

Elle permet de représenter différentes opérations mathématiques.

Les opérations implémentées sont :

* Addition
* Soustraction
* Multiplication
* Maximum
* Division

Exemple :

```java
Operation multiplication = (a, b) -> a * b;
```

Une méthode `appliquer()` permet ensuite d'exécuter l'opération :

```java
public static double appliquer(double a, double b, Operation op) {
    return op.calculer(a, b);
}
```

La division vérifie également le cas où le diviseur est égal à zéro.

---

### Exercice 2 — Manipulation d'une liste de noms

Cet exercice utilise une liste de noms :

```text
Anna
Bob
Alexandre
Alice
Bruno
```

Les opérations réalisées sont :

1. Afficher tous les noms.
2. Afficher uniquement les noms commençant par `A`.
3. Transformer tous les noms en majuscules.
4. Trier les noms par ordre alphabétique.
5. Trier les noms dans l'ordre inverse.
6. Compter les noms contenant plus de 5 caractères.

Exemple de filtrage :

```java
noms.stream()
    .filter(nom -> nom.startsWith("A"))
    .forEach(System.out::println);
```

---

### Exercice 3 — Manipulation de notes

Cet exercice utilise une liste de notes :

```text
12.0
10.3
7.5
4.0
10.0
```

Les opérations réalisées sont :

* afficher les notes supérieures ou égales à `10` ;
* compter le nombre d'admis ;
* calculer la moyenne ;
* trouver la meilleure note ;
* trier les notes dans l'ordre décroissant.

Exemple pour calculer la moyenne :

```java
double moyenne = notes.stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0.0);
```

---

## 🛠️ Technologies utilisées

* **Java**
* `List`
* `Stream API`
* Expressions lambda
* Interfaces fonctionnelles
* Références de méthodes
* `Comparator`

---

## ▶️ Compilation et exécution

Vérifier que Java est installé :

```bash
java --version
```

Compiler les fichiers :

```bash
javac Exercice1.java
javac Exercice2.java
javac Exercice3.java
```

Puis exécuter chaque exercice :

```bash
java Exercice1
java Exercice2
java Exercice3
```

> Si plusieurs classes sont placées dans un même fichier, il faut respecter les règles Java concernant les classes `public` et le nom du fichier.

---

## 🎯 Objectif pédagogique

L'objectif de ce projet est de se familiariser avec la programmation fonctionnelle en Java et avec la **Stream API**.

Ces exercices permettent notamment de comprendre la différence entre une approche classique avec des boucles et une approche utilisant :

```java
stream()
    .filter()
    .map()
    .sorted()
    .count()
```

---

## 👨‍💻 Auteur

Projet réalisé dans le cadre de l'apprentissage de **Java** et de la programmation fonctionnelle.

---

## 📝 Notions à retenir

| Notion                 | Utilisation                            |
| ---------------------- | -------------------------------------- |
| `@FunctionalInterface` | Définir une interface fonctionnelle    |
| `lambda`               | Écrire une fonction de manière concise |
| `::`                   | Référence vers une méthode             |
| `stream()`             | Parcourir et traiter une collection    |
| `filter()`             | Filtrer les éléments                   |
| `map()`                | Transformer les éléments               |
| `sorted()`             | Trier les éléments                     |
| `count()`              | Compter les éléments                   |
| `average()`            | Calculer une moyenne                   |
| `max()`                | Trouver la valeur maximale             |
