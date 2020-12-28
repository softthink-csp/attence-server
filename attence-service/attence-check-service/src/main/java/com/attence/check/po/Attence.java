package com.attence.check.po;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection="attence")
public class Attence {

    private String id;
    private String date;
    private String name;
    private int status;
    private List<Check> checkList;

}
