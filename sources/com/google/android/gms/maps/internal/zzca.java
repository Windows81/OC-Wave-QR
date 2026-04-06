package com.google.android.gms.maps.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;

public final class zzca {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25990a = "zzca";

    /* renamed from: b  reason: collision with root package name */
    public static Context f25991b;

    /* renamed from: c  reason: collision with root package name */
    public static zzf f25992c;

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.internal.zzf a(android.content.Context r3, com.google.android.gms.maps.MapsInitializer.Renderer r4) {
        /*
            com.google.android.gms.common.internal.Preconditions.m(r3)
            java.lang.String r0 = f25990a
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
            com.google.android.gms.maps.internal.zzf r1 = f25992c
            if (r1 != 0) goto L_0x0084
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.h(r3, r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = c(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.m(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Object r0 = d(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x0056
        L_0x0042:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.zzf
            if (r2 == 0) goto L_0x0050
            r0 = r1
            com.google.android.gms.maps.internal.zzf r0 = (com.google.android.gms.maps.internal.zzf) r0
            goto L_0x0056
        L_0x0050:
            com.google.android.gms.maps.internal.zze r1 = new com.google.android.gms.maps.internal.zze
            r1.<init>(r0)
            r0 = r1
        L_0x0056:
            f25992c = r0
            android.content.Context r3 = c(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            r3.getClass()     // Catch:{ RemoteException -> 0x006f }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x006f }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.u1(r3)     // Catch:{ RemoteException -> 0x006f }
            int r4 = com.google.android.gms.common.GooglePlayServicesUtil.f24397f     // Catch:{ RemoteException -> 0x006f }
            r0.j0(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            com.google.android.gms.maps.internal.zzf r3 = f25992c
            return r3
        L_0x006f:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r4 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r4.<init>(r3)
            throw r4
        L_0x0076:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x007e:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r1)
            throw r3
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzca.a(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):com.google.android.gms.maps.internal.zzf");
    }

    public static Context b(Exception exc, Context context) {
        Log.e(f25990a, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.e(context);
    }

    public static Context c(Context context, MapsInitializer.Renderer renderer) {
        String str;
        Context context2;
        Context context3 = f25991b;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (renderer != null) {
            int ordinal = renderer.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.e(context, DynamiteModule.f25219b, str).b();
            f25991b = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.e(context, DynamiteModule.f25219b, str).b();
        } catch (Exception e2) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f25990a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.e(context, DynamiteModule.f25219b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e3) {
                    context2 = b(e3, context);
                }
            } else {
                context2 = b(e2, context);
            }
        }
        f25991b = context2;
        return context2;
    }

    public static Object d(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
        }
    }
}
