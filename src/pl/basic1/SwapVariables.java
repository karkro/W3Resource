package pl.basic1;

public class SwapVariables {

    public static void main(String[] args) {

        int var1 = 10;
        int var2 = 20;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("\nvar1: " + var1);
        System.out.println("var2: " + var2);
    }
}
