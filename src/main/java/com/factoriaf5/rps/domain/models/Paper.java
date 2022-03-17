package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.*;

public class Paper implements Material {

    @Override
    public String winsTo(Material material) {

        if (material instanceof Rock) { return "Paper wins to Rock"; }
        if (material instanceof Scissors) { return "Scissors wins to Paper"; }
        // if (material instanceof Paper) { return "Paper & Paper -> draw"; }

        return "Paper & Paper -> draw";
    }
}