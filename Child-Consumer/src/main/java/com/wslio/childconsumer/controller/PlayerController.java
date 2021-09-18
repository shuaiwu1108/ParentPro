package com.wslio.childconsumer.controller;

import com.wslio.childconsumer.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@Slf4j
public class PlayerController {
    @Resource
    private ProviderService providerService;

    @RequestMapping("/consumer/musicplay")
    public String musicplay(@RequestParam String musicPath){
        log.info("musicplay 调用！");
        return providerService.musicPlay(musicPath);
    }

    @RequestMapping("/consumer/videoplay")
    public String videoplay(@RequestParam String videoPath){
        return providerService.videoPlay(videoPath);
    }
}
