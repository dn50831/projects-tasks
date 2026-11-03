package TaskskToDo;

public class TasksToDo {


    //    1.Zliczanie słów w zdaniu
    //    Napisz program, który policzy liczbę
    //    TODO SŁÓW w wprowadzonym przez użytkownika zdaniu.
    //    Program powinien rozróżniać słowa i ignorować znaki interpunkcyjne.
    //    TODO podzial na wyrazy i pominanc spacje


    //    2.Rekurencyjne obliczanie silni
    //    Napisz funkcję rekurencyjną, która obliczy silnię dla podanej liczby.

    //    3.Fibonacci - rekurencyjnie i iteracyjnie
    //    Napisz program, który obliczy n-ty element ciągu Fibonacciego, zarówno za pomocą rekurencji, jak i pętli.
    //    Tablica dynamiczna

    //    4.Napisz program, który implementuje prostą wersję dynamicznej tablicy (rośnie w miarę potrzeby).
    //    Implementacja powinna obejmować operacje dodawania elementów, usuwania i pobierania elementów.


    //    5.Sortowanie bąbelkowe
    //    Zaimplementuj algorytm sortowania bąbelkowego (Bubble Sort) w Javie.
    //    Program powinien posortować tablicę liczb w porządku rosnącym.

    //    6.System zarządzania książkami
    //    Stwórz prostą aplikację konsolową do zarządzania biblioteką.
    //    Program powinien umożliwiać dodawanie książek (z tytułem, autorem, rokiem wydania),
    //    wyświetlanie wszystkich książek, usuwanie książek i wyszukiwanie po tytule.


    //    7.Symulacja banku
    //    Napisz program, który symuluje podstawowy system bankowy.
    //    Użytkownik może tworzyć konta, wpłacać i wypłacać pieniądze.
    //    Program powinien przechowywać informacje o saldzie konta i pozwalać na sprawdzanie stanu konta.


    //    8.Rozwiązywanie równań kwadratowych
    //    Napisz program, który rozwiązuje równanie kwadratowe w postaci ax² + bx + c = 0.
    //    Program powinien obsługiwać przypadki, gdy równanie ma dwa pierwiastki,
    //    jeden pierwiastek lub brak pierwiastków (w przypadku braku rozwiązań).

    //    9.
    //    Wyszukiwanie binarne
    //    Zaimplementuj algorytm wyszukiwania binarnego na posortowanej tablicy.
    //    Program powinien wyszukiwać podaną liczbę w tablicy i zwrócić jej indeks, jeśli występuje,
    //    lub informować o braku takiej liczby.

    //    10.Zarządzanie zadaniami (To-Do List)
    //    Stwórz program, który implementuje prostą listę zadań.
    //    Użytkownik może dodawać zadania, usuwać je oraz oznaczać jako zakończone.
    //    Program powinien przechowywać dane w pliku tekstowym, aby po zamknięciu aplikacji dane zostały zapisane.


    // Etap4_Projekty

    //Projekt1_TODO_App
    //    1. Stwórz klasę `Zadanie` z polami `tytul`, `opis`, `czyZakonczone`.
    //    2. Zaimplementuj metody dodaj, wypisz, usuń zadanie.
    //    3. Dodaj opcję oznaczania zadania jako zakończone.
    //    4. Zrób menu w konsoli (1-dodaj, 2-wypisz, 3-usuń, 4-zamknij).
    //    5. Zapisuj dane do pliku tekstowego.
    //    6. Odczytuj dane z pliku przy uruchomieniu programu.
    //    7. Wypisz tylko zakończone zadania.
    //    8. Sortuj zadania alfabetycznie.
    //    9. Zastosuj kolekcję `List<Zadanie>`.
    //    10. Dodaj identyfikator zadania (ID) i możliwość edycji.

    // Testy

    // JUnit
    //    1. Stwórz klasę `Kalkulator` z metodami `dodaj`, `odejmij`, `pomnóż`, `podziel`.
    //    2. Utwórz test JUnit do metody `dodaj()`.
    //    3. Utwórz test do metody `dzielenie`, sprawdzając dzielenie przez 0.
    //    4. Zastosuj `@BeforeEach` i `@AfterEach` w klasie testowej.
    //    5. Sprawdź, czy `null` rzuca wyjątek w metodzie.
    //    6. Zastosuj `assertEquals`, `assertTrue`, `assertNotNull`.
    //    7. Przetestuj klasę `Zadanie` z projektu TODO.
    //    8. Sprawdź czy lista zadań się powiększa po dodaniu nowego.
    //    9. Utwórz test do metody `czyZakonczone` i przetestuj zmianę stanu.
    //    10. Zrób test parametrów przy pomocy `@ParameterizedTest`.


    // Podstawy Javy, OOP, Git, SQL
    //1.Napisz program wypisujacy liczby pierwsze od 1 do 100.
    //2.Zaimplementuj klase Car z metoda drive() i podklase ElectricCar.
    //3.Stworz prosty system biblioteczny w konsoli zapisujacy dane do pliku.
    //4.Napisz 10 zapytan SQL dla tabeli Users (SELECT, JOIN, UPDATE, DELETE).
    //5.Stworz klase BankAccount z metodami deposit() i withdraw().
    //6.Napisz program uzywajacy ArrayList do zarzadzania ocenami studentow.
    //7.Zaimplementuj prosty kalkulator uzywajac Scanner.
    //8.Stworz aplikacje czytajaca plik CSV i wypisujaca posortowane dane.
    //9.Zbuduj symulacje prostego bankomatu z petlami i warunkami.
    //10.Stworz quiz tekstowy w konsoli z wieloma pytaniami.

    //Zadanie 1 – System analizujący ruch lotniczy
    //Masz 3 pliki:
    //loty.csv – zawiera informacje: id_lotu;kod_linii;miasto_start;miasto_cel;data_startu;czas_lotu_min;liczba_pasazerow
    //linie_lotnicze.csv – zawiera: kod_linii;nazwa;rok_rozpoczecia;liczba_samolotow
    //lotniska.csv – zawiera: kod_miasta;nazwa;panstwo;kraj
    //Zaimplementuj program, który:
    //Wczytuje wszystkie dane do odpowiednich obiektów (Lot, LiniaLotnicza, Lotnisko) z relacjami:
    //Lot ma obiekt LiniaLotnicza i Lotnisko startowe oraz docelowe.
    //Znajduje:
    //linię lotniczą, która przewiozła największą liczbę pasażerów w danym roku,
    //lotnisko z największą liczbą startów,
    //najdłuższy lot (czas),
    //dzień tygodnia, w którym odbyło się najwięcej lotów.
    //Wypisuje listę lotów międzynarodowych (start i cel w różnych krajach).
    //Obsługuje błędne dane (np. loty z nieistniejącym kodem lotniska lub linii lotniczej – należy je pominąć).
    //Pozwala zapisać wyniki w pliku JSON.

    //Zadanie 2 – Analiza danych o sprzedaży online
    //Dany jest plik zamowienia.csv:
    //id_zamowienia;data;id_klienta;id_produktu;ilosc;cena_jednostkowa
    //Oraz pliki:
    //klienci.csv – id_klienta;imie;nazwisko;email;miasto;kraj
    //produkty.csv – id_produktu;nazwa;kategoria;cena_sugerowana
    //Zadania:
    //Wczytaj dane do klas: Zamowienie, Klient, Produkt (relacje obiektów).
    //Oblicz:
    //najlepszego klienta (największa suma zamówień),
    //produkt z najwyższym przychodem,
    //kategorię produktów z największą liczbą zamówień,
    //miasto, które wygenerowało największy przychód.
    //Sprawdź, czy w zamówieniach są produkty sprzedane poniżej ceny sugerowanej – jeśli tak, wypisz te przypadki.
    //Posortuj klientów według sumy zakupów malejąco i zapisz ranking do pliku CSV.
    //Wprowadź obsługę wyjątków w przypadku błędów w formacie danych.

