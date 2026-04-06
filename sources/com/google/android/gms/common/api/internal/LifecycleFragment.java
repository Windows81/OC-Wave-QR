package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

public interface LifecycleFragment {
    void b(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback d(String str, Class cls);

    Activity e();

    void startActivityForResult(Intent intent, int i2);
}
