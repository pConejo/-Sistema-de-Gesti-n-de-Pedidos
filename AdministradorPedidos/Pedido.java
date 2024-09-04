package AdministradorPedidos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Pedido {
    private int numero;
    private String tipo;

    public Pedido(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Pedido() {
        this(0,null);
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
    
    
    
}