    //Zadanie 3 – System zarządzania biblioteką multimediów
    //Dane wejściowe (pliki):
    //ksiazki.txt – id;tytul;autor;rok;liczba_stron
    //filmy.txt – id;tytul;rezyser;rok;dlugosc_min
    //uzytkownicy.txt – id;imie;nazwisko;email
    //wypozyczenia.txt – id_uzytkownika;id_pozycji;data_wypozyczenia;data_zwrotu
    //Założenia:
    //Pozycją może być Książka lub Film (klasa bazowa Pozycja, dziedziczenie).
    //Wypożyczenie musi zawierać obiekt użytkownika i obiekt pozycji.
    //Zadania:
    //Znajdź użytkownika, który wypożyczył najwięcej pozycji.
    //Znajdź pozycję najczęściej wypożyczaną.
    //Sprawdź średni czas wypożyczenia książek i filmów osobno.
    //Wypisz wszystkie pozycje, które były wypożyczone więcej niż 5 razy.
    //Obsłuż sytuację, gdy wypożyczenie dotyczy nieistniejącego użytkownika lub pozycji (ignoruj błędne dane).
    //Zapisz raport w pliku JSON, zawierający wszystkie powyższe statystyki.

    //Zadanie 4 – Analiza czujników pogodowych
    //Dane wejściowe:
    //czujniki.csv – id;lokalizacja;typ
    //odczyty.csv – id_czujnika;data;wartosc
    //Typ czujnika: "temperatura", "wilgotnosc", "cisnienie"
    //Zadania:
    //Wczytaj dane i powiąż odczyty z czujnikami (relacje).
    //Dla każdego czujnika:
    //znajdź wartość minimalną, maksymalną i średnią,
    //wykryj odczyty odstające (np. dla temperatury < -50 lub > 60 stopni).
    //Znajdź lokalizację z największą liczbą czujników.
    //Znajdź dzień, w którym była najwyższa średnia temperatura.
    //Zapisz do pliku CSV listę odczytów odstających wraz z lokalizacją i typem czujnika.

    //Zadanie 5 – Menedżer turnieju e-sportowego
    //Pliki wejściowe:
    //zawodnicy.csv – id;nick;druzyna;kraj
    //mecze.csv – id_meczu;data;id_gracza1;id_gracza2;punkty_gracza1;punkty_gracza2
    //Zadania:
    //Wczytaj dane do klas Zawodnik i Mecz.
    //Wyznacz:
    //gracza z największą liczbą wygranych,
    //drużynę z największą liczbą zwycięstw,
    //kraj z największą liczbą graczy w top 10.
    //Sprawdź średni wynik punktowy w wygranych meczach.
    //Wypisz mecze, które zakończyły się remisem.
    //Obsłuż sytuację, gdy mecz zawiera ID zawodnika, którego nie ma w pliku zawodnicy.csv.
    //Zapisz wyniki turnieju w formacie JSON, w tym ranking zawodników.
    //Te zadania są dużo bardziej skomplikowane niż wcześniejsze:
    //mają wielopoziomowe relacje obiektów,
    //wymagają czyszczenia i walidacji danych,
    //obejmują parsowanie plików CSV i zapis JSON,
    //wymagają analiz statystycznych i sortowania,
    //wprowadzają obsługę wyjątków oraz czasem dodatkowe algorytmy (np. ranking, wykrywanie odstających danych).


    //        //🔹 Zadanie 1
    //        //Wypisz wszystkie liczby trzycyfrowe, które są podzielne przez 7
    //        // i suma ich cyfr jest równa 10.
    ////        for (int i = 100; i < 1000; i++) {
    ////            int setki = i / 100;
    ////            int dziesiatki = (i / 10) % 10;
    ////            int jednosci = i % 10;
    ////            if (i % 7 == 0 && setki + dziesiatki + jednosci == 10) {
    ////                System.out.println(i);
    ////            }
    ////        }
    //
    //        //🔹 Zadanie 2
    //        //Napisz metodę, która dla podanej liczby zwraca listę jej dzielników.
    //        //W metodzie main wypisz:
    //        //liczbę dzielników każdej liczby od 1 do 30,
    //        //oraz która liczba w tym zakresie ma ich najwięcej.
    //
    //        //System.out.println(listaDzielnikow(30));
    //
    //
    //        //🔹 Zadanie 3
    //        //Poproś użytkownika o 5 napisów.
    //        //Wypisz je w kolejności rosnącej długości,
    //        //sprawdź, ile z nich to palindromy (ignorując wielkość liter).
    //
    ////        Scanner scan = new Scanner(System.in);
    ////        List<String> list = new ArrayList<>();
    ////        for (int i = 0; i < 5; i++) {
    ////            System.out.println("Enter string");
    ////            list.add(scan.nextLine());
    ////        }
    ////        List<String> sorted = metodyDoZadan.giveSortLenght(list);
    ////
    ////        for (String s : sorted) {
    ////            System.out.println(s);
    ////        }
    //
    //
    //        //🔹 Zadanie 4
    //        //Zapytaj użytkownika o liczby rozdzielone spacją.
    //        //Policz średnią, medianę i odchylenie standardowe.  // TODO odchylenie standartowe
    //        //Wypisz wszystkie liczby pierwsze spośród wprowadzonych.  // TODO
    //
    //        Scanner scan = new Scanner(System.in);
    //        System.out.println("Podaj liczby oddzielone spacja: ");
    //        String liczbyString = scan.nextLine();
    //        String[] rozdzielone = liczbyString.split(" ");
    //        List<Integer> liczbyInt = new ArrayList<>();
    //        int srednia = 0;
    //        int mediana = 0;
    //        for (String s : rozdzielone) {
    //            liczbyInt.add(Integer.parseInt(s));
    //            srednia = ((Integer.parseInt(s)) + Integer.parseInt(s)) / rozdzielone.length;
    //
    //        }
    //        System.out.println(liczbyInt);
    //        System.out.println(srednia);
    //
    //
    //        //🔹 Zadanie 5
    //        //Napisz klasę Osoba z polami imie, nazwisko, pesel.
    //        //Dodaj metodę getPlec(), która zwróci "K" lub "M" na podstawie numeru PESEL.
    //        //Wczytaj od użytkownika 3 osoby i policz, ile wśród nich jest kobiet, a ilu mężczyzn.
    //
    //        //🔹 Zadanie 6
    //        //Stwórz metodę isPerfectNumber(int n), która sprawdza, czy liczba jest doskonała
    //        // (np. 6, 28).
    //        //Następnie wypisz wszystkie liczby doskonałe z przedziału 1–1000.
    //
    //        //🔹 Zadanie 7
    //        //Wczytaj z konsoli ciąg znaków i sprawdź:
    //        //ile jest w nim samogłosek,
    //        //ile spółgłosek,
    //        //ile cyfr,
    //        //ile znaków specjalnych.
    //
    //        //🔹 Zadanie 8
    //        //Napisz klasę Student (imie, nazwisko, oceny).
    //        //Dodaj metodę, która zwróci średnią ocen studenta.
    //        //W main wczytaj 3 studentów i wypisz najlepszego z nich.
    //
    //        //🔹 Zadanie 9
    //        //Zapisz do pliku tekstowego wszystkie liczby pierwsze od 1 do 200.
    //        //Następnie wczytaj plik i policz, ile liczb w nim jest oraz jaka jest ich średnia.
    //
    //        //🔹 Zadanie 10
    //        //Stwórz program, który:
    //        //Losuje tablicę 20 liczb od 1 do 100.
    //        //Wypisuje je w kolejności rosnącej.
    //        //Podaje medianę, minimum, maksimum oraz liczbę parzystych i nieparzystych.
    //
    //
    //    }


