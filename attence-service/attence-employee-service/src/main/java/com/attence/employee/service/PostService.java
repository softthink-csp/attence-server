package com.attence.employee.service;

import com.attence.employee.dao.PostMapper;
import com.attence.employee.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@CacheConfig(cacheNames = "post")
public class PostService {

    @Autowired
    private PostMapper postMapper;

    @Cacheable
    public Map<Integer, String> getPostData() {
        Map<Integer, String> postData = new HashMap<Integer, String>();
        List<Post> posts = postMapper.selectByExample(null);
        posts.forEach(post -> {
            postData.put(post.getId(), post.getName());
        });
        return postData;
    }
}
