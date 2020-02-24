package com.hb.design.pattern.behavioral.templatemethod;

/**
 * @Author: HB
 * @Description: 课程抽象类 - 制作课程模板类
 * @CreateDate: 14:54 2020/2/15
 */

public abstract class  ACourse  {
     // 申明为final是为了防止子类对其进行修改
     // protected - 本类 - 可
     //           - 本包的类 - 可
     //           - 子类 - 可
     //           - 非子类的外包类 - 否
     // protected final void makeCourse() - makeCourse为具体流程实现方法
     public final void makeCourse(){
         this.makePPT();
         this.makeVideo();
         if (needWriteArticle()){
             this.writeArticle();
         }
         this.packageCourse();
     }

     // makePPT为固定不变的行为，不需要子类重写
     // default   - 本类 - 可
     //           - 本包的类 - 可
     //           - 子类 - 否
     //           - 非子类的外包类 - 否
     final void makePPT(){
         System.out.println("制作PPT");
     }

     final void makeVideo(){
         System.out.println("制作Video");
     }

     final void writeArticle(){
         System.out.println("编写手记");
     }

     // 钩子方法 protected
    protected boolean needWriteArticle(){
         return false;
    }

    // 不同课程有着不同的要求，完全由子类实现
    abstract void packageCourse();
}
