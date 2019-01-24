//No es necesario implementar
public class TestLambdas{

    public static void main(String[] args) {
        
        int x = 10;
        int y = 5;

        //Definir funcion del método abstracto
        IFunctionLambda iflambda = (a,b) -> {System.out.println(a + b);};
        
        //Se usan los metodos implementados
        iflambda.suma(x,y);
        System.out.println(iflambda.sume());

    }

}