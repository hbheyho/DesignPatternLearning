package com.hb.design.princple;
import com.hb.design.principle.openclose.ICourse;
import com.hb.design.principle.openclose.JavaCourse;
import com.hb.design.principle.openclose.JavaDiscountCourse;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  14:54  2020/1/6.
 */
public class openClose {
    @Test
    public void printCourse(){
        ICourse iCourse = new JavaCourse(23,"设计模式",39.3);
        System.out.println("课程ID: " + iCourse.getId() + " " + "课程名: " + iCourse.getName() + " " + "课程价格: " + iCourse.getPrice()) ;
    }

    @Test
    public void printDiscountCourse(){
        ICourse iCourse = new JavaDiscountCourse(23,"设计模式", 40d);
        // 父类声明指向子类实例化产生的对象事，只能使用子类从父类继承的方法和属性，需要进行强转
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        /*System.out.println("课程ID: " + javaCourse.getId() + " " + "课程名: " + javaCourse.getName() + " "
                + "课程价格: " + javaCourse.getOriginPrice() + " " +"课程打折价格: " + javaCourse.getPrice()) ;*/
        // 使用里氏替换原则之后的写法
         System.out.println("课程ID: " + javaCourse.getId() + " " + "课程名: " + javaCourse.getName() + " "
                + "课程价格: " + javaCourse.getPrice() + " " +"课程打折价格: " + javaCourse.getDiscountPrice()) ;
    }


}
