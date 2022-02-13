package ua.sergeiokon.structural.adapter;

public class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
