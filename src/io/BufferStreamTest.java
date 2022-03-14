package io;

import java.io.*;
/**
 * @Author: Billyme
 * @Date: 2022/3/13 下午 4:50
 * @Describe: 缓存流，提高读写速度
 */

public class BufferStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        File file1 = new File("Hello1.txt");
        //1. 节点流
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        //2. 缓存流
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.读写
        byte[] buffer = new byte[10];
        int len;
        while((len = bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        //4.资源关闭
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
