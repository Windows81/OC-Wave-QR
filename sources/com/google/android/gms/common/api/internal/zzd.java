package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements LifecycleFragment {
    public static final WeakHashMap E0 = new WeakHashMap();
    public final Map B0 = Collections.synchronizedMap(new ArrayMap());
    public int C0 = 0;
    public Bundle D0;

    public static zzd Z1(FragmentActivity fragmentActivity) {
        zzd zzd;
        WeakHashMap weakHashMap = E0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) fragmentActivity.f0().l0("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.o0()) {
                zzd2 = new zzd();
                fragmentActivity.f0().p().e(zzd2, "SupportLifecycleFragmentImpl").i();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final void E0() {
        super.E0();
        this.C0 = 5;
        for (LifecycleCallback g2 : this.B0.values()) {
            g2.g();
        }
    }

    public final void U0() {
        super.U0();
        this.C0 = 3;
        for (LifecycleCallback h2 : this.B0.values()) {
            h2.h();
        }
    }

    public final void V0(Bundle bundle) {
        super.V0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.B0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void W0() {
        super.W0();
        this.C0 = 2;
        for (LifecycleCallback j2 : this.B0.values()) {
            j2.j();
        }
    }

    public final void X0() {
        super.X0();
        this.C0 = 4;
        for (LifecycleCallback k2 : this.B0.values()) {
            k2.k();
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.B0.containsKey(str)) {
            this.B0.put(str, lifecycleCallback);
            if (this.C0 > 0) {
                new zzi(Looper.getMainLooper()).post(new zzc(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.B0.get(str));
    }

    public final /* synthetic */ Activity e() {
        return l();
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.B0.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void u0(int i2, int i3, Intent intent) {
        super.u0(i2, i3, intent);
        for (LifecycleCallback e2 : this.B0.values()) {
            e2.e(i2, i3, intent);
        }
    }

    public final void z0(Bundle bundle) {
        super.z0(bundle);
        this.C0 = 1;
        this.D0 = bundle;
        for (Map.Entry entry : this.B0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }
}
