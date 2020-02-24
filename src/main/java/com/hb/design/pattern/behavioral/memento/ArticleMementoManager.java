package com.hb.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @Author: HB
 * @Description: 手记快照管理者
 * @CreateDate: 9:48 2020/2/20
 */

public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
