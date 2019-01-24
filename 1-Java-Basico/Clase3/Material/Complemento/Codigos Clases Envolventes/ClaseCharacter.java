public class ClaseCharacter{

    public static void main(String[] args) {
        char ch = ' ';
        boolean esDigito = Character.isDigit(ch);
        boolean esLetra = Character.isLetter(ch);
        boolean esMinuscula = Character.isLowerCase(ch);
        boolean esEspacio = Character.isWhitespace(ch);
        boolean esMayuscula = Character.isUpperCase(ch);
        System.out.println("Es digito? "+esDigito);
        System.out.println("Es letra? "+esLetra);
        System.out.println("Es minuscula? "+esMinuscula);
        System.out.println("Es espacio? "+esEspacio);
        System.out.println("Es mayuscula? "+esMayuscula);
    }
}