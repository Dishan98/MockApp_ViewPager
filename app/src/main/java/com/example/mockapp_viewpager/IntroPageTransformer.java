package com.example.mockapp_viewpager;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

public class IntroPageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        int pagePosition = (int)page.getTag();
        int pageWidth = page.getWidth();
        float pageWidthTimePosition = pageWidth*position;
        float absPosition = Math.abs(position);

        if(position<=-1.0f || position>=1.0f){}
        else if(position == 0.0f){} else{
            View title = page.findViewById(R.id.title);
            if(title!=null){
                title.setAlpha(1.0f - absPosition);
            }
            View description = page.findViewById(R.id.description);
            if(description!=null){
                description.setTranslationY(-pageWidthTimePosition/2f);
                description.setAlpha(1.0f - absPosition);

            }
            View computer = page.findViewById(R.id.computer);
            if(computer!=null){
                if(pagePosition == 0 && computer!= null) {
                    computer.setTranslationY(-pageWidthTimePosition / 1.5f);
                    description.setAlpha(1.0f - absPosition);
                }
            }
        }
    }
}
