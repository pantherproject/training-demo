package com.panther.demo.util;

import java.io.*;

/**
 * 按行读取文件
 * Created by panther.dongdong on 2016/2/29.
 */
public class MessageLoader implements Closeable {
    private String filename;
    private BufferedReader reader;

    public MessageLoader(String filename) {
        this.filename = filename;
    }

    /**
     * 导入文件内容
     *
     * @return 信息的行读取器
     */
    public MessageIterator loadMessage() {
        try {
            File file = new File(filename);
            reader = new BufferedReader(new FileReader(file));
            return new MessageIterator(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new MessageIterator(null);
    }
    /**
     * 关闭文件流
     */
    @Override
    public void close() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
