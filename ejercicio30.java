package arrayparte2;

public class ejercicio30 {

    public static void main(String[] args) {
        int[] datos = {-5,4,2,-4,-3,-6,-9,5,3,6,78};

        boolean ok;
        int i, negativos;

        i = 0;
        negativos = 0;
        ok = false;

        while (i < datos.length && negativos<=5) {
            if (datos[i]<0) {
                negativos++;

                }

            i++;

        }
        if(negativos==5){
            ok=true;
        }
        System.out.println("Cumple con el formato: " + ok);
    }
}
