package com.panther.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * 读取文件Iterator
 * Created by panther.dongdong on 2016/2/29.
 */
public class MessageIterator implements Iterator {
    private String currentLine;
    private BufferedReader reader;

    public MessageIterator(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public boolean hasNext() {
        if (reader == null) {
            return false;
        }
        try {
            currentLine = reader.readLine();
            return currentLine != null;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String next() {
        return currentLine;
    }

    @Override
    public void remove() {

    }
}
