/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author luciamera
 */
public class MenuInfantil extends Menu {

    /**
     * Atributos de la clase
     */
    private int zumo;
    private String regalo;

    /**
     * Constructor por defecto
     */
    public MenuInfantil() {

        super();
        this.zumo = 0;
        this.regalo = "";

    }

    /**
     * Constructor por parámetros
     *
     * @param principal introduce el plato principal al menú
     * @param bebida introduce la bebida al menú
     * @param postre introduce el postre al menú
     * @param zumo introduce el zumo al menú infantil
     * @param regalo introduce el regalo al menú infantil
     */
    public MenuInfantil(String principal, int bebida, int postre, int zumo, String regalo) {

        super(principal, bebida, postre);
        this.zumo = zumo;
        this.regalo = regalo;

    }

    /**
     * Método que devuelve el zumo del menú infantil
     *
     * @return devuelve el zumo del menú infantil
     */
    public int getZumo() {

        return this.zumo;

    }

    /**
     * Método que devuelve el regalo del menú infantil
     *
     * @return devuelve el regalo del menú infantil
     */
    public String getRegalo() {

        return this.regalo;

    }

    /**
     * Método que introduce el zumo al menú infantil
     *
     * @param zumo introduce el zumo al menú infantil
     */
    public void setZumo(int zumo) {

        this.zumo = zumo;

    }

    /**
     * Método para introducir el regalo al menú infantil
     *
     * @param regalo introduce el regalo al menú infantil
     */
    public void setRegalo(String regalo) {

        this.regalo = regalo;

    }

    /**
     * Método para calcular el importe total del menú
     *
     * @return devuelve el importe total del menú
     */
    @Override
    public double importe() {

        double importe = 12.0;

        return importe;

    }

}
