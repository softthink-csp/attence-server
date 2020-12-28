package com.attence.employee.controller;

import com.attence.employee.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @ResponseBody
    @RequestMapping(value = "/getPostData", method = {RequestMethod.GET})
    public Map<Integer, String> getPostData() {
        return postService.getPostData();
    }
}
