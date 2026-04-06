package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdv;

public class GoogleAnalyticsServerPreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdv.e(this).k(getIntent());
        finish();
    }
}
