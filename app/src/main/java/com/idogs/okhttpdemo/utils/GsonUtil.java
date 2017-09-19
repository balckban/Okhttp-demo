package com.idogs.okhttpdemo.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by balckban on 2017/7/31 0031.
 */

public class GsonUtil {
    /**
     * 封装的GSON解析工具类，提供泛型参数
     */

    //将Json数据解析成相应的映射对象
    public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }
    // 将Json数组解析成相应的映射对象列表
     public static <T> List<T> parseJsonArrayWithGson(String jsonData,
                                                      Class<T> type) {
              Gson gson = new Gson();
                List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {
         }.getType());
                return result;
            }

}
