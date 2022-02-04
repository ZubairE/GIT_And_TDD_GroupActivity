/**
 *
 * Rectangle
 * @author Tarren-Marc Adams
 * student number 214041794
 *
 */

package za.ac.cput;

public class Rectangle {
    private int length;
    private int width;
    private int height;

    public Rectangle(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
