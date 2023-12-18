package com.pluralsight.springapp;

import org.springframework.stereotype.Component;

@Component
public class FunkPopDAOlmpl implements FunkPopDAO {
    @Override
    public FunkoPops getFunkoByID() {
        return new FunkoPops();
    }
}
