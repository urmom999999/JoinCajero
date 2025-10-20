public class Cliente extends Thread {
    public String nombre;
public Cajero cajero;
    public Cliente(String nombre, Cajero cajero){
this.nombre=nombre;
this.cajero=cajero;
    }


@Override
public void  run(){
    int tiempoEspera=(int)(Math.random() *5500)+500;
int tiempoReducido=(int)(tiempoEspera *0.1);
    System.out.println(nombre +"esta en el cajero"+ cajero.getCajero());
    try {
        Thread.sleep(tiempoReducido);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(nombre +"terminó de pagar en"+ cajero.getCajero()+"!");


}
public String getCliente(){
        return nombre;
}

}
