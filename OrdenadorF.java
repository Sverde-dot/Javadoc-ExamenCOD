package ordenador.ejemplo;

import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class OrdenadorF {

    private Mouse esMouse;
    private Screen esScreen;
    private Cpu esCpu;

    /**
     *Default constructor without parameters
     */
    public OrdenadorF() {

    }

    /**
     OrdenadorF has the parameters of esMouse, esScreen and esCpu
     * @param esMouse
     * @param esScreen
     * @param esCpu
     */
    public OrdenadorF(Mouse esRaton, Screen esPantalla, Cpu esCpu) {
        this.esMouse = esMouse;
        this.esScreen = esScreen;
        this.esCpu = esCpu;
    }

    /**
     * Get of Mouse values,returns (esMouse)
     * @return
     */
    public Mouse getMouse() {
        return esMouse;
    }

    /**
     * Get of Screen values,returns (esScreen)
     * @return
     */
    public Screen getScreen() {
        return esScreen;
    }

    /**
     * Get of Cpu values,returns (esCpu)
     * @return
     */
    public Cpu getCpu() {
        return esCpu;
    }

    /**
     *
     * @param esRaton
     */
    public void setMouse(Mouse esMouse) {
        this.esMouse = esMouse;
    }

    /**
     *
     * @param esScreen
     */
    public void setScreen(Screen esScreen) {
        this.esScreen= esScreen;
    }

    /**
     *
     * @param esCpu
     */
    public void setCpu(Cpu esCpu) {
        this.esCpu = esCpu;
    }

    /**
     *
     */
    public void amosar() {
        System.out.println("Tipo rato: " + esMouse.gettype()+ "\n Marca pantalla: " + esScreen.getbrand()+ "\n Pulgadas pantalla: " + esScreen.getinches()+ "\n Velocidade cpu: " + esCpu.getspeed()+ "\n Memoria cpu: " + esCpu.getmemory());
    }

}
