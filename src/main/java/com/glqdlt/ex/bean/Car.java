package com.glqdlt.ex.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created By iw.jhun
 * On 2018-04-11 , 오후 5:47
 */
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Car {


    @Autowired
    CarHelper carHelper;

    @NonNull
    private String name;

    public void changeCarName(String name){
        carHelper.changeCar(this,name);
    }


}
