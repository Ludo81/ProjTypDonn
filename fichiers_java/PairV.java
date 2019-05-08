/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedonn;

import java.util.*;


class PairV extends Value{
    
    Value v1;
    Value v2;
    
    public PairV(Value i1, Value i2){
        i1 = this.v1;
        i2 = this.v2;
    }
    
    Value fst(){
        return this.v1;
    }
    
    Value snd(){
        return this.v2;
    }
    
    void set_fst(Value i){
        this.v1 = i;
    }
    
    void set_snd(Value i){
        this.v2 = i;
    }
    
    void print_value(){
        System.out.println(v1);
        System.out.println(v2);
    }
    
}
