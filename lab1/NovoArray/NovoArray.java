public class NovoArray {
    public static void mult(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valor * array[i];
        }
        array = new int[10];
    }
    mult(novoArray, 10);
}
