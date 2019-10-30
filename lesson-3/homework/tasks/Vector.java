import java.io.*;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] fromFile(File file, int n) throws IOException, VectorException {
    }

    public static void toFile(Vector[] vectors, File file) throws IOException, VectorException {
    }
}
