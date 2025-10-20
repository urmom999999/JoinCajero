import java.util.Arrays;
public class Cajero extends Thread {
    public String nombre;

public Cajero(String nombre){
    this.nombre=nombre;
}

    @Override
    public void  run(){

    System.out.println("Cajero " +nombre+" iniciado");
if(nombre=="c1"){
    clientesDelCajero=clientes1;
}
else if(nombre=="c2"){
    clientesDelCajero=clientes2;
}
for(Cliente cliente : clientesDelCajero){
    System.out.println("Procesando orden...");
    cliente.start();
    cliente.join();
    System.out.println("Proceso terminado! " + cliente + "atendido correctamente por"+ nombre);
}

        System.out.println(nombre+"termino con todos los clientes!");

    }

    public String getCajero(){

        return nombre;
    }
}


