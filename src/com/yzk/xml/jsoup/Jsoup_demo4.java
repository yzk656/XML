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
public class Jsoup_demo4 {
    public static void main(String[] args) throws IOException {
        String path= Jsoup_demo4.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        /*1. 通过Document对象获取name标签，获取所有的name标签，可以获取两个*/
        Elements elements=document.getElementsByTag("name");
        System.out.println(elements.size());

        System.out.println("--------------------");

        /*2.通过Element对象获取子标签对象*/
        Element element_student=document.getElementsByTag("student").get(0);
        Elements ele_name=element_student.getElementsByTag("name");
        System.out.println(ele_name.size());

        System.out.println("--------------------");

        /*3. 获取student对象的属性值*/
        String number=element_student.attr("number");
        System.out.println(number);

        System.out.println("--------------------");

        /*4.获取文本内容*/
        String text=ele_name.text();
        String html=ele_name.html();
        /*获取的是纯文本内容*/
        System.out.println(text);
        /*获取的是可以包含html标签的内容*/
        System.out.println(html);
    }
}
