package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zab();

    /* renamed from: z  reason: collision with root package name */
    public final PendingIntent f25017z;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f25017z = pendingIntent;
    }

    public PendingIntent H() {
        return this.f25017z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, H(), i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
