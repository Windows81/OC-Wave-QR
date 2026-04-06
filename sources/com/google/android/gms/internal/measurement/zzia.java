package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class zzia {

    /* renamed from: a  reason: collision with root package name */
    public static UserManager f25501a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f25502b = (!a());

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(android.content.Context r3) {
        /*
            boolean r0 = f25502b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.zzia> r0 = com.google.android.gms.internal.measurement.zzia.class
            monitor-enter(r0)
            boolean r2 = f25502b     // Catch:{ all -> 0x000f }
            if (r2 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x000f:
            r3 = move-exception
            goto L_0x001b
        L_0x0011:
            boolean r3 = e(r3)     // Catch:{ all -> 0x000f }
            if (r3 == 0) goto L_0x0019
            f25502b = r3     // Catch:{ all -> 0x000f }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r3
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzia.d(android.content.Context):boolean");
    }

    public static boolean e(Context context) {
        boolean z2;
        boolean z3 = true;
        int i2 = 1;
        while (true) {
            z2 = false;
            if (i2 > 2) {
                break;
            }
            if (f25501a == null) {
                f25501a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f25501a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z3 = false;
                }
                z2 = z3;
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                f25501a = null;
                i2++;
            }
        }
        if (z2) {
            f25501a = null;
        }
        return z2;
    }
}
