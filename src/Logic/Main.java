package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Napisz metodę:
        //public static void bubbleSort(int[] tab)
        //Wymagania:
        //Posortuj tablicę rosnąco.
        //Nie używaj Arrays.sort().
        //Zastosuj obie optymalizacje Bubble Sort:
        //skracanie zakresu wewnętrznej pętli,
        //wcześniejsze zakończenie algorytmu, jeśli nie wykonano żadnej zamiany.
        //Na końcu wypisz posortowaną tablicę.
        int[] tab = {4, 3, 55, 6, 2, 77};
        bubbleSort(tab);

        //Zadanie 1 — Smallest Number
        //Masz trzy liczby całkowite.
        //Znajdź i zwróć najmniejszą z nich.
        System.out.println("1: " + smallestNumber(4, 13, 22));

        //Zadanie 2 — Sort Two Numbers
        //Masz dwie liczby.
        //Jeśli są w złej kolejności, zamień je miejscami.
        //Zwróć je rosnąco.
        System.out.println("2: " + sortTwoNumbers(3, 7));

        //Zadanie 3 — Sort Four Numbers
        //Masz cztery liczby całkowite.
        //Zwróć je w kolejności rosnącej.
        //Bez używania gotowego sortowania.
        System.out.println("3: " + sortFourNumbers(4, 33, 12, 1));

        int[] tab1 = {1, 22, 33, 44, 54, 6, 78,};
        //Zadanie 4 — Second Largest
        //Masz tablicę liczb całkowitych.
        //Znajdź drugą największą liczbę.
        //Bez sortowania.
        System.out.println("4: " + secondLargest(tab1));

        //Zadanie 5 — Closest To 100
        //Masz dwie liczby.
        //Sprawdź, która jest bliżej liczby 100.
        //Zwróć tę liczbę.
        //Jeśli są równie blisko — zwróć 0.
        System.out.println("5: " + closestTo100(19, 123));

        //Zadanie 6 — Between Range
        //Sprawdź, czy liczba mieści się w przedziale:
        //30–40 lub 90–100
        //Jeśli tak — zwróć true.
        System.out.println("6: " + betweenRange(33));

        //Zadanie 7 — Reverse String
        //Masz napis.
        //Zwróć go od tyłu.
        //Np.
        //"java" → "avaj"
        System.out.println("7: " + reverseString1("ania"));
        System.out.println(reverseString2("ania"));

        //Zadanie 8 — Count Character
        //Policz, ile razy znak 'a' występuje w napisie.
        //Np.
        //"banana" → 3
        System.out.println("8: " + countCharacter("banana", 'a'));

        //Zadanie 9 — First Half
        //Zwróć pierwszą połowę napisu.
        //Zakładamy, że długość napisu jest parzysta.
        //Np.
        //"WooHoo" → "Woo"
        System.out.println("9: " + firstHalf("WooHoo"));

        //Zadanie 10 — Array Contains
        //Sprawdź, czy tablica zawiera liczbę 7.
        //Jeśli tak — zwróć true.
        System.out.println("10: " + arrayContains(tab, 7));

        //Zadania sortowanie
        //Zadanie 1 — Sort Two Numbers
        //Masz dwie liczby całkowite.
        //Ustaw je w kolejności rosnącej i zwróć wynik.
        //Np.
        //8, 3 → 3, 8
        System.out.println("1: " + sortTwoNumbers(8, 3));

        //Zadanie 2 — Sort Three Numbers
        //Masz trzy liczby całkowite.
        //Posortuj je rosnąco.
        //Bez używania gotowego sortowania.
        //Np.
        //7, 2, 5 → 2, 5, 7
        System.out.println("2: " + sortThreeNumbers(7, 2, 5));

        //Zadanie 3 — Find Max While Sorting
        //Masz tablicę liczb całkowitych.
        //Podczas przechodzenia przez tablicę znajdź największą wartość.
        //Nie używaj Arrays.sort().
        //Np.
        //[4, 9, 2, 7] → 9
        System.out.println("3: " + findMaxWhileSorting(tab));

        //Zadanie 4 — Bubble Sort Basic
        //Masz tablicę liczb całkowitych.
        //Posortuj ją rosnąco ręcznie, używając porównywania sąsiednich elementów i zamiany miejscami.
        //Nie używaj gotowego sortowania.
        //Np.
        //[5, 2, 8, 1] → [1, 2, 5, 8]
        System.out.println("4: " + Arrays.toString(bubbleSortBasic(tab)));

        //Zadanie 5 — Move Largest To End
        //Masz tablicę liczb całkowitych.
        //W jednym przejściu przez tablicę spraw, żeby największy element „przesunął się” na koniec tablicy.
        //(To jest jedna runda Bubble Sort.)
        //Np.
        //[4, 2, 7, 1] → [2, 4, 1, 7]
        System.out.println("5: " + Arrays.toString(moveLargestToEnd(tab)));


        //Zestaw I – Logika i sortowanie (5 zadań)
        //Napisz program, który posortuje tablicę liczb całkowitych rosnąco bez użycia gotowych metod sortujących.
        int[] tab2 = {4, 3, 2, 5, 6, 75, 2};
        System.out.println("1");
        sortTab(tab);
        System.out.println();

        //Posortuj tablicę w taki sposób, aby wszystkie liczby parzyste znajdowały się przed nieparzystymi.
        // W obrębie każdej grupy liczby mają być posortowane rosnąco.
        System.out.println("2");
        sortTabParzysteNieparzyste(tab);
        System.out.println();

        //Dla podanej macierzy liczb całkowitych posortuj każdy wiersz niezależnie w kolejności malejącej.
        int[][] tabMatrix = new int[5][5];
        addToTab(tabMatrix);
        sortMatrixInRow(tabMatrix);
        printTab(tabMatrix);


        //Second Smallest
        //Masz tablicę liczb całkowitych.
        //Znajdź drugą najmniejszą liczbę.
        //Bez używania sortowania.
        System.out.println(secondSmallest(tab));

        //Middle Value
        //Masz trzy różne liczby.
        //Zwróć tę, która nie jest ani największa, ani najmniejsza.
        //Np.
        //7, 2, 5 → 5
        int[] tabMidValue = {7, 2, 5};
        System.out.println(middleValue(tabMidValue));

        //Already Sorted Descending
        //Sprawdź, czy tablica jest już posortowana malejąco.
        //Np.
        //[9, 7, 4, 1] → true
        //[9, 3, 7, 1] → false
        int[] tabCheckSorted = {9, 7, 4, 1};
        int[] tabCheckSorted2 = {9, 3, 7, 1};
        System.out.println(alreadySortedDescending(tabCheckSorted));

        //Move Largest To Front
        //Znajdź największy element i przenieś go na początek tablicy.
        //Bez używania sortowania.
        System.out.println(Arrays.toString(moveLargestToFront(tab)));

        //Count Duplicates
        //Masz tablicę liczb.
        //Policz, ile wartości występuje więcej niż jeden raz.
        //Np.
        //[1, 2, 2, 3, 3, 3] → 2
        //(bo duplikaty to 2 i 3)
        int[] tab4 = {1, 2, 2, 3, 3, 3};
        System.out.println(countDuplicate(tab4));

        //First Non-Repeated Character
        //Masz napis.
        //Znajdź pierwszy znak, który występuje tylko raz.
        //Np.
        //"swiss" → 'w'

        //Palindrome Number
        //Sprawdź, czy liczba jest palindromem.
        //Np.
        //121 → true
        //123 → false

        //Longest Word
        //Masz zdanie.
        //Znajdź najdłuższe słowo.
        //Np.
        //"Java is very powerful" → "powerful"

        //Remove Duplicates (logic)
        //Masz posortowaną tablicę liczb.
        //Usuń logicznie duplikaty (bez używania Set).
        //Np.
        //[1,1,2,2,3,4,4] → [1,2,3,4]

        //Posortuj wszystkie elementy macierzy rosnąco, zachowując jej pierwotny rozmiar.

        //Posortuj tablicę napisów:
        //najpierw według długości napisu,
        //następnie alfabetycznie, jeśli długość jest taka sama.
        //Zestaw II – Logika (5 zadań)

        //Znajdź drugi największy element tablicy bez wcześniejszego sortowania.

        //Sprawdź, czy dwie tablice zawierają dokładnie te same elementy, niezależnie od ich kolejności.

        //Znajdź element, który występuje najczęściej w tablicy.

        //Przesuń wszystkie zera na koniec tablicy, zachowując kolejność pozostałych elementów.

        //Znajdź najdłuższy rosnący fragment tablicy i zwróć jego długość.

        //String
        //Sprawdź, czy dwa napisy są anagramami.

        //String
        //Znajdź pierwszy niepowtarzający się znak w napisie.

        //Kolekcje
        //Policz liczbę wystąpień każdego słowa w tekście.

        //Kolekcje
        //Usuń duplikaty z listy, zachowując kolejność pierwszych wystąpień.

        //HashMap
        //Odwróć mapę, zamieniając miejscami klucze i wartości. Załóż, że wartości są unikalne.

        //OOP
        //Utwórz klasę Pracownik, a następnie posortuj listę pracowników:
        //według pensji malejąco,
        //przy tej samej pensji według nazwiska.

        //Tablice dwuwymiarowe
        //Znajdź największą sumę elementów w jednym wierszu macierzy.

        //Macierze
        //Sprawdź, czy dana macierz jest symetryczna.

        //Algorytmy
        //Znajdź wszystkie liczby pierwsze z zakresu od 2 do n możliwie najwydajniejszym sposobem.

        //Logika biznesowa
        //Masz listę zamówień zawierających:
        //identyfikator klienta,
        //wartość zamówienia,
        //datę.

        //Oblicz łączną wartość zamówień każdego klienta i wyświetl ranking klientów malejąco według sumy zakupów.
        //Bonus – Poziom Mid (5 wyzwań)

        //Zaimplementuj własną klasę dynamicznej tablicy bez użycia ArrayList.

        //Napisz własną implementację stosu (Stack) opartą na tablicy.

        //Zaimplementuj kolejkę (Queue) bez użycia klas z biblioteki Java.

        //Napisz program wykrywający cykl w grafie reprezentowanym jako lista sąsiedztwa.

        //Dla bardzo dużego pliku tekstowego znajdź 10 najczęściej występujących słów, minimalizując zużycie pamięci.

    }

    public static void bubbleSort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int temp;
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(tab));
    }

    //Smallest Number
    //Masz trzy liczby całkowite.
    //Znajdź i zwróć najmniejszą z nich.
    public static int smallestNumber(int a, int b, int c) {
        int n = 0;
        if (a < b && a < c) {
            n = a;
        } else if (b < a && b < c) {
            n = b;
        } else if (c < a && c < b) {
            n = c;
        }
        return n;
    }

    //Sort Two Numbers
    //Masz dwie liczby.
    //Jeśli są w złej kolejności, zamień je miejscami.
    //Zwróć je rosnąco.
    public static List<Integer> sortTwoNumbers(int a, int b) {
        List<Integer> list = new ArrayList<>();
        if (a > b) {
            list.add(a);
            list.add(b);
        } else if (b > a) {
            list.add(b);
            list.add(a);
        }
        return list;
    }

    //Sort Four Numbers
    //Masz cztery liczby całkowite.
    //Zwróć je w kolejności rosnącej.
    //Bez używania gotowego sortowania.
    public static List<Integer> sortFourNumbers(int a, int b, int c, int d) {
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));
        List<Integer> sorted = new ArrayList<>();
        for (int i : list) {
            int temp = 0;
            if (i > temp) {
                temp = i;
                sorted.add(temp);
            }
        }
        return sorted;
    }

    //Second Largest
    //Masz tablicę liczb całkowitych.
    //Znajdź drugą największą liczbę.
    //Bez sortowania.
    public static int secondLargest(int[] tab) {
        int biggest = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > biggest) {
                biggest = tab[i];
            }
        }
        return biggest;
    }

    //Closest To 100
    //Masz dwie liczby.
    //Sprawdź, która jest bliżej liczby 100.
    //Zwróć tę liczbę.
    //Jeśli są równie blisko — zwróć 0.
    public static int closestTo100(int a, int b) {
        int n = 0;
        if (Math.abs(a - 100) < Math.abs(b - 100)) {
            n = a;
        } else if (Math.abs(a - 100) == Math.abs(b - 100)) {
            return 0;
        } else {
            n = b;
        }
        return n;
    }

    //Between Range
    //Sprawdź, czy liczba mieści się w przedziale:
    //30–40 lub 90–100
    //Jeśli tak — zwróć true.
    public static boolean betweenRange(int a) {
        return ((a >= 30 && a <= 40) || (a >= 90 && a <= 100));
    }

    //Reverse String
    //Masz napis.
    //Zwróć go od tyłu.
    //Np.
    //"java" → "avaj"
    public static String reverseString1(String str) {
        String s = "";
        for (int i = str.length(); i > 0; i--) {
            s += str;
        }
        return s;
    }

    public static String reverseString2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    //Count Character
    //Policz, ile razy znak 'a' występuje w napisie.
    //Np.
    //"banana" → 3
    public static int countCharacter(String str, char a) {
        int count = 0;
        if (str.contains(String.valueOf(a))) {
            count++;
        }
        return count;
    }

    //First Half
    //Zwróć pierwszą połowę napisu.
    //Zakładamy, że długość napisu jest parzysta.
    //Np.
    //"WooHoo" → "Woo"
    public static String firstHalf(String str) {
        int leng = str.length() / 2;
        return str.substring(0, leng);
    }

    //Array Contains
    //Sprawdź, czy tablica zawiera liczbę 7.
    //Jeśli tak — zwróć true.
    public static boolean arrayContains(int[] tab, int number) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == number) {
                return true;
            }
        }
        return false;
    }

    //Second Smallest
    //Masz tablicę liczb całkowitych.
    //Znajdź drugą najmniejszą liczbę.
    //Bez używania sortowania.
    public static int secondSmallest(int[] tab) {
        int min = tab[0];
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                second = min;
                min = tab[i];
            } else if (tab[i] < second && tab[i] > min) {
                second = tab[i];
            }
        }
        return second;
    }

    //Middle Value
    //Masz trzy różne liczby.
    //Zwróć tę, która nie jest ani największa, ani najmniejsza.
    //Np.
    //7, 2, 5 → 5
    public static int middleValue(int[] tab) {
        int min = findMin(tab);
        int max = findMax(tab);
        int mid = 0;
        for (int i = 0; i < tab.length; i++) {
            mid += tab[i];
        }
        mid = mid - max - min;
        return mid;
    }

    public static int findMin(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int findMax(int[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    //Already Sorted Descending
    //Sprawdź, czy tablica jest już posortowana malejąco.
    //Np.
    //[9, 7, 4, 1] → true
    //[9, 3, 7, 1] → false
    public static boolean alreadySortedDescending(int[] tab) {
        boolean sort = true;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] < tab[i + 1]) {
                sort = false;
            }

        }
        return sort;
    }

    //Move Largest To Front
    //Znajdź największy element i przenieś go na początek tablicy.
    //Bez używania sortowania.
    public static int[] moveLargestToFront(int[] tab) {
        int max = tab[0];
        int number = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                number = i;
            }
        }
        int temp = tab[0];
        tab[0] = tab[number];
        tab[number] = temp;
        return tab;
    }


    //Count Duplicates
    //Masz tablicę liczb.
    //Policz, ile wartości występuje więcej niż jeden raz.
    //Np.
    //[1, 2, 2, 3, 3, 3] → 2
    //(bo duplikaty to 2 i 3)
    public static int countDuplicate(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    counted = true;
                }
            }
            if (counted) {
                continue;
            }
            for (int k = i + 1; k < tab.length; k++) {
                if (tab[i] == tab[k]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //First Non-Repeated Character
    //Masz napis.
    //Znajdź pierwszy znak, który występuje tylko raz.
    //Np.
    //"swiss" → 'w'
//    public static String firstNonRepeatedChar(String str) {
//        String s = "";
//        for (int i = 0; i < ; i++) {
//
//        }
//    }

    //Palindrome Number
    //Sprawdź, czy liczba jest palindromem.
    //Np.
    //121 → true
    //123 → false

    //Longest Word
    //Masz zdanie.
    //Znajdź najdłuższe słowo.
    //Np.
    //"Java is very powerful" → "powerful"

    //Remove Duplicates (logic)
    //Masz posortowaną tablicę liczb.
    //Usuń logicznie duplikaty (bez używania Set).
    //Np.
    //[1,1,2,2,3,4,4] → [1,2,3,4]


    //🧠First Unique Number
    //Masz tablicę liczb całkowitych.
    //Znajdź pierwszą liczbę, która występuje tylko raz.
    //Przykład:
    //[4, 5, 1, 2, 1, 2, 4]
    //wynik:
    //5

    //🧠Count Pairs
    //Policz, ile par takich samych liczb znajduje się w tablicy.
    //Przykład:
    //[1,1,2,2,2,3]
    //wynik:
    //2
    //(pary: 1-1 i jedna para 2-2)

    //🧠Find Missing Number
    //Masz tablicę liczb od 1 do n.
    //Jednej liczby brakuje.
    //Znajdź brakującą liczbę.
    //Przykład:
    //[1,2,3,5]
    //wynik:
    //4

    //🧠Move Zeros To End
    //Przenieś wszystkie zera na koniec tablicy.
    //Kolejność pozostałych elementów ma zostać zachowana.
    //Przykład:
    //[1,0,2,0,3]
    //wynik:
    //[1,2,3,0,0]

    //🧠Largest Difference
    //Znajdź największą różnicę między dwoma elementami tablicy:
    //większy - mniejszy
    //Przykład:
    //[2, 3, 10, 6, 4, 8, 1]
    //wynik:
    //8
    //(10 - 2)

    //🧠Check Rotation
    //Sprawdź, czy jedna tablica jest rotacją drugiej.
    //Przykład:
    //[1,2,3,4]
    //[3,4,1,2]
    //→ true

    //🧠Longest Increasing Sequence
    //Znajdź długość najdłuższego rosnącego fragmentu tablicy.
    //Przykład:
    //[1,2,3,1,2,3,4]
    //wynik:
    //4

    //🧠Remove Duplicates
    //Usuń duplikaty z tablicy.
    //Zachowaj pierwsze wystąpienie.
    //Przykład:
    //[1,2,2,3,1]
    //wynik:
    //[1,2,3]

    //🧠Is Palindrome Array
    //Sprawdź, czy tablica czyta się tak samo od początku i od końca.
    //Przykład:
    //[1,2,3,2,1]
    //→ true

    //🧠Two Sum
    //Masz tablicę oraz liczbę target.
    //Sprawdź, czy istnieją dwie liczby, których suma daje target.
    //Przykład:
    //[2,7,11,15]
    //target = 9
    //→ true
    //(2 + 7)

    //Zadania sortowanie
    //Zadanie 1 — Sort Two Numbers
    //Masz dwie liczby całkowite.
    //Ustaw je w kolejności rosnącej i zwróć wynik.
    //Np.
    //8, 3 → 3, 8
    public static List<Integer> sortTwoNumbersSort(int a, int b) {
        List<Integer> list = new ArrayList<>();
        if (a > b) {
            list.add(a);
            list.add(b);
        } else if (b > a) {
            list.add(b);
            list.add(a);
        }
        return list;
    }

    //Sort Three Numbers
    //Masz trzy liczby całkowite.
    //Posortuj je rosnąco.
    //Bez używania gotowego sortowania.
    //Np.
    //7, 2, 5 → 2, 5, 7
    public static List<Integer> sortThreeNumbers(int a, int b, int c) {
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c));
        int temp = 0;
        for (int i : list) {
            if (i > temp) {
                temp = i;
            }
        }
        return list;
    }

    //Find Max While Sorting
    //Masz tablicę liczb całkowitych.
    //Podczas przechodzenia przez tablicę znajdź największą wartość.
    //Nie używaj Arrays.sort().
    //Np.
    //[4, 9, 2, 7] → 9
    public static int findMaxWhileSorting(int[] tab) {
        int temp = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > temp) {
                temp = tab[i];
            }
        }
        return temp;
    }

    //Bubble Sort Basic
    //Masz tablicę liczb całkowitych.
    //Posortuj ją rosnąco ręcznie, używając porównywania sąsiednich elementów i zamiany miejscami.
    //Nie używaj gotowego sortowania.
    //Np.
    //[5, 2, 8, 1] → [1, 2, 5, 8]
    public static int[] bubbleSortBasic(int[] tab) {
        int temp = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > temp) {
                temp = tab[i];
                tab[i + 1] = temp;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        return tab;
    }

    //Move Largest To End
    //Masz tablicę liczb całkowitych.
    //W jednym przejściu przez tablicę spraw, żeby największy element „przesunął się” na koniec tablicy.
    //(To jest jedna runda Bubble Sort.)
    //Np.
    //[4, 2, 7, 1] → [2, 4, 1, 7]
    public static int[] moveLargestToEnd(int[] tab) {
        for (int i = 0; i < 1; i++) {
            int temp = 0;
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    tab[i] = temp;
                    temp = tab[j];
                }
            }
        }
        return tab;
    }

    //Napisz program, który posortuje tablicę liczb całkowitych rosnąco bez użycia gotowych metod sortujących.
    public static void sortTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int temp;
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {  // 4 > 3
                    temp = tab[j + 1];      // temp = 3
                    tab[j + 1] = tab[j];    // zamiana 3 na 4
                    tab[j] = temp;          // zamiana 4 na 3
                }
            }
        }
        System.out.print(Arrays.toString(tab));
    }

    //Posortuj tablicę w taki sposób, aby wszystkie liczby parzyste znajdowały się przed nieparzystymi.
    // W obrębie każdej grupy liczby mają być posortowane rosnąco.
    public static void sortTabParzysteNieparzyste(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int temp;
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1] && tab[j] % 2 != 0) {
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(tab));
    }


    //Dla podanej macierzy liczb całkowitych posortuj każdy wiersz niezależnie w kolejności malejącej.
    public static void sortMatrixInRow(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            int temp;
            for (int j = 0; j < tab[i].length - 1; j++) {
                for (int k = 0; k < tab[j].length - 1; k++) {
                    if (tab[i][j] > tab[i][j + 1]) {
                        temp = tab[i][j + 1];
                        tab[i][j + 1] = tab[i][j];
                        tab[i][j] = temp;
                    }
                }
            }
        }
    }

    public static void addToTab(int[][] tab) {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int n = random.nextInt(99) + 1;
                tab[i][j] = n;
            }
        }
    }

    public static void printTab(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
        }
    }

    //Posortuj wszystkie elementy macierzy rosnąco, zachowując jej pierwotny rozmiar.

    //Posortuj tablicę napisów:
    //najpierw według długości napisu,
    //następnie alfabetycznie, jeśli długość jest taka sama.

    //Znajdź drugi największy element tablicy bez wcześniejszego sortowania.

    //Sprawdź, czy dwie tablice zawierają dokładnie te same elementy, niezależnie od ich kolejności.

    //Znajdź element, który występuje najczęściej w tablicy.

    //Przesuń wszystkie zera na koniec tablicy, zachowując kolejność pozostałych elementów.

    //Znajdź najdłuższy rosnący fragment tablicy i zwróć jego długość.

    //String
    //Sprawdź, czy dwa napisy są anagramami.

    //String
    //Znajdź pierwszy niepowtarzający się znak w napisie.

    //Kolekcje
    //Policz liczbę wystąpień każdego słowa w tekście.

    //Kolekcje
    //Usuń duplikaty z listy, zachowując kolejność pierwszych wystąpień.

    //HashMap
    //Odwróć mapę, zamieniając miejscami klucze i wartości. Załóż, że wartości są unikalne.

    //OOP
    //Utwórz klasę Pracownik, a następnie posortuj listę pracowników:
    //według pensji malejąco,
    //przy tej samej pensji według nazwiska.

    //Tablice dwuwymiarowe
    //Znajdź największą sumę elementów w jednym wierszu macierzy.

    //Macierze
    //Sprawdź, czy dana macierz jest symetryczna.

    //Algorytmy
    //Znajdź wszystkie liczby pierwsze z zakresu od 2 do n możliwie najwydajniejszym sposobem.

    //Logika biznesowa
    //Masz listę zamówień zawierających:
    //identyfikator klienta,
    //wartość zamówienia,
    //datę.
    //Oblicz łączną wartość zamówień każdego klienta i wyświetl ranking klientów malejąco według sumy zakupów.
    //Bonus – Poziom Mid (5 wyzwań)

    //Zaimplementuj własną klasę dynamicznej tablicy bez użycia ArrayList.

    //Napisz własną implementację stosu (Stack) opartą na tablicy.

    //Zaimplementuj kolejkę (Queue) bez użycia klas z biblioteki Java.

    //Napisz program wykrywający cykl w grafie reprezentowanym jako lista sąsiedztwa.

    //Dla bardzo dużego pliku tekstowego znajdź 10 najczęściej występujących słów, minimalizując zużycie pamięci.


}
