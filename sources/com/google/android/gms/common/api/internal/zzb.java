package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzb extends Fragment implements LifecycleFragment {
    public static final WeakHashMap C = new WeakHashMap();

    /* renamed from: A  reason: collision with root package name */
    public int f24771A = 0;

    /* renamed from: B  reason: collision with root package name */
    public Bundle f24772B;

    /* renamed from: z  reason: collision with root package name */
    public final Map f24773z = Collections.synchronizedMap(new ArrayMap());

    public static zzb f(Activity activity) {
        zzb zzb;
        WeakHashMap weakHashMap = C;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzb = (zzb) weakReference.get()) != null) {
            return zzb;
        }
        try {
            zzb zzb2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb2 == null || zzb2.isRemoving()) {
                zzb2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzb2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzb2));
            return zzb2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f24773z.containsKey(str)) {
            this.f24773z.put(str, lifecycleCallback);
            if (this.f24771A > 0) {
                new zzi(Looper.getMainLooper()).post(new zza(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f24773z.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.f24773z.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Activity e() {
        return getActivity();
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback e2 : this.f24773z.values()) {
            e2.e(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24771A = 1;
        this.f24772B = bundle;
        for (Map.Entry entry : this.f24773z.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f24771A = 5;
        for (LifecycleCallback g2 : this.f24773z.values()) {
            g2.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f24771A = 3;
        for (LifecycleCallback h2 : this.f24773z.values()) {
            h2.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f24773z.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f24771A = 2;
        for (LifecycleCallback j2 : this.f24773z.values()) {
            j2.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f24771A = 4;
        for (LifecycleCallback k2 : this.f24773z.values()) {
            k2.k();
        }
    }
}
