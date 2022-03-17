package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.Factory;
import com.factoriaf5.rps.domain.contracts.Material;

public class MaterialFactory implements Factory {

    @Override
    public Material createObject(String name) {
        Material material = null;

        if(name.equals("R")) {
            material = new Rock();
        }

        if(name.equals("P")) {
            material = new Paper();
        }
        
        if(name.equals("S")) {
            material = new Scissors();
        }

        return material;
    }
    
}
