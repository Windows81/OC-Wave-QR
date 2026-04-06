package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

class zzgs extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final zznv f26348a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26349b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26350c;

    public zzgs(zznv zznv) {
        Preconditions.m(zznv);
        this.f26348a = zznv;
    }

    public final void b() {
        this.f26348a.A0();
        this.f26348a.f().n();
        if (!this.f26349b) {
            this.f26348a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f26350c = this.f26348a.p0().B();
            this.f26348a.m().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f26350c));
            this.f26349b = true;
        }
    }

    public final void c() {
        this.f26348a.A0();
        this.f26348a.f().n();
        this.f26348a.f().n();
        if (this.f26349b) {
            this.f26348a.m().K().a("Unregistering connectivity change receiver");
            this.f26349b = false;
            this.f26350c = false;
            try {
                this.f26348a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f26348a.m().G().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f26348a.A0();
        String action = intent.getAction();
        this.f26348a.m().K().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean B2 = this.f26348a.p0().B();
            if (this.f26350c != B2) {
                this.f26350c = B2;
                this.f26348a.f().D(new zzgv(this, B2));
                return;
            }
            return;
        }
        this.f26348a.m().L().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
