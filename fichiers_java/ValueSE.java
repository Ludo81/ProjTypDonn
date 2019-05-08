package typedonn;

/**
 *
 * @author Ludovic Tournier
 */
public class ValueSE extends StackElem{
    private final Value valeur;
    
    public ValueSE(Value valeur){
        this.valeur = valeur;
    }

    public Value get_valeur() {
        return valeur;
    }
    
}
