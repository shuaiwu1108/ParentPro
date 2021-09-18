package com.wslio.childprovider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MusicController {

    @RequestMapping("/provider/musicplay")
    public String musicPlay(@RequestParam String musicPath){
        log.info("播放音乐文件[{}]", musicPath);
        return musicPath;
    }
}
