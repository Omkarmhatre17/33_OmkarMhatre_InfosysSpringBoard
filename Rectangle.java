public class Rectangle {
    // Private instance variables
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter method for length (optional, for demonstration purposes)
    public int getLength() {
        return length;
    }

    // Getter method for breadth (optional, for demonstration purposes)
    public int getBreadth() {
        return breadth;
    }

    // Main method (optional, for demonstration purposes)
    public static void main(String[] args) {
        // Create an object of Rectangle
        Rectangle myRectangle = new Rectangle();

        // Set values using setter methods
        myRectangle.setLength(5);
        myRectangle.setBreadth(8);

        // Display the values using getter methods (optional)
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
    }
}
