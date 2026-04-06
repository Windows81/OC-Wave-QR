package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

final class zae implements View.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Intent f25215A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f25216z;

    public zae(Context context, Intent intent) {
        this.f25216z = context;
        this.f25215A = intent;
    }

    public final void onClick(View view) {
        try {
            this.f25216z.startActivity(this.f25215A);
        } catch (ActivityNotFoundException e2) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e2);
        }
    }
}
