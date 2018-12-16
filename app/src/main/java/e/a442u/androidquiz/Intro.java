package e.a442u.androidquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("",
                "Dapatkan Kemudahan dalam Belanja",
                R.drawable.intro1,
                Color.parseColor("#FF1F8ABF")));

        addSlide(AppIntroFragment.newInstance("",
                "menyediakan Berbagai Koleksi Pakaian,Sepatu,dan Tas",
                R.drawable.intro2,
                Color.parseColor("#FF1F8ABF")));

        addSlide(AppIntroFragment.newInstance("",
                "Dapatkan Promo Terbaru Hanya di KOFARU",
                R.drawable.intro3,
                Color.parseColor("#FF1F8ABF")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196f3"));
    }

    @Override
    public void onDonePressed() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        startActivity(new Intent(this,MainActivity.class));
        finish();

    }

    @Override
    public void onSlideChanged() {

    }
}