    //GEMINI
    //🛠️ Java OOP Practice Tasks
    //1. Shape Calculator (Abstract Class & Interface)
    //Goal: Create a system to calculate the area and perimeter of different shapes.
    //Concepts: Abstract Class, Interface, Inheritance, Method Overriding.
    //Tasks:
    //Define an Interface called Measurable with methods getArea() and getPerimeter().
    //Define an Abstract Class called Shape with an abstract method draw().
    //Create concrete classes Circle and Rectangle that extend Shape and implement Measurable.
    //Implement the calculation logic for area and perimeter in each shape class.


    //2. Basic Coffee Shop Order System (Enum & Logic)
    //Goal: Use enumerations to manage coffee sizes and prices.
    //Concepts: Enum, Instance Fields in Enum, Switch/Decision Logic.
    //Tasks:
    //Create an Enum called CoffeeSize with constants like SMALL, MEDIUM, and LARGE.
    //Give the enum constants an instance field for their milliliter (ml) volume and their base price.
    //Write a method that takes a CoffeeSize as input and prints a formatted description:
    //"A [Size] coffee is [Volume]ml and costs $[Price].

    //3. Vehicle Movement Simulator (Interface & Polymorphism)
    //Goal: Define a common movement behavior for different types of vehicles.
    //Concepts: Interface, Polymorphism, Encapsulation.
    //Tasks:
    //Define an Interface called Movable with methods startEngine() and move(int distance).
    //Create classes Car and Bicycle that implement Movable.
    //Implement move differently for each (e.g., Car consumes fuel, Bicycle uses pedal power).
    //Create a list of Movable objects and iterate through it, calling startEngine()
    //on each (demonstrating polymorphism).

    //4. Bank Account System (Inheritance & Abstract Class)
    //Goal: Establish a hierarchy for different types of bank accounts.
    //Concepts: Abstract Class, Inheritance, Encapsulation, Abstract Methods.
    //Tasks:
    //Create an Abstract Class called BankAccount with common fields (like accountNumber, balance)
    //and concrete methods (like deposit).
    //Include an Abstract Method called calculateInterest().
    //Create two subclasses: SavingsAccount and CheckingAccount.
    //Implement calculateInterest() differently in each subclass (e.g., Savings has a higher rate).

    //5. Traffic Light Controller (Enum & State Management)
    //Goal: Simulate a traffic light using enum states.
    //Concepts: Enum, State Management, Logic Control.
    //Tasks:
    //Create an Enum called LightColor with constants RED, YELLOW, and GREEN.
    //Give the enum an instance field for its duration (in seconds).
    //Write a method called getNextLight() that returns the next state in the sequence (e.g., GREEN -> YELLOW -> RED).
    //Implement a simple loop to cycle through the states, pausing for the specified duration of each light.

    //6. Sorting Strategy (Interface & Lambda/Functional Logic)
    //Goal: Use an interface to define different sorting behaviors.
    //Concepts: Interface, Strategy Pattern, Polymorphism.
    //Tasks:
    //Define an Interface called SortStrategy with a method sort(List<Integer> list).
    //Create two classes implementing this interface: BubbleSort and InsertionSort.
    //Create a class called Sorter that holds a reference to a SortStrategy.
    //Write a main program that swaps the sorting strategy used by the Sorter at runtime to
    //demonstrate different behaviors on the same list of numbers.

    //7. Employee Roles (Enum & Abstract Method in Enum)
    //Goal: Define fixed employee roles and specific behavior for each role.
    //Concepts: Enum, Method Implementation per Constant (Abstract method in enum).
    //Tasks:
    //Create an Enum called EmployeeRole with constants like MANAGER, DEVELOPER, and SALES_REP.
    //Declare an abstract method inside the enum, such as getBonusPercentage().
    //Implement this method differently for each constant (e.g., MANAGER returns 10%, DEVELOPER returns 5%).
    //Create a class method that calculates a bonus based on an employee's salary and their EmployeeRole.

    //8. Animal Sound System (Abstract Class & Inheritance)
    //Goal: Model different animals that share basic properties but have unique sounds.
    //Concepts: Abstract Class, Inheritance, Concrete vs. Abstract Methods.
    //Tasks:
    //Create an Abstract Class called Animal with a concrete method sleep() and an abstract method makeSound().
    //Create subclasses Dog and Cat.
    //Implement the makeSound() method in each subclass with its specific sound ("Woof" or "Meow").
    //Demonstrate how all Animal objects can call sleep(), but the result of makeSound()
    //depends on the specific object type.

    //9. Logger Severity Levels (Enum)
    //Goal: Implement a logger that filters messages based on severity.
    //Concepts: Enum, Relational Logic, Comparison.
    //Tasks:
    //Create an Enum called Severity with constants TRACE, DEBUG, INFO, WARN, and ERROR.
    //Give each enum a field representing its level value (e.g., TRACE=0, ERROR=4).
    //Write a class SimpleLogger with a minimum logging level (e.g., set to WARN).
    //Implement a log(Severity severity, String message) method that only prints the message
    // if the provided severity's level value is greater than or equal to the logger's minimum level.

    //10. Printable Document System (Interface & Separate Concerns)
    //Goal: Separate the concept of a document from the ability to print it.
    //Concepts: Interface, Composition, Loose Coupling.
    //Tasks:
    //Define an Interface called Printable with a method printContent().
    //Create a class TextDocument that implements Printable.
    //Create another class, Report, that also implements Printable.
    //Create a separate class called Printer with a method queueJob(Printable p) that
    //accepts any object implementing the Printable interface and calls its printContent() method.


    //CHAT
    //✅ 10 Java OOP Tasks (with Interfaces, Enums, and Logic)
    //1. Vehicle Rental System
    //Concepts: Interface, Classes, Polymorphism, Enum
    //Task:
    //Create an interface Vehicle with methods rent() and returnVehicle().
    //Implement classes Car, Bike, and Truck.
    //Use an enum VehicleType {CAR, BIKE, TRUCK}.
    //Write a manager class to rent and return vehicles.

    //2. Online Store Discount System
    //Concepts: Abstract class, Interface, Enum, Logic
    //Task:
    //Create an interface Discountable with method applyDiscount(double price).
    //Create classes PercentageDiscount and FlatDiscount.
    //Use an enum CustomerType {REGULAR, PREMIUM, VIP} to decide discount strategy.

    //3. Employee Payroll System
    //Concepts: Inheritance, Enum, Polymorphism
    //Task:
    //Create a base class Employee with subclasses FullTimeEmployee and PartTimeEmployee.
    //Use an enum Role {MANAGER, DEVELOPER, DESIGNER}.
    //Write logic to calculate salary differently for each employee type.

    //4. Smart Home Device Control
    //Concepts: Interface, Polymorphism, Enum
    //Task:
    //Create an interface SmartDevice with methods turnOn() and turnOff().
    //Implement classes Light, Fan, Thermostat.
    //Use enum DeviceStatus {ON, OFF}.

    //5. Banking Transaction System
    //Concepts: Abstract classes, Interface, Logic
    //Task:
    //Create an abstract class BankAccount with methods deposit() and withdraw().
    //Subclasses: SavingsAccount, CheckingAccount.
    //Create enum TransactionType {DEPOSIT, WITHDRAW}.
    //Add validation logic (no negative amounts, etc.).

