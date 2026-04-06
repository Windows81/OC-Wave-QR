package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

@Singleton
class MetadataBackendRegistry implements BackendRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final BackendFactoryProvider f24098a;

    /* renamed from: b  reason: collision with root package name */
    public final CreationContextFactory f24099b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f24100c;

    public static class BackendFactoryProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Context f24101a;

        /* renamed from: b  reason: collision with root package name */
        public Map f24102b = null;

        public BackendFactoryProvider(Context context) {
            this.f24101a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle d2 = d(context);
            if (d2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d2.keySet()) {
                Object obj = d2.get(next);
                if ((obj instanceof String) && next.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public BackendFactory b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e6);
                return null;
            }
        }

        public final Map c() {
            if (this.f24102b == null) {
                this.f24102b = a(this.f24101a);
            }
            return this.f24102b;
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    public synchronized TransportBackend e(String str) {
        if (this.f24100c.containsKey(str)) {
            return (TransportBackend) this.f24100c.get(str);
        }
        BackendFactory b2 = this.f24098a.b(str);
        if (b2 == null) {
            return null;
        }
        TransportBackend create = b2.create(this.f24099b.a(str));
        this.f24100c.put(str, create);
        return create;
    }

    public MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.f24100c = new HashMap();
        this.f24098a = backendFactoryProvider;
        this.f24099b = creationContextFactory;
    }
}
