package com.idogs.okhttpdemo.okhttp;


import com.idogs.okhttpdemo.module.BaseRecommandModel;
import com.idogs.okhttpdemo.okhttp.listener.DisposeDataHandle;
import com.idogs.okhttpdemo.okhttp.listener.DisposeDataListener;
import com.idogs.okhttpdemo.okhttp.request.CommonRequest;
import com.idogs.okhttpdemo.okhttp.request.RequestParams;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class RequestCenter {

//    /**
//     * 版本跟新检查
//     * @param listener
//     */
//    public static void checkVersion(DisposeDataListener listener) {
//        RequestCenter.postRequest(HttpConstants.CHECK_UPDATE, null, listener, UpdateModel.class);
//    }

//    public static void login(String userName, String passwd, DisposeDataListener listener) {
//
//        RequestParams params = new RequestParams();
//        params.put("mb", userName);
//        params.put("pwd", passwd);
//        RequestCenter.postRequest(HttpConstants.LOGIN, params, listener, User.class);
//    }

    /***
     * request   get请求写法 post请求写法
     * @param url
     * @param params
     * @param listener
     * @param clazz
     */
    public static void  getRequest(String url, RequestParams params, DisposeDataListener listener, Class<?> clazz){

        CommonOkHttpClient.get(CommonRequest.createGetRequest(url,params),new DisposeDataHandle(listener,clazz));
    }

    public static void postRequest(String url, RequestParams params, DisposeDataListener listener, Class<?> clazz){
        CommonOkHttpClient.post(CommonRequest.createPostRequest(url,params),new DisposeDataHandle(listener,clazz));
    }

    //首页数据请求
    public static void requestRecommandData(DisposeDataListener listener) {
        RequestCenter.getRequest(HttpConstants.HOME_RECOMMAND, null, listener, BaseRecommandModel.class);
    }

}
