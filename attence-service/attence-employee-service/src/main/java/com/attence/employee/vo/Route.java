package com.attence.employee.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Route {
    private String path;
    private String name;
    private String component;
    private Boolean showInNavi;
    private List<Route> children;
}
