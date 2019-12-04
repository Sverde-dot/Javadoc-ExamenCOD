package ordenador.ejemplo;
/**
 * this class saves the Mouse(type)
 *
 * @author sverdecadilla
 */
public class Mouse {
    private String type;   
/**
* Default constructor without parameters
*/
    public Mouse() {
    }

    /**
     * mouse has the parameters of type(String)
     *
     * @param type
     */
    public Mouse(String type) {
        this.type = type;
    }
    /**
     * Set of type values
     */
    public void settype() {
        this.type = type;
    }

    /**
     * Get of type values,returns (type)
     *
     * @return
     */
    public String gettype() {
        return type;
    }
}
