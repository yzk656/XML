package com.yzk.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Jsoup_demo2
 * @Description: TODO
 * @Author: 杨振坤
 * @date: 2023/2/13 0:23
 */
public class Jsoup_demo5 {
    public static void main(String[] args) throws IOException {
        String path= Jsoup_demo5.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        /*1. 通过标签选择器查询*/
        Elements elements=document.select("name");
        System.out.println(elements);

        System.out.println("--------------------");

        /*2. 通过id选择器查询*/
        Elements elements1=document.select("#id_test");
        System.out.println(elements1);

        System.out.println("--------------------");

        /*3. 获取student标签并且属性名为heima_0001*/
        /*注意：这里的双引号要加上转义符号，使用单引号不行*/
        Elements elements2=document.select("student[number=\"heima_0001\"]");
        System.out.println(elements2);

        System.out.println("--------------------");

        /*3. 获取student标签并且属性名为heima_0001下的age子标签*/
        /*注意：这里的双引号要加上转义符号，使用单引号不行*/
        Elements elements3=document.select("student[number=\"heima_0001\"]>age");
        System.out.println(elements3);
    }
}
