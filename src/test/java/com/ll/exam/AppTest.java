package com.ll.exam;

import com.ll.exam.article.ArticleController;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void junit_assertThat() {
        int rs = 10 + 20;

        assertThat(rs).isEqualTo(30);
    }

    @Test
    public void ioc_articleController() {
        ArticleController articleController = Container.getArticleController();

        assertThat(new ArrayList<>()).isNotNull();
    }

    @Test
    public void ioc__articleController__singleTon(){
        ArticleController articleController1 = Container.getArticleController();
        ArticleController articleController2 = Container.getArticleController();

        assertThat(articleController2).isEqualTo(articleController1);
    }
}