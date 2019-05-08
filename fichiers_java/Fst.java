package typedonn;

/**
 *
 * @author ltourn01
 */
class Fst extends Instr{
    
    public Fst(){
    }
    
    void exec_instr(Config cf){
        cf.set_value( ((PairV) cf.get_value()).fst());
        cf.get_code().pop();
    }
    
}
