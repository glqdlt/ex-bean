package com.glqdlt.ex.bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created By iw.jhun
 * On 2018-04-11 , 오후 5:48
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class CarFactoryTest {

    @Qualifier("sonataMake")
    @Autowired
    Car sonata;

    @Autowired
    Car avantte;

    @Before
    public void init(){
        echoCarName();
    }
    @After
    public void end(){
        echoCarName();
    }

    private void echoCarName() {
        log.info("ref :{}, name:{}",sonata,sonata.toString());
        log.info("ref :{}, name:{}",avantte,avantte.toString());
    }

    @Test
    public void changeCarName(){
        sonata.changeCarName("sonata 2");
    }

}