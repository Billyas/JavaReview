package io;
/**
 * @Author: Billyme
 * @Date: 2022/3/13 下午 3:52
 * @Describe: IO流
 */

import java.io.*;

/**
 * 一、分类
 * 1. 操作单位： 字节流、字符流
 * 2. 数据的流向： 输入流、输出流
 * 3。 流的角色： 节点流、处理流
 * 二、 流的体系
 *      抽象基类                节点流             缓存流
 *      InputStream     FileInputStream         BufferInputStream
 *      OutPutStream    FileOutputStream           BufferOutputStream
 *      Reader          FileReader              BufferReader
 *      Writer          FileWriter              BufferWriter
 * **/
public class FileReaderWriterTest {
    public static void main(String[] args)  {
        File file = new File("Hello.txt");
        System.out.println(file.getAbsolutePath());

        try {
            FileReader fr = new FileReader(file);
            int res = fr.read();  //文件末尾返回-1,否则返回字符的对应ascll
            while(res!=-1){
                System.out.println((char) res);
                res = fr.read();
            }
            System.out.println();

/*
            char[] a = null;
            int len ;
            while((len=fr.read(a))!=-1){
                for(int i=0; i<len; i++){
                    System.out.print(a[i]);
                }
            }
*/

            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write("hello to world");
            fw.append("this is tom speaking");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
