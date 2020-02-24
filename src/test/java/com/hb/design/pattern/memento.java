package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.memento.Article;
import com.hb.design.pattern.behavioral.memento.ArticleMemento;
import com.hb.design.pattern.behavioral.memento.ArticleMementoManager;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 备忘录模式测试
 * @CreateDate: 10:08 2020/2/20
 */

public class memento {
    @Test
    public void mementoTest(){
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("设计模式","学习设计模式需要注意的十件事",
                "DesignPattern.jpg");
        System.out.println("最新的手记标题为：" + article.getTitle() + ",内容为：" +
                article.getContent() + ",图片为: " + article.getImgs());

        // 保存为手记快照
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("===== 手记暂存成功! =====");

        // 修改内容
        System.out.println("===== 修改手记内容 =====");
        article.setTitle("设计模式注意事项");
        article.setContent("学习设计模式需要注意的五件事");
        System.out.println("修改后手记标题为：" + article.getTitle() + ",内容为：" +
                article.getContent() + ",图片为: " + article.getImgs());
        System.out.println("===== 修改手记完成 =====");

        // 进行恢复
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("===== 恢复手记成功 =====");
        System.out.println("恢复后手记标题为：" + article.getTitle() + ",内容为：" +
                article.getContent() + ",图片为: " + article.getImgs());
    }
}
