// Se requiere un programa en Java
// para determinar cuál es el número más pequeño,
// cuál es el número más grande y cuál es el número intermedio
// de los tres ingresados.
public class Media {
    float numero, numero2, numero3, media = 0;

    public Media() {
    }

    public Media(float numero, float numero2, float numero3, float media) {
        this.numero = numero;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.media = media;
    }

    public float mayor() {
        return (Math.max(numero, Math.max(numero2, numero3)));
    }

    public float minimo() {
        return (Math.min(numero, Math.min(numero2, numero3)));
    }

    public float medio() {
        if (numero >= numero2 && numero >= numero3)
            media = numero2;
        if (numero2 >= numero3 && numero3 >= numero)
            media = numero3;
        if (numero3 >= numero && numero >= numero2)
            media = numero;
        return (media);
    }

        @Override
        public String toString () {
            return "NUMEROS A EVALUAR" +
                    "\n Numero 1:   " + this.numero
                    + "\n Numero 2 :  " + this.numero2
                    + "\n Numero 3:   " + this.numero3
                    + "\n EL MAYOR ES:    " + mayor()
                    + "\n EL MENOR ES:    " + minimo()
                    + "\n EL MEDIO ES:    " + medio();
        }
    }


