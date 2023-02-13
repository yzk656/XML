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
public class Jsoup_demo3 {
    public static void main(String[] args) throws IOException {
        String path= Jsoup_demo3.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        /*1. 通过标签名获取*/
        Elements elements=document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("--------------------");

        /*2. 通过属性名获取*/
        Elements elements1=document.getElementsByAttribute("id");
        System.out.println(elements1);

        System.out.println("--------------------");

        /*3. 通过属性值获取*/
        Elements elements2=document.getElementsByAttributeValue("number","heima_0001");
        System.out.println(elements2);

        System.out.println("--------------------");

        /*4. 通过id的来获取*/
        Element element=document.getElementById("id_test");
        System.out.println(element);
    }
}
