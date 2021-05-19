/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_interface;

/**
 *
 * @author tiennh
 */
public class Daibang implements BayInterface {

    @Override
    public void bay() {
        System.out.println("Bay");
    }

    @Override
    public void swim() {
        System.out.println("Ko biết Bơi Đâu");
    }
    
}
