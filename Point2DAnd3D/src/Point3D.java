public class Point3D extends Point2D {
    float z;

    Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {this.x, this.y, this.z};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() +"," +this.z;
    }
}
