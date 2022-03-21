package io;

import org.junit.Test;

import java.io.*;

public class InputStreamReader2 {
    @Test
    public void test() throws IOException {
        //1.找文件，造流
        File file1 = new File("Hello.txt");
        File file2 = new File("Hello1.txt");
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
        //2. 读写过程.
        char[] cbuf = new char[24];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf, 0 , len);
            System.out.print(str);
            osw.write(cbuf, 0 , len);
        }
        //3. close the stream
        isr.close();
        osw.close();
    }
}
