package com.example.gyh.testtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] contents = {"什么都可以","我愿意为你守护到天明","让每个角落都有我的心","这就是我想坚强的凌夷","有那么多的生命和爱情","在我的世界我只拥有你","我只想给你独特的惊喜"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final UpDownTextView textView = (UpDownTextView) findViewById(R.id.textView1);
        final ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < contents.length; i++) {
            titleList.add(contents[i]);
        }
        textView.setTextList(titleList);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                textView.startAutoScroll();
            }
        });
    }
}
