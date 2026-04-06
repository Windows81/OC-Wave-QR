package com.google.android.gms.maps;

import android.content.Context;

public final class MapsInitializer {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25954a = "MapsInitializer";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f25955b = false;

    /* renamed from: c  reason: collision with root package name */
    public static Renderer f25956c = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        int b2;
        synchronized (MapsInitializer.class) {
            b2 = b(context, (Renderer) null, (OnMapsSdkInitializedCallback) null);
        }
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051 A[Catch:{ RemoteException -> 0x0081, RemoteException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ RemoteException -> 0x0081, RemoteException -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int b(android.content.Context r5, com.google.android.gms.maps.MapsInitializer.Renderer r6, com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.n(r5, r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = f25954a     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0024 }
            boolean r1 = f25955b     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x0028
            if (r7 == 0) goto L_0x0026
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = f25956c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            goto L_0x008d
        L_0x0026:
            monitor-exit(r0)
            return r2
        L_0x0028:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzca.a(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0088 }
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.g()     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.maps.CameraUpdateFactory.a(r3)     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.maps.zzi r3 = r1.m()     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.maps.model.BitmapDescriptorFactory.a(r3)     // Catch:{ RemoteException -> 0x0081 }
            r3 = 1
            f25955b = r3     // Catch:{ all -> 0x0024 }
            r4 = 2
            if (r6 == 0) goto L_0x0048
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0024 }
            if (r6 == 0) goto L_0x004b
            if (r6 == r3) goto L_0x004a
        L_0x0048:
            r3 = r2
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            int r6 = r1.e()     // Catch:{ RemoteException -> 0x0056 }
            if (r6 != r4) goto L_0x0058
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch:{ RemoteException -> 0x0056 }
            f25956c = r6     // Catch:{ RemoteException -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r5 = move-exception
            goto L_0x0060
        L_0x0058:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.u1(r5)     // Catch:{ RemoteException -> 0x0056 }
            r1.G0(r5, r3)     // Catch:{ RemoteException -> 0x0056 }
            goto L_0x0067
        L_0x0060:
            java.lang.String r6 = f25954a     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0024 }
        L_0x0067:
            java.lang.String r5 = f25954a     // Catch:{ all -> 0x0024 }
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = f25956c     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch:{ all -> 0x0024 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0024 }
            if (r7 == 0) goto L_0x007f
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = f25956c     // Catch:{ all -> 0x0024 }
            r7.a(r5)     // Catch:{ all -> 0x0024 }
        L_0x007f:
            monitor-exit(r0)
            return r2
        L_0x0081:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x0024 }
            r6.<init>(r5)     // Catch:{ all -> 0x0024 }
            throw r6     // Catch:{ all -> 0x0024 }
        L_0x0088:
            r5 = move-exception
            int r5 = r5.f24395z     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return r5
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.b(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
