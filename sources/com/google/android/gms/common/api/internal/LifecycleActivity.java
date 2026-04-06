package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;

public class LifecycleActivity {

    /* renamed from: a  reason: collision with root package name */
    public final Object f24500a;

    public LifecycleActivity(Activity activity) {
        Preconditions.n(activity, "Activity must not be null");
        this.f24500a = activity;
    }

    public final Activity a() {
        return (Activity) this.f24500a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f24500a;
    }

    public final boolean c() {
        return this.f24500a instanceof Activity;
    }

    public final boolean d() {
        return this.f24500a instanceof FragmentActivity;
    }
}
