package ua.sergeiokon.structural.adapter;

public class Main {

    public static void main(String[] args) {
        VectorGraphicsInterface adapter = new VectorAdapterFromRaster();
        adapter.drawLine();
        adapter.drawSquare();
    }
}
