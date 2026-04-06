package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;

final class zzp extends zzo {
    public zzp(zzr zzr, TaskCompletionSource taskCompletionSource) {
        super(zzr, new zzm("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    public final void b2(Bundle bundle) {
        super.b2(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f27493m.d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f27493m.e((Object) null);
        }
    }
}
