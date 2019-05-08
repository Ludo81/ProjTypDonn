/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedonn;

import java.util.ArrayList;

/**
 *
 * @author ltourn01
 */
public class Cod extends Value{
    
    ArrayList<Instr> list = new ArrayList<Instr>();
    
    public Cod(ArrayList<Instr> liste){
        this.list = liste;
    }

    public ArrayList<Instr> getList() {
        return list;
    }

    public void setElement(Instr i) {
        this.list.add(i);
    }
    
    public void getElement(int i) {
        this.list.get(i);
    }
    
}


