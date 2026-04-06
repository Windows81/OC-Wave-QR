package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.appupdate.internal.zzl;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallState;

public final class zzc extends zzl {
    public zzc(Context context) {
        super(new zzm("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f27425a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f27425a.a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f27425a.a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        InstallState g2 = InstallState.g(intent, this.f27425a);
        this.f27425a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", g2);
        c(g2);
    }
}
