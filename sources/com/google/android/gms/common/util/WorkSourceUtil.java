package com.google.android.gms.common.util;

import android.os.Process;
import java.lang.reflect.Method;

public class WorkSourceUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final int f25127a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    public static final Method f25128b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f25129c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f25130d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f25131e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f25132f;

    /* renamed from: g  reason: collision with root package name */
    public static final Method f25133g;

    /* renamed from: h  reason: collision with root package name */
    public static final Method f25134h;

    /* renamed from: i  reason: collision with root package name */
    public static final Method f25135i;

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f25136j = null;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f25127a = r2
            r2 = 0
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0016 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0016 }
            java.lang.reflect.Method r3 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            f25128b = r3
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.c()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == 0) goto L_0x002c
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002c }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch:{ Exception -> 0x002c }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            f25129c = r0
            java.lang.String r0 = "size"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            f25130d = r0
            java.lang.String r0 = "get"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0046 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0046 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            f25131e = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.c()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "getName"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005c }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x005c }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            f25132f = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.i()
            java.lang.String r3 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "createWorkChain"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x006e }
            goto L_0x0075
        L_0x006e:
            r0 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r3, r5, r0)
        L_0x0074:
            r0 = r2
        L_0x0075:
            f25133g = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.i()
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r5 = "addNode"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0090 }
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r4}     // Catch:{ Exception -> 0x0090 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r0 = move-exception
            java.lang.String r4 = "Missing WorkChain class"
            android.util.Log.w(r3, r4, r0)
        L_0x0096:
            r0 = r2
        L_0x0097:
            f25134h = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.i()
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x00aa }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ab
        L_0x00aa:
            r0 = r2
        L_0x00ab:
            f25135i = r0
            f25136j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }
}
