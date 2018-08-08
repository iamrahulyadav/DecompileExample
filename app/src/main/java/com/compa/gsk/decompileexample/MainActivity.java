package com.compa.gsk.decompileexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.co.station3.dabang.DabangRESTCallback;
import kr.co.station3.dabang.DabangRESTListener;
import kr.co.station3.dabang.DabangRequest;
import kr.co.station3.dabang.data.response.error.ResError;
import kr.co.station3.dabang.requestdata.version.ReqGetInitInfo;
import kr.co.station3.dabang.responsedata.version.ResGetInitInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (new DabangRequest(new ReqGetInitInfo())).requestQueue(new DabangRESTCallback(new DabangRESTListener<ResGetInitInfo>(){

            @Override
            public void onError(int i, ResError resError) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }

            @Override
            public void onSuccess(ResGetInitInfo resGetInitInfo) {

            }
        }));

    }

}
