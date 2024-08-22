import Modelo.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ♦ Hola Mundo ♦");
        int n1 =3;
        int n2 =3;
        int n3 =3;
        int suma =n1 +n2+n3;
        System.out.println("la suma es: "+suma);
        Persona per= new Persona();
        System.out.println(per.Caminar());;
        int idea = per.Edad(19);
        System.out.println("La edad es: " + idea);

    }
}