    //6. Simple Game Character System
    //Concepts: Inheritance, Interface, Enum
    //Task:
    //Create an interface Attackable with method attack().
    //Create classes Warrior, Archer, Mage.
    //Use enum WeaponType {SWORD, BOW, STAFF}.
    //Each character attacks differently based on weapon.

    //7. Library Management System
    //Concepts: Class design, Enum, Search logic
    //Task:
    //Create a Book class with properties title, author, status.
    //Use enum BookStatus {AVAILABLE, BORROWED}.
    //Write logic to borrow/return books and search by title.

    //8. Order & Payment Processing
    //Concepts: Interface, Polymorphism, Enum
    //Task:
    //Implement interface PaymentMethod with method pay(amount).
    //Classes implementing it: CreditCardPayment, PayPalPayment, BankTransferPayment.
    //Enum PaymentStatus {SUCCESS, FAILED}.

    //9. Shape Drawing Simulator
    //Concepts: Interface, Polymorphism
    //Task:
    //Create interface Shape with draw() and area().
    //Implement Circle, Square, Triangle.
    //Use logic to calculate area for each shape.

    //10. Restaurant Menu System
    //Concepts: Enum, Logic, Class structures
    //Task:
    //Use enum MealType {BREAKFAST, LUNCH, DINNER}.
    //Create a MenuItem class with name, price, meal type.
    //Write menu filtering logic to show items for a specific meal.

    //gra zaadnie gemini
    //⚔️ Project: Text-Based Adventure Game (RPG)
    //The goal is to create a simple game loop where a Player explores a world, encounters Enemies, and uses Items.
    //1. 🗺️ Core Components & Design (OOP)
    //This section defines the mandatory classes, interfaces, and enums needed.
    //A. Interfaces (Contracts)
    //Define the fundamental contracts for game entities.
    //Combatant Interface: Defines the actions any fighting entity can perform.
    //Methods: attack(Combatant target), takeDamage(int damage), isAlive().
    //Interactable Interface: Defines actions for objects the player can interact with.
    //Methods: getName(), interact(Player p).
    //B. Abstract Classes (Blueprints)
    //Define the common structure and behavior shared by related entities.
    //GameCharacter Abstract Class: The base class for all living entities.
    //Fields: name, health, attackPower.
    //Concrete Methods: setHealth(int newHealth), getHealth().
    //Must Implement: Combatant interface (partially or fully).
    //Item Abstract Class: The base class for all items the player can find or use.
    //Fields: name, description.
    //Must Implement: Interactable interface.
    //C. Enums (Fixed Constants & States)
    //Used for safety and readability in fixed sets of values.
    //Direction Enum: Used for player movement and map navigation.
    //Constants: NORTH, SOUTH, EAST, WEST.
    //ItemType Enum: Used to categorize items for inventory management.
    //Constants: WEAPON, ARMOR, POTION, KEY. (Bonus: Give the enum an instance field for a weight value).
    //GameState Enum: Used to control the main game loop.
    //Constants: RUNNING, BATTLE, GAMEOVER, QUIT.

    //2. 👥 Concrete Classes (Implementation)
    //These classes bring the abstract designs to life by implementing the abstract methods and interfaces.
    //Class Name	Extends	Implements	Key Fields / Logic
    //Player	GameCharacter	Combatant	Fields: inventory (e.g., a List<Item>), currentLocation. Logic:
    //Methods for move(), useItem(), and tracking experience points.
    //Enemy	GameCharacter	Combatant	Fields: lootItem. Logic: Simple AI (e.g., always attacks the player).
    //HealingPotion	Item	Interactable	Fields: healAmount. Logic: In interact(), increase the player's health.
    //Sword	Item	Interactable	Fields: damageBonus. Logic: In interact(), equip the item and update
    //the player's attack power.
    //Location	(None)	(None)	Fields: name, description, exits (a Map<Direction, Location>),
    //and enemy (optional Enemy object). Logic: A method to display what the player sees.

    //3. 🧠 Game Logic & Coding Tasks
    //This is where you integrate all the components using decision structures, loops, and OOP concepts.
    //Task 1: Map Initialization
    //Create several Location objects (e.g., "Starting Room," "Forest Path," "Boss Chamber").
    //Use the Direction enum to connect these locations using the exits map
    //(e.g., Room A's NORTH exit points to Room B).

    //Task 2: The Main Game Loop
    //Use a while loop controlled by the GameState enum.
    //The loop should repeatedly:
    //Print the player's current location description and health.
    //Read the player's input (e.g., "go NORTH," "attack," "inventory").
    //Use a switch statement on the input command (or the first word) to execute the appropriate logic.
    //Change the GameState to BATTLE if an enemy is encountered, or to GAMEOVER if the player dies.

    //Task 3: Combat System (Polymorphism)
    //If the GameState is BATTLE:
    //The Player calls the attack(Enemy target) method from the Combatant interface.
    //The Enemy takes damage via the takeDamage(int damage) method.
    //The process reverses.
    //Polymorphism: By defining attack and takeDamage in the Combatant interface, you can treat both Player and Enemy objects generically during battle, even though their internal logic (e.g., calculating damage reduction from armor) might be different.

    //Task 4: Inventory & Item Usage
    //When the player types "inventory," print the items in the Player's inventory.
    //When the player types "use [item name]":
    //Find the Item object in the inventory.
    //Call the interact(Player p) method on the item. This is crucial: the item itself (e.g., HealingPotion or Sword) contains the logic for what it does to the player.

    //4. ✅ Success Criteria
    //Your project is successful when you can:
    //Move the player through the map using Direction enums.
    //Have the player fight an Enemy using the methods defined in the Combatant interface.
    //Have the player use different Item types that affect their stats in unique ways.
    //Switch the game state cleanly between RUNNING and BATTLE based on the current Location.


    //gra zadanie chat
    //🎮 Java Game Project: “Dungeon Escape”
    //A full OOP Java project designed to teach interfaces, enums, encapsulation, game loops, event systems, and clean architecture.
    //🔷 GAME OVERVIEW
    //You will create a 2D grid-based adventure game where the player must navigate a dungeon, avoid enemies, pick up items, and reach the exit.
    //No graphics are required; the game can run in the console or on a simple Swing panel.
    //🔷 MAIN OBJECTIVES
    //By completing the project, you will learn:
    //✅ Object-Oriented Design
    //encapsulation
    //inheritance
    //interfaces
    //polymorphism
    //composition
    //✅ Clean architecture
    //separating game logic from input/output
    //reusable components
    //event-based systems
    //✅ Game development fundamentals
    //game loop
    //collision detection
    //map design
    //state machines
    //🔷 PROJECT PARTS
    //Below is the full assignment.

    //PART 1 — Base Architecture
    //1. Create the Game Engine Structure
    //Create these packages:
    //engine (game loop, events)
    //entities (player, enemies)
    //items (weapons, potions)
    //world (map, grid, tiles)
    //ui (console or Swing output)
    //logic (movement, collisions, combat)
    //You must design classes to organize the game cleanly.

    //PART 2 — Game Loop
    //2. Implement the Game Loop (Conceptual Steps)
    //run loop while game is not over
    //update entity positions
    //check for collisions
    //check for win/lose conditions
    //redraw UI
    //read user commands (W/A/S/D etc.)
    //The loop must run at a fixed timestep (e.g., every 100–200ms).

    //PART 3 — Entities & OOP Design
    //3. Create an Entity Interface
    //All entities share:
    //position (x, y)
    //update behavior
    //draw behavior
    //4. Implement Entities
    //Create classes:
    //Player
    //health
    //inventory
    //movement
    //attack action
    //Enemy (abstract)
    //Subclasses:
    //Goblin (simple movement)
    //Skeleton (chases player)
    //Boss (special abilities)
    //All enemies must share:
    //speed
    //damage
    //detection logic

