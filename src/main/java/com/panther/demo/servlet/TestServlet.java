package com.panther.demo.servlet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * test servlet
 * Created by panther.dongdong on 2016/3/28.
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter printWriter = resp.getWriter();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cname", "CN");
        jsonObject.put("gwconfig", "cmcc-hs");
        jsonObject.put("sented", "1000");
        jsonObject.put("numtype", "1");
        jsonObject.put("channel", "hs");


        JSONObject jsonObjecta = new JSONObject();
        jsonObjecta.put("cname", "CN");
        jsonObjecta.put("gwconfig", "cmcc-hs");
        jsonObjecta.put("sented", "1000");
        jsonObjecta.put("numtype", "2");
        jsonObjecta.put("channel", "hs");

        JSONArray jsonArray1 = new JSONArray();
        jsonArray1.add(jsonObject);
        jsonArray1.add(jsonObjecta);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("gwconfig", "cmcc-hs");
        jsonObject1.put("data", jsonArray1);


        JSONArray jsonArray2 = new JSONArray();
        jsonArray2.add(jsonObject1);


        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("numtype", 1);
        jsonObject2.put("data", jsonArray2);


        JSONArray jsonArray3 = new JSONArray();
        jsonArray3.add(jsonObject2);

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("channel", "hs");
        jsonObject3.put("data", jsonArray3);

        printWriter.print(jsonObject3.toJSONString());
        printWriter.close();

    }
}
