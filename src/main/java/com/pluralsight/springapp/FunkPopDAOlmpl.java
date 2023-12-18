package com.pluralsight.springapp;

import org.springframework.stereotype.Component;

@Component
public class FunkPopDAOlmpl implements FunkPopDAO {
    @Override
    public FunkoPops getFunkoByID(FunkoPops funkoPops) {
        return new FunkoPops();
    }
    public FunkoPops getFunkoPopById(FunkoPops funkoPop) {

        return funkoPop;
    }
}
