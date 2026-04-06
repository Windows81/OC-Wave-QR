package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;

final class zzq extends zzo {

    /* renamed from: o  reason: collision with root package name */
    public final String f27495o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ zzr f27496p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(zzr zzr, TaskCompletionSource taskCompletionSource, String str) {
        super(zzr, new zzm("OnRequestInstallCallback"), taskCompletionSource);
        this.f27496p = zzr;
        this.f27495o = str;
    }

    public final void C1(Bundle bundle) {
        super.C1(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f27493m.d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f27493m.e(zzr.f(this.f27496p, bundle, this.f27495o));
        }
    }
}