    //PART 4 — Good Use of ENUMS
    //5. Create Enums for Game Settings
    //You must define these enums:
    //Direction (UP, DOWN, LEFT, RIGHT)
    //TileType (WALL, FLOOR, EXIT)
    //GameState (PLAYING, PAUSED, GAME_OVER)
    //EnemyType (GOBLIN, SKELETON, BOSS)
    //ItemType (WEAPON, POTION, KEY)
    //These will keep logic clean and readable.

    //PART 5 — Map System
    //6. Build the Dungeon Map
    //Use a grid system (2D array).
    //Each cell contains a TileType.
    //Your map must include:
    //walls
    //open floors
    //at least one exit
    //enemy spawn points
    //item locations
    //Optional: load map from a text file for more challenge.

    //PART 6 — Movement & Collision Logic
    //7. Implement Movement Rules
    //Player movement:
    //cannot pass through walls
    //can pick up items
    //can move into enemy = triggers combat
    //Enemies:
    //move every few ticks
    //different enemy types use different movement patterns

    //8. Collision Detection Tasks
    //You must implement logic for:
    //player touching enemy → combat
    //player touching item → pick up
    //player reaching exit → win
    //enemy hitting player → health loss

    //PART 7 — Items & Combat System
    //9. Create Item Interface
    //All items must implement:
    //use()
    //getType()

    //10. Implement Items
    //Required items:
    //Potion (restores health)
    //Weapon (increases damage)
    //Key (required to open the exit)

    //PART 8 — UI Layer (Console or Swing)
    //11. Console Version Tasks
    //Print dungeon grid
    //Symbols:
    //P = Player
    //E = Enemy
    //# = Wall
    //. = Floor
    //X = Exit
    //Must also show:
    //health
    //inventory
    //available commands
    //OR
    //Swing Version Tasks
    //JFrame window
    //JPanel for drawing
    //Keyboard listener for input
    //paintComponent() to render map

    //PART 9 — Event System (Optional but Good Practice)
    //12. Add Custom Events
    //Create events:
    //PlayerMovedEvent
    //EnemySpawnedEvent
    //ItemCollectedEvent
    //Use observer pattern:
    //UI listens to game events
    //world triggers events when things change
    //PART 10 — Final Features
    //13. Add Game States
    //You must implement:
    //pause
    //resume
    //game over
    //victory screen

    //14. Add Save/Load Feature (Optional)
    //Store:
    //map
    //player location
    //enemy states
    //inventory
    //Serialization or JSON preferred.
    //🔷 OPTIONAL EXTENSIONS
    //If you want a bigger challenge:
    //add ranged weapons
    //add NPCs
    //add mini-map
    //add animations (if using Swing)
    //add difficulty levels (easy/medium/hard)
    //add inventory menu UI
    //add sound effects

    //✅ Task 1 — Smart Home Automation System (5 interfaces)
    //Goal: Build an extendable system for controlling smart home devices.
    //Interfaces (5):
    //Switchable – turnOn(), turnOff()
    //Adjustable – increase(), decrease()
    //Schedulable – setSchedule(), cancelSchedule()
    //StatusReadable – getStatus()
    //EnergyConsumable – getEnergyUsage()
    //Abstract Class
    //SmartDevice (fields: name, isOn, location)
    //Concrete Classes
    //SmartLight (implements Switchable, Adjustable, StatusReadable, EnergyConsumable)
    //Thermostat (implements Adjustable, StatusReadable, Schedulable)
    //SmartTV (implements Switchable, Schedulable, EnergyConsumable)
    //Enum
    //Room (KITCHEN, LIVING_ROOM, BEDROOM, BATHROOM)

    //✅ Task 2 — RPG Battle System With Multiple Interfaces (5 interfaces)
    //Goal: Build a mini battle engine where characters have different behaviors.
    //Interfaces
    //Attackable – attack()
    //Defendable – defend()
    //Healable – heal()
    //MagicUser – castSpell()
    //InventoryHolder – addItem(), removeItem()
    //Abstract Class
    //Character (name, hp, level)
    //Concrete Classes
    //Warrior (Attackable, Defendable, InventoryHolder)
    //Mage (Attackable, MagicUser, InventoryHolder, Healable)
    //Healer (Healable, Defendable, InventoryHolder)
    //Enums
    //WeaponType
    //SpellType
    //ArmorType

    //✅ Task 3 — Online Food Delivery System (4–5 interfaces)
    //Interfaces
    //Orderable – placeOrder()
    //Deliverable – deliver(), trackLocation()
    //Payable – makePayment()
    //Rateable – setRating()
    //Preparable – prepare(), serve()
    //Abstract Class
    //MenuItem (name, price)
    //Concrete Classes
    //Pizza (Orderable, Preparable)
    //Courier (Deliverable, Rateable)
    //Customer (Payable, Rateable)
    //Enum
    //PaymentType (CASH, CARD, APPLE_PAY, GOOGLE_PAY)

    //✅ Task 4 — Vehicle Fleet Management (5 interfaces)
    //Goal: Create a system managing different vehicle types with multiple capabilities.
    //Interfaces
    //Drivable – drive(), stop()
    //Refuelable – refuel()
    //Repairable – repair()
    //Loadable – loadCargo(), unloadCargo()
    //Trackable – getGPSLocation()
    //Abstract Class
    //Vehicle (brand, model, mileage)
    //Classes
    //Car (Drivable, Refuelable, Trackable)
    //Truck (Drivable, Refuelable, Loadable, Repairable)
    //ElectricScooter (Drivable, Trackable)
    //Enum
    //FuelType (DIESEL, PETROL, ELECTRIC)

    //✅ Task 5 — Multimedia Player System (4–5 interfaces)
    //Goal: Implement different playable media with rich interface usage.
    //Interfaces
    //Playable – play(), pause(), stop()
    //VolumeAdjustable – volumeUp(), volumeDown()
    //Skippable – skipForward(), skipBackward()
    //InfoDisplayable – showInfo()
    //QueueManageable – addToQueue(), removeFromQueue()
    //Abstract Class
    //Media (title, length)
    //Concrete Classes
    //Song
    //Podcast
    //AudioBook
    //All implement different combinations of interfaces.
    //Enum
    //MediaType (MUSIC, PODCAST, AUDIOBOOK)

    //✅ Task Idea 1: Smart Home Device System (Inheritance + Interface)
    //Goal:
    //Create a system where different smart home devices can be turned on/off and report their status.
    //Requirements:
    //Interface:
    //Controllable
    //void turnOn()
    //void turnOff()
    //boolean isOn()
    //Abstract class:
    //SmartDevice
    //Fields: String name, String location
    //Method: abstract void displayStatus()
    //Subclasses:
    //SmartLight
    //SmartThermostat
    //SmartSpeaker
    //Each device implements Controllable and extends SmartDevice.
    //Bonus features:
    //Thermostat: has temperature
    //Speaker: has volume
    //Light: has brightness

    //✅ Task Idea 2: Online Course System (Inheritance + Interface)
    //Goal:
    //Manage different types of online courses.
    //Interface:
    //Payable
    //double getPrice()
    //Abstract class:
    //Course
    //Fields: title, instructor
    //abstract void startCourse()
    //Subclasses:
    //VideoCourse (has video hours)
    //LiveCourse (has meeting date/time)
    //HybridCourse (combination)
    //All implement Payable.

