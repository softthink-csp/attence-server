package com.attence.check.controller;

import com.attence.check.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CheckController {

    @Autowired
    CheckService checkService;

    @RequestMapping("/attence/check/updateStatus")
    public void updateStatus(@RequestBody Map<String, String> checkInfo) {
        checkService.insertCheckInfo(checkInfo);
    }

    @RequestMapping("/attence/check/getCurrentStatus")
    public int getCurrentStatus(String employeeId) {
        return checkService.getCurrentStatus(employeeId);
    }
}
