package ua.sergeiokon.behavioral.iterator;

public class Database implements Container {

    private String[] names = {"Oleg", "David", "Olga", "Tom"};

    @Override
    public Iterator getIterator() {
        return new DatabaseIterator();
    }

    private class DatabaseIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
