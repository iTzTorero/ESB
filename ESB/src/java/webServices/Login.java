/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.net.HttpURLConnection;

/**
 *
 * @author Juan Pablo
 */
@WebService(serviceName = "login")
public class Login {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean Login(@WebParam(name = "email") String email, @WebParam(name = "contrasenia") String contrasenia) {
        final HttpURLConnection requestLogin = new HttpURLConnection();
        return false;
    }
}
