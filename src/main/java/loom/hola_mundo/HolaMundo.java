package loom.hola_mundo;

/**
 * La clase HolaMundo.
 */
public class HolaMundo {
	
    /** The Constant VACIO. */
    private static final String VACIO = ""; 

    /**
     * Saludar.
     *
     * @param persona nombre de la persona a la que quiero saludar
     * @return String el saludo
     */
    public String saludar(final String persona) {
        if (persona == VACIO)
            return "¡Hola!";
        else
            return "¡Hola, " + persona + "!";
    }

    /**
     * Saludar.
     *
     * @return String el saludo
     */
    public String saludar() {
        return "¡Hola!";
    }
}
