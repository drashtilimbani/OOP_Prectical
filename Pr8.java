class pr8 {
    private int x;
    private int y;

    // Default constructor (sets x = 5, y = 5)
    Point() {
        this.x = 5;
        this.y = 5;
    }

  
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Using copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}
