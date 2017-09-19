package com.idogs.okhttpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.idogs.okhttpdemo.module.BaseRecommandModel;
import com.idogs.okhttpdemo.okhttp.RequestCenter;
import com.idogs.okhttpdemo.okhttp.listener.DisposeDataListener;

public class MainActivity extends AppCompatActivity {
    private BaseRecommandModel mRecommandData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestRecommandData();
    }

    /**
     * 请求写法
     */
    //发送首页列表数据请求
    private void requestRecommandData() {
        RequestCenter.requestRecommandData(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                mRecommandData=(BaseRecommandModel)responseObj;
                Toast.makeText(MainActivity.this,mRecommandData.ecode,Toast.LENGTH_SHORT).show();
//                showSuccessView();
            }

            @Override
            public void onFailure(Object reasonObj) {
                Log.e("123","onfailue:"+reasonObj.toString());
            }
        });
    }

    /**
     * 成功执行
     */
    private  void  showSuccessView(){
        if (mRecommandData.data.list!=null&&mRecommandData.data.list.size()>0){

        }else{
            showErrorView();
        }
    }
    private void showErrorView() {

    }
}
