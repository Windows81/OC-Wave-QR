package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;

final class zac implements DialogInterface.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f25152A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ActivityResultLauncher f25153B;
    public final /* synthetic */ GoogleApiAvailability C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Activity f25154z;

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        PendingIntent e2 = this.C.e(this.f25154z, this.f25152A, 0);
        if (e2 != null) {
            this.f25153B.a(new IntentSenderRequest.Builder(e2.getIntentSender()).a());
        }
    }
}
