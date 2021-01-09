package org.bean.main;

import com.sun.istack.internal.NotNull;
import okhttp3.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class OkHttpMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient = ctx.getBean("okHttpClient", OkHttpClient.class);
        Request request = new Request.Builder()
                .get()
                .url("https://bkimg.cdn.bcebos.com/pic/4b90f603738da9773912d961341bef198618367a456c?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_jpg")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e){
                System.out.println(e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException{
                FileOutputStream out = new FileOutputStream(new File("E:\\123.jpg"));
                int len;
                byte[] buf = new byte[1024];
                InputStream is = response.body().byteStream();
                while ((len = is.read(buf)) != -1) {
                    out.write(buf, 0, len);
                }
                out.close();
                is.close();
            }

        });

    }
}
