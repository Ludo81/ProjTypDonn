package typedonn;

import Benji.java_files.*;

/**
 * Classe pour la création de tuples (ou couples)
 * @author Ludovic Tournier
 */
public class Pair<F, S> {
    private F fst;
    private S snd;
    
    public Pair(F fst, S snd){
        this.fst = fst;
        this.snd = snd;
    }
    
    public F get_first(){return fst;}
    
    public S get_second(){return snd;}
    
    
}
