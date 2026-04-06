package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: z  reason: collision with root package name */
    public final LifecycleFragment f24501z;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f24501z = lifecycleFragment;
    }

    public static LifecycleFragment c(Activity activity) {
        return d(new LifecycleActivity(activity));
    }

    public static LifecycleFragment d(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.d()) {
            return zzd.Z1(lifecycleActivity.b());
        }
        if (lifecycleActivity.c()) {
            return zzb.f(lifecycleActivity.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity e2 = this.f24501z.e();
        Preconditions.m(e2);
        return e2;
    }

    public void e(int i2, int i3, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