    //✅ Task Idea 3: Zoo Animal Hierarchy (Classic but more advanced & new)
    //Interface:
    //Feedable
    //void feed()
    //Abstract class:
    //Animal
    //Fields: name, age
    //Methods: abstract void makeSound()
    //Subclasses:
    //Lion
    //Elephant
    //Penguin
    //Bonus:
    //Add another interface: Swimmable, Flyable
    //Penguin: implements Swimmable
    //Eagle: implements Flyable
    //Fish: Swimmable only
    //This gives multiple interfaces + inheritance, perfect practice.

    //✅ Task Idea 4: Banking System (Interfaces + Abstract Classes)
    //Interface:
    //Transactionable
    //deposit(double amount)
    //withdraw(double amount)
    //Abstract class:
    //Account
    //Fields: owner, balance
    //abstract void showAccountType();
    //Subclasses:
    //SavingsAccount
    //CheckingAccount
    //BusinessAccount
    //All implement Transactionable.

    //✅ Task Idea 5: RPG Character System (Fun & great OOP)
    //Interface:
    //Attackable
    //void attack()
    //Abstract class:
    //Character
    //String name, int health
    //abstract void displayStats()
    //Subclasses:
    //Warrior
    //Mage
    //Archer
    //Bonus interfaces:
    //MagicUser (Mage implements)
    //Stealth (Archer implements)

    //✅ TASK IDEA 1: Animal Simulator (Inheritance + Interface + Polymorphism)
    //Concepts covered:
    //Abstract classes
    //Interfaces (e.g., Soundable, Moveable)
    //Method overriding
    //Class hierarchy
    //Description:
    //Create a small program that simulates different types of animals.
    //Requirements:
    //Create an interface Soundable with a method makeSound().
    //Create an interface Moveable with a method move().
    //Create an abstract class Animal with fields: name, age.
    //Create subclasses:
    //Dog
    //Cat
    //Bird
    //Each animal implements Soundable and Moveable differently.
    //In main, create a List<Animal> and call methods.

    //✅ TASK IDEA 2: Library System (Inheritance + Interface)
    //Concepts covered:
    //Abstract LibraryItem
    //Concrete Books, Magazines, DVDs
    //Interface for borrowable items
    //Description:
    //A system that manages items in a library.
    //Requirements:
    //Create interface Borrowable with methods:
    //borrowItem()
    //returnItem()
    //Create abstract class LibraryItem
    //title
    //ID
    //abstract method showDetails()
    //Create classes:
    //Book (implements Borrowable)
    //Magazine (not borrowable)
    //DVD (implements Borrowable)
    //Demonstrate polymorphism in main.

    //✅ TASK IDEA 3: RPG Character System (Inheritance + Interfaces + Enums)
    //Concepts Covered:
    //Enums
    //Interfaces
    //Abstract base class
    //Hierarchy
    //Description:
    //Create a simple RPG character framework.
    //Requirements:
    //Enum ClassType: WARRIOR, MAGE, ROGUE
    //Interface Attackable with method attack().
    //Abstract class Character with:
    //name
    //level
    //ClassType
    //abstract useAbility()
    //Concrete classes:
    //Warrior
    //Mage
    //Rogue
    //Demonstrate attacking & ability usage.

    //✅ TASK IDEA 4: Coffee Machine Simulator (Enums + Inheritance + Interface)
    //If you want to expand your coffee idea, this is the BEST one.
    //Concepts Covered:
    //Multiple enums
    //Interface (Makeable)
    //Inheritance hierarchy
    //Composition
    //Requirements:
    //Separate enums (correct design):
    //CoffeeType (ESPRESSO, LATTE, AMERICANO)
    //CoffeeSize (SMALL, MEDIUM, LARGE)
    //PaymentType (CASH, CARD)
    //👉 Do NOT put them all in one enum — each enum represents ONE category.
    //Create interface Brewable with method brew().
    //Create abstract class Drink
    //price
    //size
    //abstract prepare()
    //Create Coffee class that extends Drink and implements Brewable.
    //Create subclasses:
    //Espresso
    //Latte
    //Cappuccino
    //CoffeeMachine class that takes orders.

    //✅ TASK 1 — RPG Combat System
    //Create a role-playing combat system with different character types, weapons, and abilities.
    //Requirements:
    //Include 1 abstract class for a base character type.
    //Include at least 4 interfaces, such as:
    //an interface for attack actions,
    //an interface for defend actions,
    //an interface for magic abilities,
    //an interface for healing or support abilities.
    //Use at least 2 enums, such as:
    //character classes (Warrior, Mage, Archer),
    //weapon types (Sword, Bow, Staff).
    //Create multiple concrete character classes that implement different combinations of the interfaces.
    //Add several weapon classes or items that affect stats.
    //Demonstrate polymorphism by letting characters attack, defend, and use abilities through the interfaces.


    //✅ TASK 2 — Coffee Shop Ordering & Payment System
    //Develop a system that processes customer orders, beverages, payments, and loyalty features.
    //Requirements:
    //Include 1 abstract class for a general product sold in the shop.
    //Include at least 5 interfaces, such as:
    //an interface for things that can be priced,
    //an interface for items that can be prepared,
    //an interface for items that can be consumed,
    //an interface for payment processing,
    //an interface for loyalty/reward points.
    //Include at least 3 enums, such as:
    //drink sizes,
    //drink types,
    //payment methods.
    //Create multiple drink classes that implement different interface combinations.
    //Add customer, barista, and order classes that interact with the system.
    //Demonstrate polymorphism by processing different drink types and payment methods.

    //✅ TASK 3 — Vehicle Fleet Management System
    //Create a system to manage the behaviour of different vehicles in a transportation fleet.
    //Requirements:
    //Include 1 abstract class for a general vehicle.
    //Include 4–5 interfaces, such as:
    //an interface for drivable actions,
    //an interface for refuelable or rechargeable vehicles,
    //an interface for GPS-enabled vehicles,
    //an interface for cargo-handling,
    //an interface for emergency or priority mode.
    //Include 2–3 enums, such as:
    //fuel type,
    //vehicle category,
    //cargo type.
    //Implement several vehicle subclasses with different capabilities:
    //electric cars,
    //delivery trucks,
    //emergency vehicles,
    //each implementing different sets of interfaces.
    //Demonstrate polymorphism by handling the vehicles uniformly through interfaces.


    //Task 1: University Personnel Management System
    //This task focuses on different roles and required capabilities (interfaces) for university members.
    //Requirements:
    //Interfaces (4):
    //Salaried: calculateMonthlyPay().
    //Teachable: teachCourse(String courseName).
    //Researchable: conductResearch(String topic).
    //Maintainable: performMaintenance().
    //Enum: JobTitle (PROFESSOR, LECTURER, ADMINISTRATOR, JANITOR).
    //Abstract Class: Person (Fields: name, id, JobTitle enum. Abstract method: displayRole()).
    //Concrete Classes:
    //Faculty (Extends Person, implements Salaried, Teachable, Researchable).
    //Staff (Extends Person, implements Salaried, Maintainable).
    //1. JobTitle.java (Enum)
    //Task 1 Enum
    //26 lis o 23:13
    //2. Interfaces for Task 1
    //Task 1 Interfaces
    //26 lis o 23:13
    //3. Person.java (Abstract Class)
    //Task 1 Abstract Class
    //26 lis o 23:13
    //4. Faculty.java (Implements 3 Interfaces)
    //Task 1 Faculty Class
    //26 lis o 23:13
    //5. Staff.java (Implements 2 Interfaces)
    //Task 1 Staff Class
    //26 lis o 23:13
    //6. UniversitySystem.java (Main Class)
    //Task 1 Main Class
    //26 lis o 23:13

