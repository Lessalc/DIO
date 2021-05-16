package com.github.lessalc.cities.taxes.service;

import com.github.lessalc.cities.taxes.repository.TaxRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class TaxService {

    private final TaxRepository taxRepository;
    Logger log = LoggerFactory.getLogger(TaxService.class);

    public TaxService(final TaxRepository taxRepository){
        this.taxRepository = taxRepository;
    }

    public Double calcTaxDifalStates(final Long state1, final Long state2){
        Double valorFrom = taxRepository.findById(state1).get().getTax();
        Double valorTo = taxRepository.findById(state2).get().getTax();

        final Double difal;
        if(valorFrom > valorTo){
            difal = 0.0;
        }else{difal = (valorTo - valorFrom);}
        return difal;
    }


}
