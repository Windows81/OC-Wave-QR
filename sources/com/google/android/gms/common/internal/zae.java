package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

final class zae extends zag {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Fragment f24932A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f24933B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Intent f24934z;

    public final void a() {
        Intent intent = this.f24934z;
        if (intent != null) {
            this.f24932A.startActivityForResult(intent, this.f24933B);
        }
    }
}
