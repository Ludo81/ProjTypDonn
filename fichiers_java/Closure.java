/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedonn;

import java.util.LinkedList;

/**
 *
 * @author ltourn01
 */
public class Closure extends Value{
    
    Value v;
    LinkedList<Instr> c;
    
    public Closure(LinkedList<Instr> c ,Value v){
        c = this.c;
        v = this.v;
    }
    
    Value val(){
        return this.v;
    }
    
    LinkedList<Instr> cod(){
        return this.c;
    }
    
    void set_val(Value i){
        this.v = i;
    }
   
    
    void print_clos(){
        System.out.println(v);
        System.out.println(c);
    }
    
}
