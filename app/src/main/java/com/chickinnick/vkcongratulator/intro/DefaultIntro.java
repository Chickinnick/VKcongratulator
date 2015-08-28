package com.chickinnick.vkcongratulator.intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chickinnick.vkcongratulator.MainActivity;
import com.chickinnick.vkcongratulator.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.vk.sdk.VKSdk;

public class DefaultIntro extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro));
        addSlide(SampleSlide.newInstance(R.layout.intro2));
    }

    private void loadLoginActivity(){
        VKSdk.login(this, MainActivity.sMyScope);

    }

    @Override
    public void onSkipPressed() {
        loadLoginActivity();
        Toast.makeText(getApplicationContext(),"skip",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        loadLoginActivity();
    }

    public void getStarted(View v){
        loadLoginActivity();
    }
}
