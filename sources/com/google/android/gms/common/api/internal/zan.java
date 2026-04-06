package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class zan extends zabw {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f24755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zao f24756b;

    public zan(zao zao, Dialog dialog) {
        this.f24756b = zao;
        this.f24755a = dialog;
    }

    public final void a() {
        this.f24756b.f24757A.o();
        if (this.f24755a.isShowing()) {
            this.f24755a.dismiss();
        }
    }
}
