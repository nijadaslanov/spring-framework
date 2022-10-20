package com.spring.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@NoArgsConstructor
@Data

public class Region extends BaseEntity {

    private String region;
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Region(String region, String united_states) {
        this.region = region;
    }


}
