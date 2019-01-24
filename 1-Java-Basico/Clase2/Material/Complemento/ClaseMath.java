public class ClaseMath {

    public static void diferentesRedondeosDeMath(double valor){
        System.out.println("Numero a redondear = "+valor);
        int porFloor = (int)Math.floor(valor); // Hacia abajo
        int porCeil = (int)Math.ceil(valor); // Hacia arriba
        int porRound = (int)Math.round(valor); // Entero mas cercano a valor
        int porCasting = (int)valor; 

        System.out.println("Redondeo por floor "+ porFloor);
        System.out.println("Redondeo por ceil "+porCeil);
        System.out.println("Redondeo por round "+porRound);
        System.out.println("Redondeo por casting "+porCasting+ "\n");

    }

    public static int aleatorio(int de, int a){
        return (int)(Math.random()*(a-de+1) + de);
    }

    public static double aleatorioDecimal(double de, double a){
        return Math.random()*(a-de+1) + de;
    }

    public static void main(String[] args){

        //Constantes
        System.out.println("CONSTANTES");
        double valorE = Math.E;
        double valorPi = Math.PI;

        System.out.println("ValorE "+valorE+" ValorPi "+ valorPi+ "\n");

        //Trginometricas 
        System.out.println("FUNCIONES TRIGONOMETRICAS");
        double noventaGrados = Math.PI / 2;
        double senoDeNoventaGrados = Math.sin(noventaGrados);
        double cosenoDeCientoOchentaGrados = Math.cos(Math.PI);
        double anguloCuyoCosenoEsNoventa = Math.asin(senoDeNoventaGrados);
        double senoHiperbolico = Math.sin(Math.PI / 2);
        System.out.println("90 grados = "+noventaGrados + "Radianes");
        System.out.println("Seno de 90 grados = "+senoDeNoventaGrados);
        System.out.println("Coseno de 180 grados =  "+cosenoDeCientoOchentaGrados);
        System.out.println("Angulo cuyo coseno es 90 grados =  "+anguloCuyoCosenoEsNoventa);
        System.out.println("Seno Hiperbolico de 90 grados =  "+senoHiperbolico);
        System.out.println("");

        //exponencial e^a
        System.out.println("EXPONENCIAL");
        double exponencialDePi = Math.exp(Math.PI); // e a la PI
        System.out.println("Exponencial de PI = "+ exponencialDePi);
        System.out.println("\n");

        //logaritmo
        System.out.println("LOGARITMO");
        double logaritmoDePiBaseE = Math.log(Math.PI); //logarimo base e
        double logaritmoDePiBase10 = Math.log10(Math.PI); // logarimo base 10
        double logaritmoDeEBaseE = Math.log(Math.E);
        double logaritmoDe8Base2 = Math.log(8) / Math.log(2);

        System.out.println("Logaritmo de PI base E = "+logaritmoDePiBaseE);
        System.out.println("Logaritmo de PI base 10 = "+logaritmoDePiBase10);
        System.out.println("Logaritmo de E base E = "+logaritmoDeEBaseE);
        System.out.println("Logaritmo de 8 base 2 = "+logaritmoDe8Base2);
        System.out.println("");

        // Potencia
        System.out.println("POTENCIA");
        double dosAlaDiez = Math.pow(2, 10);
        double eALaPi = Math.pow(Math.E, Math.PI);

        System.out.println("Dos a la diez = " + dosAlaDiez);
        System.out.println("E a la PI = " + eALaPi);
        System.out.println("");

        // Raiz Cuadrada
        System.out.println("RAIZ CUADRADA");
        double raizCuadradaDe64 = Math.sqrt(64);

        System.out.println("Raiz cuadrada de 64 = " + raizCuadradaDe64);
        System.out.println("");


        // Valor absoluto
        System.out.println("VALOR ABSOLUTO");
        double valorAbsolutoDe10 = Math.abs(10);
        double valorAbsolutoDeMenos10 = Math.abs(-10);

        System.out.println("Valor absoluto de 10 = " + valorAbsolutoDe10);
        System.out.println("Valor absoluto de -10 = " + valorAbsolutoDeMenos10);
        System.out.println("");


        // Redondeos
        System.out.println("REDONDEOS");
        double valor = 10.43;
        double valor2 = 10.55;
        double valor3 = 10;
        double valor4 = -10.43;
        double valor5 = -10.55;
        diferentesRedondeosDeMath(valor);
        diferentesRedondeosDeMath(valor2);
        diferentesRedondeosDeMath(valor3);
        diferentesRedondeosDeMath(valor4);
        diferentesRedondeosDeMath(valor5);
        System.out.println("");

        //Numero Aleatorios
        System.out.println("ALEATORIOS");
        double primer = Math.random(); // numero entre [0,1)
        double segundo = aleatorio(1, 4);
        System.out.println("primer aleatorio = "+primer);
        System.out.println("segundo aleatorio = "+segundo);
        System.out.println("");

        //Maximos y minimos
        System.out.println("MAXIMOS Y MINIMOS");
        int num1 = 5;
        int num2 = 1;
        int maximo = Math.max(num1, num2);
        int minimo = Math.min(num1, num2);
        System.out.println("Num1 = "+ num1 + " num2= "+num2);
        System.out.println("Maximo = "+maximo);
        System.out.println("Minimo = "+minimo);
        System.out.println("");
    }
}