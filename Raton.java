public class Raton {
    
    private String marca;
    private int DPI;
    private boolean bluetoothEncendido;
    
    public Raton(String marcaRaton, int numDPI, boolean bluetooth){
        marca = marcaRaton;
        DPI = numDPI;
        bluetoothEncendido = bluetooth;
    }
    public String getMarca(){
        return marca;
    }
    public int getDPI(){
        return DPI;
    }
    public boolean getBluetoothEncendido(){
        return bluetoothEncendido;
    }
    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }
    public void setDPI(int nuevoDPI){
        DPI = nuevoDPI;
    }
    public void alternarBluetooth(){
        bluetoothEncendido = !bluetoothEncendido;
    }
    public void imprimirDetalles(){
        System.out.println("Marca: " + marca + ", DPI: " + DPI + ", bluetooth: " + bluetoothEncendido);
    }
    public String getDetalles(){
        return "Marca: " + marca + ", DPI: " + DPI + ", bluetooth: " + bluetoothEncendido;
    }
}