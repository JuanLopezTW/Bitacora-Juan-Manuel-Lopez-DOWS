package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Estructurales.Ejercicio10Iterator;

public class TourRoute implements Aggregate<Place> {

    private final Place[] places;

    public TourRoute() {
        places = new Place[] {
                new Place("Colosseum"),
                new Place("Roman Forum"),
                new Place("Trevi Fountain"),
                new Place("Pantheon"),
                new Place("Spanish Steps")
        };
    }

    public Iterator<Place> createIterator() {
        return new RomeIterator();
    }

    private class RomeIterator implements Iterator<Place> {

        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < places.length;
        }

        public Place next() {
            return places[currentIndex++];
        }
    }
}
