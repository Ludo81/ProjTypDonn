package typedonn;

import java.util.*;

class Config extends Object {
    Value v;
    LinkedList<Instr> c;
    LinkedList<StackElem> s;
    
    private LinkedList<Pair<String, LinkedList<Instr>>> env;

    Value get_value() {
        return v;
    }
    LinkedList<Instr> get_code() {
        return c;
    }
    LinkedList<StackElem> get_stack() {
        return s;
    }
    
    LinkedList<Pair<String, LinkedList<Instr>>> get_env() {
        return env;
    }

    void set_value(Value nv) {
        v = nv;
    }
    public void set_env(LinkedList<Pair<String, LinkedList<Instr>>> ne) {
        env = ne;
    }
    void set_code(LinkedList<Instr> nc) {
        c = nc;
    }
    void get_stack(LinkedList<StackElem> ns) {
        s = ns;
    }

    /* Constructors */
    public Config (Value vl, LinkedList<Instr> cd, LinkedList<StackElem> se) {
        v = vl;
        c = cd;
        s = se;
    }


    // one-step execution 
    boolean exec_step() {
        if (c.isEmpty()){
            return false;
        }
        else{
            c.get(0).exec_instr(this);
            return true;
        }
    }

    // run to completion
    void exec() {
        while (exec_step()){
            
        }
    }

    // run for n steps
    void step(int n) {
        // to be implemented
    }
    
}

