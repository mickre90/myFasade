/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfacade;

import MySystem.SystemClass1;
import MySystem.SystemClass2;
import MySystem.SystemClass3;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Anti-pattern  */
        SystemClass1 sys1 = new SystemClass1();
        SystemClass2 sys2 = new SystemClass2();
        SystemClass3 sys3 = new SystemClass3();

        sys1.doSomething3();
        sys3.doSomething1();
        sys2.doSomething2();

        sys3.doSomething1();
        sys3.doSomething2();

        // or
        
        doSomethingClient1(sys1, sys2, sys3);
        doSomethingClient2(sys3);
        doSomethingClient3(sys1, sys2, sys3);

        /* Fasada  */
        //...
    }

    public static void doSomethingClient1(SystemClass1 sys1, SystemClass2 sys2, SystemClass3 sys3) {
        sys1.doSomething3();
        sys3.doSomething1();
        sys2.doSomething2();
    }

    public static void doSomethingClient2(SystemClass3 sys3) {
        sys3.doSomething1();
        sys3.doSomething2();
    }
    
     public static void doSomethingClient3(SystemClass1 sys1, SystemClass2 sys2, SystemClass3 sys3) {
        sys1.doSomething1();
        sys3.doSomething2();
        sys2.doSomething2();
    }

}
