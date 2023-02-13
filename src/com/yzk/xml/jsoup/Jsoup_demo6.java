package com.yzk.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: Jsoup_demo2
 * @Description: TODO
 * @Author: 杨振坤
 * @date: 2023/2/13 0:23
 */
public class Jsoup_demo6 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path= Jsoup_demo6.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        /*1. 根据document对象，创建JXDocument对象*/
        JXDocument jxDocument=new JXDocument(document);

        /*2. 结合XPath语法查询*/
        /*查询所有的student标签：// */
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for(JXNode jxNode:jxNodes){
            System.out.println(jxNode);
        }

        System.out.println("--------------------");

        /*查询所有student标签下的name标签*/
        List<JXNode> jxNodes1=jxDocument.selN("//student/name");
        for (JXNode jxNode:jxNodes1){
            System.out.println(jxNode);
        }

        System.out.println("--------------------");

        /*查询student标签下带有id属性的name标签*/
        List<JXNode> jxNodes2=jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode:jxNodes2){
            System.out.println(jxNode);
        }

        System.out.println("--------------------");

        /*查询student标签下带有id属性的name标签,并且id属性值为id_test*/
        List<JXNode> jxNodes3=jxDocument.selN("//student/name[@id='id_test']");
        for (JXNode jxNode:jxNodes3){
            System.out.println(jxNode);
        }

    }
}