    //Task 2: Digital Asset Management System (DAMS)
    //This task models digital assets with different access and manipulation rights.
    //Requirements:
    //Interfaces (5):
    //Storable: getStorageSize().
    //Viewable: displayPreview().
    //Editable: editContent(String changes).
    //Compressible: compress(double ratio).
    //Encryptable: encrypt(String key).
    //Enum: FileFormat (PDF, JPEG, MP4, TXT).
    //Abstract Class: DigitalAsset (Fields: fileName, FileFormat enum. Abstract method: showMetadata()).
    //Concrete Classes:
    //Document (Extends DigitalAsset, implements Storable, Viewable, Editable, Encryptable).
    //Image (Extends DigitalAsset, implements Storable, Viewable, Compressible)


    //Task 3: Fantasy Game Combat & Resource System
    //This task focuses on character interactions in a game, using interfaces to define combat and utility capabilities.
    //Requirements:
    //Interfaces (5):
    //Attackable: takeDamage(int damage).
    //Offensive: dealDamage().
    //Defensive: shieldUp().
    //Healable: applyHeal(int amount).
    //ManaConsumer: consumeMana(int cost).
    //Enum: MagicType (FIRE, ICE, ARCANE, HEALING).
    //Abstract Class: GameCharacter (Fields: name, health, mana. Abstract method: describeAbilities()).
    //Concrete Classes:
    //Warrior (Extends GameCharacter, implements Attackable, Offensive, Defensive).
    //Mage (Extends GameCharacter, implements Offensive, Healable, ManaConsumer).

    //Task 1 — Smart Home Automation System (interfaces + enums + polymorphism + OOP)
    //Requirements:
    //Create a system to control smart devices:
    //Interfaces:
    //Switchable → turnOn(), turnOff(), getStatus()
    //Adjustable → increase(), decrease()
    //Enum:
    //DeviceType { LIGHT, THERMOSTAT, TV, SPEAKER }
    //PowerStatus { ON, OFF }
    //Classes:
    //SmartDevice (abstract)
    //SmartLight (implements Switchable)
    //SmartThermostat (implements Switchable, Adjustable)
    //SmartSpeaker (implements Switchable, Adjustable)
    //Tasks:
    //Create a SmartHomeController class that stores devices.
    //Add filtering:
    //Get all devices by type
    //Get all devices currently ON
    //Get all adjustable devices
    //Implement a command processor: "TURN_ON LIGHT", "SET TEMP +2"

    //1. OOP + Interface + Enum Tasks (5–10 HARD tasks)
    //These tasks are designed to be challenging, mid-level + senior-level.

    //Task 1 — Smart Home Automation System (interfaces + enums + polymorphism + OOP)
    //Requirements:
    //Create a system to control smart devices:
    //Interfaces:
    //Switchable → turnOn(), turnOff(), getStatus()
    //Adjustable → increase(), decrease()
    //Enum:
    //DeviceType { LIGHT, THERMOSTAT, TV, SPEAKER }
    //PowerStatus { ON, OFF }
    //Classes:
    //SmartDevice (abstract)
    //SmartLight (implements Switchable)
    //SmartThermostat (implements Switchable, Adjustable)
    //SmartSpeaker (implements Switchable, Adjustable)
    //Tasks:
    //Create a SmartHomeController class that stores devices.
    //Add filtering:
    //Get all devices by type
    //Get all devices currently ON
    //Get all adjustable devices
    //Implement a command processor: "TURN_ON LIGHT", "SET TEMP +2"

    //Task 2 — E-Commerce Discount Engine (strategy pattern + interface + enum)
    //Enum:
    //DiscountType { PERCENTAGE, FIXED, LOYALTY, COUPON }
    //Interface:
    //DiscountStrategy { double apply(double price); }
    //Classes:
    //PercentageDiscount, FixedDiscount, LoyaltyDiscount, etc.
    //Product { String name; double price; }
    //Order { List<Product> items; DiscountStrategy discount; }
    //Tasks:
    //Implement the Strategy Pattern to apply discounts dynamically.
    //Allow multiple discounts combined (HARD).
    //Add logic to prevent discount > total price.

    //Task 3 — Vehicle Rental Management (enum + interface + abstract + validation)
    //Enum:
    //VehicleType { CAR, BIKE, TRUCK, BUS }
    //FuelType { GAS, ELECTRIC, HYBRID }
    //Interface:
    //Rentable { double calculateRent(int days); }
    //Classes:
    //Vehicle (abstract)
    //Car, Bike, Truck (extends Vehicle)
    //RentalService to register vehicles and customers
    //Tasks:
    //Implement price logic depending on type + fuel.
    //Add late return penalty.
    //Prevent renting a vehicle twice at same time.

    //Task 4 — Banking Application (interface + inheritance + enum)
    //Enum:
    //AccountType { SAVINGS, CURRENT, FIXED }
    //Interface:
    //Transaction { void process(); }
    //Classes:
    //BankAccount (abstract)
    //SavingsAccount, CurrentAccount
    //DepositTransaction, WithdrawTransaction, TransferTransaction
    //Tasks:
    //Perform transactions polymorphically.
    //Prevent negative balance.
    //Track transaction history per account.

    //Task 5 — Workflow Automation (state machine using enum + interface)
    //Enum:
    //WorkflowStatus { CREATED, IN_PROGRESS, REVIEW, APPROVED, REJECTED }
    //Interface:
    //Action { WorkflowStatus execute(WorkflowStatus current); }
    //Tasks:
    //Create valid state transitions (CREATED → IN_PROGRESS → REVIEW → …)
    //Throw exception on invalid transitions.
    //Log history of transitions.

    //Task 6 — Hotel Booking System (enum + interface + OOP)
    //Enum:
    //RoomType { SINGLE, DOUBLE, SUITE }
    //BookingStatus { RESERVED, CANCELLED, COMPLETED }
    //Interface:
    //PriceCalculator { double calculatePrice(RoomType type, int days); }
    //Tasks:
    //Implement dynamic pricing (weekend = +20%, suite = *2).
    //Prevent double-booking rooms.
    //Search rooms by date, type, price range.

    //Task 7 — Employee Grading System (enum + interface + polymorphism)
    //Enum:
    //Grade { JUNIOR, MID, SENIOR, LEAD }
    //Interface:
    //Evaluator { Grade evaluate(Employee e); }
    //Tasks:
    //Create evaluator based on performance score, seniority and completed projects.
    //Add promotion rules.
    //Prevent automatic demotion.

    //Task 8 — Sports Tournament System (OOP + interface + enum)
    //Enum:
    //Sport { FOOTBALL, VOLLEYBALL, BASKETBALL }
    //Interface:
    //Playable { void playMatch(Team a, Team b); }
    //Tasks:
    //Generate random match results based on sport.
    //Maintain rankings.
    //Disallow duplicate team names.
    //Store match history.

    //🧪 PRACTICE EXAM — 6 HARD TASKS
    //Below are six difficult programming tasks that combine OOP, logic, regex, streams, enums, and design.

    //TASK 1 — University System (Hard OOP + Associations)
    //Model a system:
    //Student
    //Course
    //Professor
    //Department
    //Rules:
    //Each Course has exactly one Professor
    //Each Student can take many Courses
    //Each Department has many Professors
    //A Professor belongs to exactly one Department
    //Implement:
    //Method: List<Student> getStudentsOfProfessor(Professor prof)
    //Method: Map<Department, Integer> countProfessorsPerDepartment()
    //Method: find students enrolled in courses from at least 3 different departments (hard!)

