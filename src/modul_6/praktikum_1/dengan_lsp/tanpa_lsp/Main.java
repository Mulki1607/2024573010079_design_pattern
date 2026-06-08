package modul_6.praktikum_1.dengan_lsp.tanpa_lsp;

public class Main {
    public static void testRectangle(Rectangle r){
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Hasil yang diharapkan: 20, Hasil output: "+ r.calculateArea());
        }

        public static void main(String[] args){
            Rectangle rect = new Rectangle();
            testRectangle(rect);

            Rectangle square = new Square();
            testRectangle(square);
    }
}
