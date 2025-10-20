import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Cajero c1 = new Cajero("c1");
        Cajero c2 = new Cajero("c2");

        Cliente[] clientes1={
        new Cliente("Ramon",c1),
        new Cliente("Juanjo",c1),
        new Cliente("Pepe",c1),
        new Cliente("Manuel",c1)};

        Cliente[] clientes2={
        new Cliente("Ramona",c2),
        new Cliente("Larry",c2),
        new Cliente("Manuela",c2),
        new Cliente("Ana",c2)};
//Añadirlos a array?

        System.out.println("Comienzo!");
        c1.start();
        c2.start();

try{
    c1.join();
    c2.join();
}catch(InterruptedException e) {
    System.out.println("Error!");

}
    }}
