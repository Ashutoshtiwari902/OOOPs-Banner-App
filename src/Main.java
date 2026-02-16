public class Main {
    public static void main(String[] args) {

        String line1 = String.join("",
                " *****   ",
                " *****   ",
                " *****   ",
                " ***** ");

        String line2 = String.join("",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     *");

        String line3 = line2;
        String line4 = line2;
        String line5 = line2;
        String line6 = line2;

        String line7 = line1;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}