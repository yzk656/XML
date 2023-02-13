package com.yzk.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Jsoup_demo2
 * @Description: TODO
 * @Author: 杨振坤
 * @date: 2023/2/13 0:23
 */
public class Jsoup_demo2 {
    public static void main(String[] args) throws IOException {
        String path=Jsoup_demo2.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        System.out.println(document);
    }
}
