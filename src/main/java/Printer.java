public class Printer {
    public void printName(Shape shape){
        System.out.println("Shape name is " + shape.getName());
    }
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.printName(new Circle(10));
        printer.printName(new Quad(5));
        printer.printName(new Triangle(10, 10));
    }
}
