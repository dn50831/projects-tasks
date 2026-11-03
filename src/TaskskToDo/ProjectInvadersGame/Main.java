package TaskskToDo.ProjectInvadersGame;

public class Main {
    public static void main(String[] args) {


        //PROJEKT 2: "Java Invaders" (Gra 2D - Wymaga GUI)
        //Jeśli chcesz wyjść poza konsolę, musisz stworzyć proste okno i pętlę gry.
        // To wyzwanie nauczy Cię zarządzania stanem w czasie rzeczywistym.
        //Lista wymagań funkcjonalnych:
        //Silnik Graficzny (Swing/AWT): Stwórz okno (JFrame) i obszar rysowania (JPanel).
        // Musisz nadpisać metodę paintComponent, aby rysować obiekty za pomocą klasy Graphics.
        //Pętla Gry (Loops & Threads): Gra musi działać w nieskończonej pętli,
        // która co określony czas (np. 16ms dla 60 FPS) aktualizuje pozycje obiektów
        // i przerysowuje ekran.
        //Zarządzanie Obiektami (Collections & OOP): Wszystkie pociski, przeciwnicy
        // i bonusy muszą znajdować się w listach. Użyj Iteratora lub Streamów do usuwania obiektów,
        // które wyleciały poza ekran lub zostały zniszczone.
        //Zdarzenia Klawiatury (Functional Interfaces): Podepnij KeyListener.
        // Reakcje na klawisze (lewo, prawo, spacja) zaimplementuj jako mapę akcji Map<Integer, Runnable>.
        //Walidacja Ruchu (Logic): Napisz algorytm sprawdzający kolizje ("Hitbox").
        // Wykorzystaj klasę Rectangle i jej metodę intersects.
        //Tabela Wyników (Files & Streams): Po przegranej gracz podaje imię.
        // System sprawdza, czy imię spełnia wymogi (Regex: tylko litery, 3-10 znaków),
        // a następnie dopisuje wynik do pliku tekstowego.
        //Zasoby (Exceptions): Obsłuż błędy ładowania grafik lub dźwięków
        // (np. jeśli plik hero.png zaginie, gra powinna załadować zastępczy czerwony kwadrat zamiast się wyłączyć).

    }
}
