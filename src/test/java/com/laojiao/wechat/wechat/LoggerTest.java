package com.laojiao.wechat.wechat;

import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by SuperJohn on 2017/9/3.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
//@Data
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String username = "laojiao";
        String password = "laojiao";
        logger.info("username is "+username+"password :"+password);
        logger.info("username {},password {}",username,password);
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
}
