package Debugging;

public class FixDebugBox {
    private int width;
    private int length;
    private int height;
    public FixDebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }
    public FixDebugBox(int width, int height, int length)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + width + "  Length: " +
                length + "  Height: " + height);
    }
    public double getVolume(int width, int height, int length)   {
        double vol = length * width * height;
        return vol;
    }
}
