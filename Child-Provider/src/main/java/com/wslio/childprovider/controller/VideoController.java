package com.wslio.childprovider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class VideoController {

    @RequestMapping("/provider/videoplay")
    public String videoPlay(@RequestParam String videoPath){
        log.info("播放视频文件[{}]", videoPath);
        return videoPath;
    }
}
