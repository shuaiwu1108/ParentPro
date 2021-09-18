package com.wslio.childconsumer.service.impl;

import com.wslio.childconsumer.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MusicServiceFallBack implements ProviderService {
    @Override
    public String musicPlay(String musicPath) {
        log.error("musicPlay 调用失败！ 服务降级！");
        return "musicPlay error!";
    }

    public String videoPlay(String videoPath) {
        log.error("videoPlay 调用失败！ 服务降级！");
        return "videoPlay error!";
    }
}
