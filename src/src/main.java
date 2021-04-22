package src;

public class main {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[3];
        colorables[0] = new Circle();
        colorables[1] = new Rectangle();
        colorables[2] = new Square();

        for (Colorable color : colorables){
            System.out.println(color.getArea());
            try {
                color.howToColor();
            }catch (Exception e){
                System.out.println("Warning: " + e.getMessage());
            }
        }
    }
}
