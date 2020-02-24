package com.hb.design.princple;

import com.hb.design.principle.dependenceinversion.FECourse;
import com.hb.design.principle.dependenceinversion.HB;
import com.hb.design.principle.dependenceinversion.JavaCouse;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  16:03  2020/1/6.
 */
public class denpendenceInversion {
    @Test
    public void printeHbStatusV1(){
    /*  V1
        HB hb = new HB();
        hb.studyFECourse();
        hb.studyJavaCourse();*/
    }

    @Test
    public void printHbStatusV2(){
       /* V2
        HB hb = new HB();
        hb.studyMoocCourse(new JavaCouse());
        hb.studyMoocCourse(new FECourse());*/
    }

    @Test
    public void printHbStatusV3(){
        /* V3
        HB hb = new HB(new JavaCouse());
        hb.studyMoocCourse();*/
    }

    @Test
    public void printHbStatusV4(){
        // V4
        HB hb = new HB();
        hb.setIcourse(new JavaCouse());
        hb.studyMoocCourse();

        hb.setIcourse(new FECourse());
        hb.studyMoocCourse();
    }
}
