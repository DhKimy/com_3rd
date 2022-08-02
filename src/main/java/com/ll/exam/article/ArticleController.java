package com.ll.exam.article;

import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/usr/article/list")
    public void showList() {

    }
}
