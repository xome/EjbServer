package de.mayer.ejbServer;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateful;

@Stateful
@Remote(Hello.class)
public class StatefulHello implements Hello {
    private int count = 0;

    @Override
    public String message() {
        return String.format("Hi there!, times %d", count++);
    }
}
