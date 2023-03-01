package com.demo.sonarqube.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {

    public String getMessage() {
        String str = "java knowledge";
        Object obj = "abc";
        log.info(obj.toString());
        return str;
    }
}
