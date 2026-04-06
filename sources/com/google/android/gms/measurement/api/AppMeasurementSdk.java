package com.google.android.gms.measurement.api;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzjj;
import java.util.List;
import java.util.Map;

public class AppMeasurementSdk {

    /* renamed from: a  reason: collision with root package name */
    public final zzdv f26154a;

    public static final class ConditionalUserProperty {
    }

    public interface EventInterceptor extends zzjg {
    }

    public interface OnEventListener extends zzjj {
    }

    public AppMeasurementSdk(zzdv zzdv) {
        this.f26154a = zzdv;
    }

    public void a(String str, String str2, Bundle bundle) {
        this.f26154a.s(str, str2, bundle);
    }

    public List b(String str, String str2) {
        return this.f26154a.g(str, str2);
    }

    public int c(String str) {
        return this.f26154a.a(str);
    }

    public Map d(String str, String str2, boolean z2) {
        return this.f26154a.h(str, str2, z2);
    }

    public void e(String str, String str2, Bundle bundle) {
        this.f26154a.z(str, str2, bundle);
    }

    public void f(OnEventListener onEventListener) {
        this.f26154a.q(onEventListener);
    }

    public void g(Bundle bundle) {
        this.f26154a.l(bundle);
    }

    public final void h(boolean z2) {
        this.f26154a.u(z2);
    }
}
