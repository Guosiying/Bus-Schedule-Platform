package com.bus.busposition.controller;

import com.bus.busposition.DTO.Position;
import com.bus.busposition.message.MqSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzy
 * @date 2018/7/17下午11:04
 */
@RestController
@Slf4j
public class PositionController {

    @PostMapping(value = "/sendposition")
    public void sendPosition(@RequestBody Position position){

        log.info("x:"+position.getX()+";y:"+position.getY()+";time:"+position.getTime());
        MqSender mqSender =new MqSender();
        mqSender.send(position);
    }
}
