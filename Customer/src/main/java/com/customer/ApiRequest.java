package com.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class ApiRequest implements Serializable {

//    Optional obj2 = Optional.empty();

    private String action;
    private String appnameid;
    private int threads;
    private int dbconnections;
    private int reportinglevel;
}