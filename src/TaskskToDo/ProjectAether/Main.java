package TaskskToDo.ProjectAether;

public class Main {
    public static void main(String[] args) {


        //Temat projektu: System Zarządzania Galaktyczną Stacją Badawczą „Aether”
        //1. Cel systemu
        //Zaprojektuj i zaimplementuj system do zarządzania załogą, zasobami oraz misjami naukowymi stacji kosmicznej. System musi działać w oparciu o dane wczytywane z plików tekstowych i umożliwiać pełną analitykę operacyjną.

        //2. Wymagania techniczne i funkcjonalne
        //A. Model Danych (Obiektowość, Enuma, Typy Generyczne)
        //Stwórz hierarchię klas dla Członków Załogi (np. Naukowcy, Inżynierowie, Medycy).
        //Zaimplementuj system Modułów Stacji (np. Laboratorium, Magazyn, Kwatery).
        //Stwórz klasę generyczną Container<T>, która będzie zarządzać różnymi typami zasobów (np. Mineral, OxygenTank, FoodRation).
        //Wykorzystaj Enumy do określenia:
        //Stopni alarmowych stacji.
        //Specjalizacji załogi.
        //Statusu misji.
        //B. Rejestracja i Walidacja (Wyrażenia Regularne)
        //Każdy obiekt w systemie musi posiadać unikalny identyfikator podlegający ścisłej walidacji:
        //ID Pracownika: musi spełniać wzorzec: [SEKTOR]-[ROK_DOŁĄCZENIA]-[A-Z]{3}-[0-9]{2}, np. BIO-2023-XYZ-01.
        //Kod Przesyłki: musi zaczynać się od znaku #, zawierać 5 cyfr i kończyć się kodem kraju/planety (np. #12345-MARS).
        //C. Logistyka i Czas (Daty i Czas)
        //System musi rejestrować datę przybycia każdego członka załogi (LocalDate).
        //Każde zdarzenie na stacji musi posiadać znacznik czasowy (LocalDateTime).
        //Zaimplementuj funkcję obliczającą:
        //Staż każdego pracownika na stacji.
        //Czas pozostały do zakończenia bieżących misji badawczych.
        //Dni tygodnia, w których statystycznie odbywa się najwięcej dokowań (wykorzystaj logikę z poprzedniego zadania).
        //D. System Operacyjny (Interfejsy Funkcyjne, Lambdy, Streamy)
        //Stwórz moduł StationAnalytics, który za pomocą Stream API i Lambd pozwoli na:
        //Filtrowanie załogi według stażu, specjalizacji lub poziomu uprawnień.
        //Znalezienie modułu, który zużywa najwięcej energii w danym przedziale czasu.
        //Automatyczne generowanie listy "osób do ewakuacji" (np. tylko medycy i osoby ze stażem powyżej roku) w razie alarmu.
        //Zdefiniuj własne interfejsy funkcyjne do definiowania protokołów bezpieczeństwa (np. sprawdzanie, czy dany pracownik może wejść do konkretnego sektora).
        //E. Obsługa Sytuacji Kryzysowych (Wyjątki)
        //Zdefiniuj własną strukturę wyjątków i obsłuż sytuacje takie jak:
        //Próba przypisania pracownika do sektora, do którego nie ma uprawnień.
        //Przepełnienie magazynu (klasy generycznej).
        //Błędny format danych podczas wczytywania plików (np. niepoprawne ID).
        //Przekroczenie limitu zasobów krytycznych (tlen, woda).
        //F. Integracja Danych (Kolekcje, Pliki)
        //Dane o załodze i zasobach muszą być wczytywane z plików .txt przy starcie aplikacji.
        //System powinien umożliwiać zapisanie raportu końcowego (stanu stacji) do nowego pliku po zakończeniu symulacji.
        //Użyj odpowiednich kolekcji (List, Set, Map), aby zapewnić brak duplikatów w ID pracowników oraz szybki dostęp do zasobów po ich nazwie.
        //3. Scenariusz testowy (do wykonania w main)
        //Wczytaj listę 100 pracowników z pliku.
        //Odrzuć tych, których ID nie przechodzi walidacji Regex (zapisz błędy do logu).
        //Pogrupuj pracowników według dnia tygodnia ich przybycia na stację.
        //Przeprowadź symulację "Miesiąca na stacji": co 10 linii wczytanych danych odejmij określoną liczbę zasobów z kontenerów generycznych.
        //Wypisz listę wszystkich naukowców, którzy przebywają na stacji dłużej niż 500 dni.
    }
}
