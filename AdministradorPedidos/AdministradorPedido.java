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
    
    public Pedido atender(String tipo){
        if(tipo.equals(list.poll().getTipo())){
            
        }else{
            list.poll();
        }
        
        return list.peek();
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
    
}
