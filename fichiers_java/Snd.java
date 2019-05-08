/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedonn;

/**
 *
 * @author ltourn01
 */
public class Snd extends Instr{
    
    public Snd(){
    }
    
    void exec_instr(Config cf){
        cf.set_value( ((PairV) cf.get_value()).snd());
        cf.get_code().pop();
    }
}

