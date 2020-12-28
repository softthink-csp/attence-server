package com.attence.check.service;

import com.attence.check.po.Attence;
import com.attence.check.po.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Service
public class CheckService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCheckInfo(Map<String, String> checkInfo) {
        Query query = new Query(Criteria.where("id").is(checkInfo.get("employeeId"))
                .and("date").is(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
        Attence attenceInfo = mongoTemplate.findOne(query, Attence.class);
        if (attenceInfo == null) {
            mongoTemplate.insert(createAttence(checkInfo));
        } else {
            Update update = new Update();
            update.addToSet("checkList", createCheck(checkInfo));
            update.set("status", Integer.valueOf(checkInfo.get("status")));
            mongoTemplate.updateFirst(query, update, Attence.class);
        }
    }

    public int getCurrentStatus(String employeeId) {
        Query query = new Query(Criteria.where("id").is(employeeId)
                .and("date").is(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
        query.fields().include("status");
        Attence attenceInfo = mongoTemplate.findOne(query, Attence.class);
        if (attenceInfo == null) {
            return 0;
        } else {
            return attenceInfo.getStatus();
        }
    }

    private Check createCheck(Map<String, String> checkInfo) {
        Check check = Check.builder()
                .status(Integer.valueOf(checkInfo.get("status")))
                .checkTime(new SimpleDateFormat("hh:mm:ss").format(new Date()))
                .build();
        return check;
    }

    private Attence createAttence(Map<String, String> checkInfo) {
        Attence attence = Attence.builder()
                .id(checkInfo.get("employeeId"))
                .name(checkInfo.get("name"))
                .date(new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
                .status(Integer.valueOf(checkInfo.get("status")))
                .checkList(new ArrayList<>())
                .build();
        attence.getCheckList().add(createCheck(checkInfo));
        return attence;
    }

}
