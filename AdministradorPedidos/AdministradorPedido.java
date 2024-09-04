/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorPedidos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class AdministradorPedido {
    private static int cont;
    private Queue<Pedido> list;

    public Queue<Pedido> getList() {
        return list;
    }

    
    
    public AdministradorPedido(Queue<Pedido> list) {
        this.list = list = new LinkedList<Pedido>();
    }

    public AdministradorPedido() {
        this(new LinkedList<Pedido>());
    }
    
    public void generarPedido(String tipo){
        cont++;
        Pedido p = new Pedido(cont,tipo);
        agregar(p);
    }
    
    public void atender(String tipo){
        if(tipo.equals(list.peek().getTipo())){
            list.remove();
            
        }else{
            list.poll();
        }

    }
    
    public void agregar(Pedido pedido){
        list.add(pedido);
        
    }
    
    public void eliminarValor(int numero){
        for(Iterator<Pedido> it = list.iterator(); it.hasNext();){
            if(it.next().getNumero() == numero){
                it.remove();
            }
        }
            
    }
    
    public void eliminarPosicion(int pos){
        list.remove().equals(pos);
    }
    
    public Pedido buscar(String tipo){
        for(Pedido p : list){
            if(tipo.equals(p.getTipo())){
                return p;
            }
        }
        
        return null;
    }

    @Override
    public String toString() {
        return "AdministradorPedido{" + "list=" + list + '}';
    }
    
    
}
