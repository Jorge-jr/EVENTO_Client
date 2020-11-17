/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import javax.annotation.ManagedBean;


/**
 *
 * @author Jorge
 */

@ManagedBean
public class EventoMB {
    public String getEventos(){
        Client c = Client.create();
        WebResource wr = c.resource("http://localhost:50272/EVENTOS/webresources/evento");
        return wr.get(String.class);
    }
}
