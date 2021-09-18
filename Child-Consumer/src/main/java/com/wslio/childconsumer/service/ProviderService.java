package com.wslio.childconsumer.service;

import com.wslio.childconsumer.service.impl.MusicServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "child-provider", fallback = MusicServiceFallBack.class)
public interface ProviderService {

    @RequestMapping("/provider/musicplay")
    String musicPlay(@RequestParam String musicPath);

    @RequestMapping("/provider/videoplay")
    String videoPlay(@RequestParam String videoPath);
}
