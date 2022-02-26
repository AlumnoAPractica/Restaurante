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
public class Menu {

    /**
     * Atributos de la clase
     */
    private double IVA;
    private double descuento;
    private String principal;
    private int bebida;
    private int postre;

    /**
     * Constructor por defecto
     */
    public Menu() {

        this.IVA = 0.0;
        this.descuento = 0.0;
        this.principal = "";
        this.bebida = 0;
        this.postre = 0;

    }

    /**
     * Constructor por parámetros
     *
     * @param principal introduce el plato principal al menú
     * @param bebida introduce la bebida al menú
     * @param postre introduce el postre al menú
     */
    public Menu(String principal, int bebida, int postre) {

        this.principal = principal;
        this.bebida = bebida;
        this.postre = postre;

    }

    /**
     * Método para devolver el IVA
     *
     * @return devuelve el IVA
     */
    public double getIVA() {

        return this.IVA;

    }

    /**
     * Método para devolver el descuento
     *
     * @return descuento
     */
    public double getDescuento() {

        return this.descuento;

    }

    /**
     * Método para devolver el plato principal del menú
     *
     * @return devuelve el plato principal del menú
     */
    public String getPrincipal() {

        return this.principal;

    }

    /**
     * Método para devolver la bebida del menú
     *
     * @return devuelve la bebida del menú
     */
    public int getBebida() {

        return this.bebida;

    }

    /**
     * Método para devolver el postre del menú
     *
     * @return devuelve el postre del menú
     */
    public int getPostre() {

        return this.postre;

    }

    /**
     * Método para introducir el IVA
     *
     * @param IVA introduce el IVA
     */
    public void setIVA(double IVA) {

        this.IVA = IVA;

    }

    /**
     * Método para introducir el descuento
     *
     * @param descuento introduce el descuento
     */
    public void setDescuento(double descuento) {

        this.descuento = descuento;

    }

    /**
     * Método para introducir el plato principal del menú
     *
     * @param principal introduce el plato principal del menú
     */
    public void setPrincipal(String principal) {

        this.principal = principal;

    }

    /**
     * Método para introducir la bebida del menú
     *
     * @param bebida introduce la bebida del menú
     */
    public void setBebida(int bebida) {

        this.bebida = bebida;

    }

    /**
     * Método para introducir el postre del menú
     *
     * @param postre introduce el postre del menú
     */
    public void setPostre(int postre) {

        this.postre = postre;

    }

    /**
     * Método para calcular el importe total del menú
     *
     * @return devuelve el importe total del menú
     */
    public double importe() {

        double importe = 0.0;

        switch (this.principal) {

            case "Entrecot":

                importe = importe + 15.0;

                break;

            case "Pez Espada":

                importe = importe + 12.0;

                break;

            case "Carrillada":

                importe = importe + 10.0;

                break;

            case "Dorada":

                importe = importe + 20.0;

                break;

            default:

                importe = importe + 13.0;

                break;

        }

        switch (this.bebida) {

            case 1:

                importe = importe + 1.0;

                break;

            case 2:

                importe = importe + 1.5;

                break;

            default:

                importe = importe + 2.0;

                break;

        }

        switch (this.postre) {

            case 1:

                importe = importe + 2.0;

                break;

            case 2:

                importe = importe + 3.0;

                break;

            default:

                importe = importe + 4.0;

                break;

        }

        return importe + importe * this.IVA - this.descuento;

    }

    /**
     * Método para mostrar el menú y su importe
     */
    public void mostrar() {

        System.out.println("IMPORTE DE LA CUENTA");
        System.out.println("--------------------");

        System.out.println("PLATO PRINCIPAL");

        System.out.println(this.principal);

        System.out.println("BEBIDA:");

        switch (this.bebida) {

            case 1:

                System.out.println("Refresco");

                break;

            case 2:

                System.out.println("Vino");

                break;

            default:

                System.out.println("Otros");

                break;

        }

        System.out.println("POSTRE:");

        switch (this.postre) {

            case 1:

                System.out.println("Fruta");

                break;

            case 2:

                System.out.println("Helado");

                break;

            default:

                System.out.println("Otros");

                break;

        }

        System.out.println("IMPORTE TOTAL: " + this.importe());

    }

}
