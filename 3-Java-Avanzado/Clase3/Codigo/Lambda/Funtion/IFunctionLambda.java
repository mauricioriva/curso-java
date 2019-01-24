@FunctionalInterface

public interface IFunctionLambda {

    public void suma(int a,int b); //Metodo abstracto

    public default String sume(){ //Metodos propios con default
        return "Acabas de sumar";
    }
}