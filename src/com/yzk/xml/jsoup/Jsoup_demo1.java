package com.yzk.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Jsoup_demo1
 * @Description: Jsoup快速入门
 * @Author: 杨振坤
 * @date: 2023/2/12 22:49
 */
public class Jsoup_demo1 {
    public static void main(String[] args) throws IOException {
        /*获取Document对象，根据xml文档获取*/
        /*通过类加载器获取xml的地址*/
        String path = Jsoup_demo1.class.getClassLoader().getResource("student.xml").getPath();
        /*解析xml文档，加载文档进内存，获取dom树*/
        Document document = Jsoup.parse(new File(path), "UTF-8");
        /*获取元素对象*/
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());

        /*获取第一个name的element对象*/
        Element element=elements.get(0);
        /*获取数据*/
        String name=element.text();
        System.out.println(name);
    }
}
