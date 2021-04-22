package com.atguigu;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        String a = "C:\\Users\\dong\\Desktop\\aa.txt";
        String s = "a";
        getStr(a,s);

    }

    public static void getStr(String a, String s) throws IOException {
        File file = new File(a);
        if(file.isFile()){
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = "";
            StringBuffer text = new StringBuffer();
            while ((str=bufferedReader.readLine())!= null){
                text.append(str);
                text.append("**");
            }
            int num = 0;
            String text2 = text.toString();
            while (text2.indexOf(s)!=-1){
               text2 = text2.substring(text2.indexOf(s)+s.length(),text2.length());
               num ++;
            }
            System.out.println(num);
            inputStreamReader.close();
            inputStream.close();
        }
    }
}
