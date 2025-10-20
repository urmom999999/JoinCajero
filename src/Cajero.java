
import java.util.Arrays;
import java.util.List;
public class Cajero extends Thread {
    public String nombre;
private Cliente[] clientesDelCajero;

private static Cliente[] clientes1;
private static Cliente[] clientes2;
    public Cajero(String nombre){
        this.nombre=nombre;
    }
//Lio, asignarlos directamente desde main al cajero como array de arrays?
public static void setClientes1(Cliente [] clientes){
        clientes1=clientes;
}
public static void setClientes2(Cliente [] clientes){
        clientes2=clientes;
    }

    @Override
    public void  run(){

    System.out.println("Cajero " +nombre+" iniciado");
if(nombre.equals("c1")){
    clientesDelCajero=clientes1;
}
else if(nombre.equals("c2")){
    clientesDelCajero=clientes2;
}
for(Cliente cliente : clientesDelCajero){
    System.out.println("Procesando orden...");
    try{
    cliente.start();
    cliente.join();
    //Thread[#38,Thread-2,5,] ??
    System.out.println("Proceso terminado! Atendido correctamente por el cajero "+ nombre);
} catch(InterruptedException e){
        System.out.println("Error con "+nombre +" "+ cliente);
    }
}

        System.out.println(nombre+" terminó con todos los clientes!");

    }

    public String getCajero(){

        return nombre;
    }
}


