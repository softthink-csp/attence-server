package com.attence.employee.service;

import com.attence.employee.dao.exp.MenuExpMapper;
import com.attence.employee.domain.Menu;
import com.attence.employee.vo.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RouteService {

    @Autowired
    private MenuExpMapper menuExpMapper;

    public List<Route>  getRouteData(String userName) {
        Map<Integer, Menu> menuInfo = menuExpMapper.getMenuInfoByUser(userName);
        List<Route> routeData = new ArrayList<Route>();
        Map<Integer, Route> map = new HashMap<Integer, Route>();
        menuInfo.forEach((id, menu) -> {
            Integer parentId = menu.getParentid();
            Route route = Route.builder().path(menu.getPath()).showInNavi(menu.getShowinnavi())
                    .name(menu.getName()).component(menu.getComponent())
                    .children(new ArrayList<Route>()).build();
            map.put(id, route);
            if (parentId == null) {
                routeData.add(route);
            } else {
                map.get(parentId).getChildren().add(route);

            }
        });
        return routeData;
    }

}