    //TASK 2 — Payment System (Enum + Strategy Pattern)
    //Create enum:
    //PAYPAL, CARD, BANK_TRANSFER;
    //Create interface:
    //interface PaymentProcessor {
    //    boolean process(double amount);
    //}
    //Each enum must implement its own behavior differently.
    //Implement:
    //Card: reject payments > 5000
    //PayPal: charge 2% fee
    //Bank Transfer: always success

    //TASK 3 — Regex Email Filtering (Hard)
    //Write a method:
    //public List<String> extractValidEmails(String text)
    //Valid emails must:
    //start with a letter
    //contain only letters, digits, _ or . before @
    //domain must have at least 1 dot
    //Example valid:
    //adam.kowalski22@example.com
    //Invalid:
    //22adam@x.pl, aaa@com

    //TASK 4 — Inventory System (Hard Streams)
    //Classes:
    //Product(name, price, quantity)
    //Warehouse(list of products)
    //Implement:
    //Get top 3 most valuable products (price * quantity)
    //Get total warehouse value
    //Group products by price range:
    //cheap < 50
    //medium 50–200
    //expensive > 200
    //Use only streams.

    //TASK 5 — Library Scanner (Hard Logic)
    //Check if a sentence is a pangram, but:
    //must ignore accents (ĄĆĘŁŃÓŚŹŻ → A C E L N O S Z Z)
    //must ignore digits, punctuation and spaces
    //must treat uppercase/lowercase the same
    //Example:
    //„Zażółć gęślą jaźń” → TRUE
    //„Hello World” → FALSE

    //TASK 6 — Git Simulation (Advanced OOP)
    //Create classes:
    //Repository
    //Branch
    //Commit
    //Requirements:
    //Repository contains many branches
    //Each Branch contains a list of commits
    //Each Commit has: message, hash, timestamp
    //Implement:
    //Create new commit and auto-generate a hash
    //Find commits between two timestamps
    //Merge two branches into a new one
    //Detect conflicts when two commits have the same file name but different content

    //🔥 HARD — KOLEKCJE + STREAM + LAMBDA
    //Masz listę obiektów Transaction (id, userId, amount, date).
    //znajdź użytkownika z największą sumą transakcji
    //zwróć top 3 użytkowników
    //pogrupuj transakcje po miesiącach
    //Masz listę słów.
    //znajdź 10 najczęściej występujących
    //posortuj po liczbie wystąpień malejąco
    //przy remisie sortuj alfabetycznie
    //Masz listę liczb.
    //znajdź najdłuższy rosnący podciąg
    //zwróć go jako listę
    //Masz mapę userId → lista zamówień.
    //znajdź użytkowników, którzy wydali więcej niż X
    //zwróć ich posortowanych malejąco
    //Połącz kilka list różnych typów obiektów implementujących wspólny interfejs.
    //przefiltruj tylko aktywne
    //posortuj po dacie utworzenia
    //🔥 HARD — OOP + PROJEKTOWANIE
    //Zaprojektuj system zarządzania biblioteką:
    //książki, użytkownicy, wypożyczenia
    //ograniczenia (np. max liczba książek)
    //historia wypożyczeń
    //System płatności:
    //różne metody płatności
    //możliwość dodawania nowych bez modyfikacji istniejącego kodu
    //System notyfikacji:
    //email, SMS, push
    //możliwość wysyłania do wielu odbiorców
    //System rezerwacji:
    //konflikt terminów
    //walidacja danych
    //Zaprojektuj klasę immutable z poprawnym porównywaniem i kopiowaniem.
    //🔥 HARD — WYJĄTKI + WALIDACJA
    //System rejestracji użytkownika:
    //walidacja emaila, hasła
    //własne wyjątki dla różnych błędów
    //Parser pliku:
    //niepoprawne linie nie przerywają działania
    //raport błędów na końcu
    //System bankowy:
    //brak środków → wyjątek
    //logowanie błędów
    //Walidacja danych wejściowych:
    //różne typy błędów
    //centralne zarządzanie wyjątkami
    //Obsługa błędów przy pracy z plikami i danymi.
    //🔥 HARD — PLIKI + REGEX + STREAM
    //Analizator logów:
    //wyciągnij poziomy błędów (INFO, ERROR…)
    //policz ich ilość
    //znajdź najczęstsze błędy
    //Parsowanie CSV:
    //obsługa błędnych danych
    //mapowanie na obiekty
    //Wyszukiwarka w plikach:
    //znajdź wszystkie dopasowania regex
    //wypisz numer linii
    //Analiza tekstu:
    //usuń stop-words
    //policz najczęstsze słowa
    //Scalanie wielu plików w jeden z filtrowaniem danych.
    //🔥 HARD — DATY + LOGIKA
    //System rezerwacji:
    //wykrywanie nakładających się terminów
    //Harmonogram:
    //znajdź wolne sloty w kalendarzu
    //Oblicz czas pracy pracownika:
    //na podstawie logów wejść/wyjść
    //System subskrypcji:
    //sprawdź, czy subskrypcja wygasła
    //Generowanie raportu miesięcznego.
    //🔥 HARD — ENUM + STRATEGIA
    //Enum reprezentujący strategie rabatowe.
    //Enum jako maszyna stanów (np. zamówienie).
    //Enum z logiką biznesową (np. różne obliczenia).
    //Mapowanie enum ↔ dane wejściowe.
    //Rozszerzalny system oparty na enum.
    //🔥 HARD — GENERICS
    //Stwórz generyczne repozytorium danych (CRUD).
    //Metoda porównująca dowolne obiekty spełniające warunek.
    //Kolekcja ograniczona do typów implementujących interfejs.
    //Generyczny cache.
    //Wrapper na wynik operacji (sukces/błąd).
    //🔥 HARD — WIELOWĄTKOWOŚĆ
    //Symulacja pobierania danych z wielu źródeł równolegle.
    //Kolejka zadań przetwarzana przez wiele wątków.
    //Problem współdzielenia zasobu (np. licznik).
    //Synchronizacja dostępu do pliku.
    //System logowania działający wielowątkowo.
    //🔥 HARD — LAMBDA + STREAM (REALNE)
    //Pipeline przetwarzania danych (filtrowanie, mapowanie, grupowanie).
    //Znajdź duplikaty w dużym zbiorze danych.
    //Transformacja obiektów do DTO.
    //Agregacja danych (sumy, średnie, min/max).
    //Łączenie wielu streamów danych.
    //🔥 HARD — PROJEKT KOŃCOWY (REKRUTACYJNY)
    //🧩 System: „Mini Banking App”
    //Wymagania:
    //użytkownicy, konta, transakcje
    //przelewy między kontami
    //walidacja danych
    //obsługa wyjątków
    //zapis/odczyt z pliku
    //stream do analizy danych
    //enum (status transakcji)
    //interfejsy (np. operacje bankowe)
    //wielowątkowość (symulacja wielu operacji naraz)
    //🔥 GIT / GITHUB (HARD)
    //Repo z historią commitów (logiczne zmiany).
    //Branch feature + merge.
    //Pull request (opis zmian).
    //Rozwiązanie konfliktów.
    //README:
    //opis projektu
    //jak uruchomić
    //przykłady użycia
    //🔥 TEST KOŃCOWY (HARD)
    //Teoria
    //Jak działa hashCode() i equals() i dlaczego są ważne?
    //Czym różni się synchronized od Lock?
    //Jak działa lazy evaluation w Stream?
    //Co to jest race condition?
    //Jak działa JVM memory model?
    //Praktyka (mini-task)
    //Zbuduj:
    //„Log Analyzer CLI Tool”
    //wczytuje plik logów
    //analizuje dane (stream + regex)
    //raportuje wyniki
    //obsługa błędów
    //testowalna struktura
    //repo GitHub

}
