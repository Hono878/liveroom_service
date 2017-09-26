package com.miner.pinecone.controller;

import com.miner.pinecone.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hushangjie on 2017/9/26.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/index")
    public R hello(){
        return R.ok().put("hello","jack");
    }
}
