package com.spring.bootstrap;

import com.spring.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------REGION START-------------");

        System.out.println("findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry(\"Asia\") = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println(regionRepository.findTop2ByCountry("Canada"));
        System.out.println("------------REGION END---------");



    }
}
