package com.glqdlt.ex.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created By iw.jhun
 * On 2018-04-12 , 오후 2:57
 */
@Slf4j
@Service
public class CarHelper {

    public void changeCar(Car car, String name){
        car.setName(name);
    }
}
