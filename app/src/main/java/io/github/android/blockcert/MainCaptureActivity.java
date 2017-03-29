package io.github.android.blockcert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by Yifan on 2017/3/27.
 */
public class MainCaptureActivity extends io.github.xudaojie.qrcodelib.CaptureActivity {
    protected Activity mActivity = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        mActivity = this;
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void handleResult(String resultString) {
        if (TextUtils.isEmpty(resultString)) {
            Toast.makeText(mActivity, io.github.android.qrcodelib.R.string.scan_failed, Toast.LENGTH_SHORT).show();
            restartPreview();
        } else {
            Intent i = new Intent(this, MainShowActivity.class);
            // 把值传到其他的一步一步的界面里
            i.putExtra("ResultString",resultString);
            startActivity(i);
        }
    }


}
