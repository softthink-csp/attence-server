package com.attence.check.po;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;


@Data
@Builder
public class Check {

    private int status;
    private String checkTime;

}
