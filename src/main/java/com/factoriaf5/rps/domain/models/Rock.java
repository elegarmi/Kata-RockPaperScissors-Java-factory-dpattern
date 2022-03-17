package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.*;

public class Rock implements Material {
    
    @Override
    public String winsTo(Material material) {

        if (material instanceof Paper) { return "Rock loses to Paper"; }
        if (material instanceof Scissors) { return "Rock wins to Scissors"; }
        // if (material instanceof Rock) { return "Rock & Rock -> draw"; }

        return "Rock & Rock -> draw";
    }
}