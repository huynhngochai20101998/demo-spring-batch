package com.tamaumi.springbatch.batch;

import com.tamaumi.springbatch.domain.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class CoffeeItemProcessor implements ItemProcessor<Coffee, Coffee> {

    private static int i = 0;

    @Override
    public Coffee process(final Coffee coffee) throws Exception {
        String brand = coffee.getBrand().toUpperCase();
        String origin = coffee.getOrigin().toUpperCase();
        String chracteristics = coffee.getCharacteristics().toUpperCase();
        log.debug("toi la hai:  "+ (i++));

        Coffee transformedCoffee = new Coffee(brand, origin, chracteristics);
        log.info("Converting ( {} ) into ( {} )", coffee, transformedCoffee);

        return transformedCoffee;
    }
}