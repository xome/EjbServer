package de.mayer.ejbServer;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;
@Stateless
@Remote(Hello.class)
public class StatelessHello implements Hello{

    @Override
    public String message() {
        return "Hi there!";
    }
}
