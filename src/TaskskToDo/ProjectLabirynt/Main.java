package TaskskToDo.ProjectLabirynt;

public class Main {
    public static void main(String[] args) {

        //PROJEKT "The Java Labyrinth" (Zaawansowane RPG Tekstowe)
        //Twoim zadaniem jest stworzenie silnika gry RPG, w którym świat, postacie i interakcje są opisane kodem, a komunikacja z graczem odbywa się przez konsolę.
        //
        //Lista wymagań funkcjonalnych:
        //
        //System Bytów (OOP): Stwórz klasę bazową Creature oraz klasy pochodne Hero i Monster. Statystyki
        // (Siła, Inteligencja, Zręczność) muszą być przechowywane w EnumMap.
        //
        //Parser Poleceń (Regex): Gra nie może używać prostego switch-case.
        //Stwórz system, który analizuje wpisy gracza typu: "uzyj [przedmiot] na [cel]",
        // "idz [polnoc/poludnie]", "atakuj [potwor] szybki-atak".
        // Użyj grup w Regex, aby wyciągnąć parametry.
        //
        //Dynamiczna Walka (Interfejsy Funkcyjne & Lambdy):
        // Każda umiejętność (np. DoubleStrike, Heal, Fireball) musi być
        // implementacją interfejsu funkcyjnego CombatAction.
        // Logika efektu ma być przekazywana jako Lambda.
        //
        //Ekwipunek (Generics & Collections): Zaimplementuj klasę Storage<T extends Item>.
        // Bohater ma List<T>, a pokoje w labiryncie mogą zawierać Chest<T>.
        //
        //Mapa Świata (Collections): Stwórz Map<String, Room>, gdzie kluczem jest
        // nazwa pokoju lub współrzędne, a wartością obiekt zawierający opis i listę przejść.
        //
        //Kronika Przygód (Dates): Każda akcja gracza musi być logowana do listy HistoryEntry
        // z dokładnym znacznikiem LocalDateTime. Na koniec gry system generuje raport z przebiegu wyprawy.
        //
        //System Ryzyka (Exceptions): Stwórz własne wyjątki: ManaDepletedException,
        // ItemNotFoundException, BrokenEquipmentException.
        // Gra musi je wyłapywać i informować gracza o problemie bez przerywania działania.


    }
}
