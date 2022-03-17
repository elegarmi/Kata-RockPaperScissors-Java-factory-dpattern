package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.*;

public class Scissors implements Material {
    
    @Override
    public String winsTo(Material material) {
        
        if (material instanceof Rock) { return "Scissors loses to Rock"; }
        if (material instanceof Paper) { return "Scissors wins to Paper"; }
        // if (material instanceof Scissors) { return "Scissors & Scissors -> draw"; }

        return "Scissors & Scissors -> draw";
    }
}
