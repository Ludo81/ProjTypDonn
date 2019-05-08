package typedonn;

/**
 *
 * @author ltourn01
 */
class Binop extends Instr{
    
    Object a;
    Object b;
    
    public Binop(){       
    }
    
    Object add_v (Object i, Object j){
        a = i;
        b = j;
        if (a instanceof Integer){
            int res = (int) a + (int) b;
            return res;
        }
        else{
            boolean res = (boolean) a || (boolean) b;
            return res;
        }
    }
    
    Object equals (Object i, Object j){
        a = i;
        b = j;
        if (a instanceof Integer){
            boolean res = (boolean) a.equals(b);
            return res;
        }
        else{
            boolean res = (boolean) a == (boolean) b;
            return res;
        }
    }
    
    
    
}
    

