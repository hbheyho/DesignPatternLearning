package com.hb.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HB
 * @Description: 课程目录类
 * @CreateDate: 16:05 2020/2/11
 */

public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;  // 目录名
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent: items){
            if (this.level != null){
                for (int i = 0; i < this.level; i++){
                    System.out.print(" ");
                }
            }
            catalogComponent.print();
        }
    }
}
