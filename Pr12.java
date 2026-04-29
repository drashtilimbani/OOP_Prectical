class VolumeCalculator {

    // Method to calculate volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method to calculate volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate volume of Sphere
    double calculateVolumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        VolumeCalculator obj = new VolumeCalculator();

        // Cube
        double cubeVolume = obj.calculateVolume(5);
        System.out.println("Volume of Cube: " + cubeVolume);

        // Rectangular Cube
        double rectVolume = obj.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);

        // Sphere
        double sphereVolume = obj.calculateVolumeSphere(3);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
