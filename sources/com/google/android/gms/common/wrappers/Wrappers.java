package com.google.android.gms.common.wrappers;

import android.content.Context;

public class Wrappers {

    /* renamed from: b  reason: collision with root package name */
    public static final Wrappers f25148b = new Wrappers();

    /* renamed from: a  reason: collision with root package name */
    public PackageManagerWrapper f25149a = null;

    public static PackageManagerWrapper a(Context context) {
        return f25148b.b(context);
    }

    public final synchronized PackageManagerWrapper b(Context context) {
        try {
            if (this.f25149a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f25149a = new PackageManagerWrapper(context);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f25149a;
    }
}
