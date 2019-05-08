import java.util.LinkedList;



/**

 *

 * @author ltourn01

 */

public class App extends Instr{



    @Override

    void exec_instr(Config cf) {

        cf.get_code().pop();


        PairV pair = (PairV)cf.get_value();

        ClosureV closure = (ClosureV) pair.get_first();


        cf.set_value(new PairV(closure.get_valeur(), pair.get_snd()));


        cf.get_stack().addFirst(new CodeSE(cf.get_code()));

        
        cf.set_code(new LinkedList<>(closure.get_code()));

    }

    

}