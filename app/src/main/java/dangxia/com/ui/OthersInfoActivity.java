package dangxia.com.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import dangxia.com.R;

public class OthersInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_info);
        findViewById(R.id.back_btn).setOnClickListener(view -> finish());
    }
}
