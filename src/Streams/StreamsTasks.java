package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsTasks {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 144, 123, 12333, 122));
        List<String> stringList = new ArrayList<>(Arrays.asList("ania", "samochod", "kot", "samolot"));

        User u1 = new User("Adam", 20);
        User u2 = new User("Ania", 18);
        User u3 = new User("Kasia", 17);
        User u4 = new User("Zosia", 22);
        User u5 = new User("Jan", 25);

        List<User> userList = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5));

        //POZIOM 1 — PODSTAWY
        //1️⃣ Z listy List<Integer> zwróć tylko liczby parzyste
        System.out.println("Ex_1: " + findParzyste(numbers));
        //2️⃣ Z listy List<Integer> zwróć nową listę, gdzie każda liczba jest pomnożona ×2
        System.out.println("Ex_2: " + returnNewListX(numbers, 2));
        //3️⃣ Z listy List<String> zwróć wszystkie napisy zamienione na wielkie litery
        System.out.println("Ex_3: " + returnListStringWithBigLetters(stringList));
        //4️⃣ Policz ile elementów w liście List<Integer> jest większych niż 10
        System.out.println("Ex_4: " + countHowManyNumbersIsMoreThanX(numbers, 10));
        //5️⃣ Znajdź pierwszy element większy niż 100 i zwróć go jako Optional<Integer>
        System.out.println("Ex_5: " + findNumberMoreThanX(numbers, 100));

        //🟡 POZIOM 2 — ŁĄCZENIE OPERACJI
        //6️⃣ Z listy liczb zwróć tylko te większe niż 5, następnie pomnóż je ×3 i zwróć listę
        System.out.println("Ex_6: " + returnNumbersBiggerThanXAndMultiplyX(numbers, 5, 3));
        //7️⃣ Z listy List<Integer> usuń duplikaty
        System.out.println("Ex_7: " + deleteDuplicate(numbers));
        //8️⃣ Posortuj listę List<Integer> malejąco
        System.out.println("Ex_8: " + sortListSDescending(numbers));
        //9️⃣ Zwróć pierwsze 5 elementów z listy
        System.out.println("Ex_9: " + returnOnlyXElementsList(numbers, 5));
        //🔟 Sprawdź czy w liście istnieje liczba większa niż 5
        System.out.println("Ex_10: " + checkNumberXIsOnTheList(numbers, 50));

        //🟠 POZIOM 3 — ŚREDNIO TRUDNE
        //11️⃣ Znajdź największą liczbę w liście
        System.out.println("Ex_11: " + findBiggestNumberOnList(numbers));
        //12️⃣ Znajdź najdłuższy napis w List<String>
        System.out.println("Ex_12: " + findLongestString(stringList));
        //13️⃣ Połącz wszystkie napisy z listy List<String> w jeden String
        System.out.println("Ex_13: " + returnOneString(stringList));
        //14️⃣ Oblicz średnią wartość z listy liczb
        System.out.println("Ex_14: " + returnAverage(numbers));
        //15️⃣ Sprawdź czy wszystkie liczby w liście są dodatnie
        System.out.println("Ex_15: " + checkIfNumbersArePositive(numbers));

        //🔴 POZIOM 4 — OBIEKTY
        //Załóż klasę:
        //class User {
        //    String name;
        //    int age;
        //}
        //16️⃣ Z listy użytkowników zwróć tych, którzy mają więcej niż 18 lat
        System.out.println("Ex_16: " + findUsersWithAgeMoreThanX(userList, 18));
        //17️⃣ Z listy użytkowników zwróć listę ich imion
        System.out.println("Ex_17: " + returnUserNames(userList));
        //18️⃣ Znajdź najstarszego użytkownika
        System.out.println("Ex_18: " + findOldestUser(userList));

        List<String> stringList1 = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b", "a"));
        //🟣 POZIOM 5 — TRUDNE
        //19️⃣ Zgrupuj użytkowników według wieku (Map<Integer, List<User>>)
        System.out.println("Ex_19: " + groupUserByage(userList));
        //20️⃣ Z listy ["a", "b", "a", "c", "b", "a"] zlicz wystąpienia elementów i zwróć Map<String, Long>
        System.out.println("Ex_20: " + countOccurrence(stringList1));
        //🔥 BONUS
        //21️⃣ Znajdź drugą największą liczbę w liście (uwzględnij duplikaty)
        System.out.println("Ex_21: " + findXNumberOnList(numbers, 2, 1));


    }


    //POZIOM 1 — PODSTAWY
    //1️⃣ Z listy List<Integer> zwróć tylko liczby parzyste
    public static List<Integer> findParzyste(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

    }

    //2️⃣ Z listy List<Integer> zwróć nową listę, gdzie każda liczba jest pomnożona ×2
    public static List<Integer> returnNewListX(List<Integer> list, int num) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(i -> i * num)
                .collect(Collectors.toList());
    }

    //3️⃣ Z listy List<String> zwróć wszystkie napisy zamienione na wielkie litery
    public static List<String> returnListStringWithBigLetters(List<String> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //4️⃣ Policz ile elementów w liście List<Integer> jest większych niż 10
    public static Long countHowManyNumbersIsMoreThanX(List<Integer> list, int numb) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(i -> i > 10)
                .count();
    }

    //5️⃣ Znajdź pierwszy element większy niż 100 i zwróć go jako Optional<Integer>
    public static Optional<Integer> findNumberMoreThanX(List<Integer> list, int numb) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(i -> i > numb)
                .findFirst();
    }

    //🟡 POZIOM 2 — ŁĄCZENIE OPERACJI
    //6️⃣ Z listy liczb zwróć tylko te większe niż 5, następnie pomnóż je ×3 i zwróć listę
    public static List<Integer> returnNumbersBiggerThanXAndMultiplyX(List<Integer> list, int bigger, int multiply) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(i -> i > bigger)
                .map(i -> i * multiply)
                .collect(Collectors.toList());
    }

    //7️⃣ Z listy List<Integer> usuń duplikaty
    public static List<Integer> deleteDuplicate(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
    }

    //8️⃣ Posortuj listę List<Integer> malejąco
    public static List<Integer> sortListSDescending(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    //9️⃣ Zwróć pierwsze 5 elementów z listy
    public static List<Integer> returnOnlyXElementsList(List<Integer> list, int limit) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .limit(limit)
                .collect(Collectors.toList());
    }

    //🔟 Sprawdź czy w liście istnieje liczba większa niż 50
    public static boolean checkNumberXIsOnTheList(List<Integer> list, int number) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .anyMatch(i -> i > number);
    }

    //🟠 POZIOM 3 — ŚREDNIO TRUDNE
    //11️⃣ Znajdź największą liczbę w liście
    public static Optional<Integer> findBiggestNumberOnList(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Integer::compare);
    }

    //12️⃣ Znajdź najdłuższy napis w List<String>
    public static Optional<String> findLongestString(List<String> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length));
    }

    //13️⃣ Połącz wszystkie napisy z listy List<String> w jeden String
    public static String returnOneString(List<String> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }

    //14️⃣ Oblicz średnią wartość z listy liczb
    public static double returnAverage(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    //15️⃣ Sprawdź czy wszystkie liczby w liście są dodatnie
    public static boolean checkIfNumbersArePositive(List<Integer> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .anyMatch(i -> i > 0);
    }

    //🔴 POZIOM 4 — OBIEKTY
    //Załóż klasę:
    //class User {
    //    String name;
    //    int age;
    //}
    //16️⃣ Z listy użytkowników zwróć tych, którzy mają więcej niż 18 lat
    public static List<User> findUsersWithAgeMoreThanX(List<User> list, int a) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(user -> user.getAge() > a)
                .collect(Collectors.toList());
    }

    //17️⃣ Z listy użytkowników zwróć listę ich imion
    public static List<String> returnUserNames(List<User> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(User::getName)
                .collect(Collectors.toList());

    }

    //18️⃣ Znajdź najstarszego użytkownika
    public static User findOldestUser(List<User> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(User::getAge))
                .orElse(null);
    }

    //🟣 POZIOM 5 — TRUDNE
    //19️⃣ Zgrupuj użytkowników według wieku (Map<Integer, List<User>>)
    public static Map<Integer, List<User>> groupUserByage(List<User> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(User::getAge));
    }

    //20️⃣ Z listy ["a", "b", "a", "c", "b", "a"] zlicz wystąpienia elementów i zwróć Map<String, Long>
    public static Map<String, Long> countOccurrence(List<String> list) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    //🔥 BONUS
    //21️⃣ Znajdź drugą największą liczbę w liście (uwzględnij duplikaty)
    public static int findXNumberOnList(List<Integer> list, int number, int skip) {
        return Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .skip(skip)
                .findFirst()
                .orElse(0);
    }
}
