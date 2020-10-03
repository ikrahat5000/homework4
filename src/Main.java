public class Main {

    public static void main(String[] args) {


        double[] arr = {2.5, 5.0, 6.1, 7.5, -3.4, -4.5, -8.6, -9.0, -10.0, 5.6, 10.0, -11.0, 4.5, 16.0, 17.0};

        double cumma = 0;
        int kolichestvo = 0;
        boolean knopka = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                knopka = true;
            }
            if (arr[i] > 0 && knopka) {
                cumma += arr[i];
                kolichestvo=kolichestvo++;
            }
        }

        System.out.println(cumma / kolichestvo);
        System.out.println(arr.length);
//dop

    }
}
