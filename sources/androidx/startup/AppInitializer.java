package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer {

    /* renamed from: d  reason: collision with root package name */
    public static volatile AppInitializer f22930d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f22931e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map f22932a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set f22933b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f22934c;

    public AppInitializer(Context context) {
        this.f22934c = context.getApplicationContext();
    }

    public static AppInitializer e(Context context) {
        if (f22930d == null) {
            synchronized (f22931e) {
                try {
                    if (f22930d == null) {
                        f22930d = new AppInitializer(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22930d;
    }

    public void a() {
        try {
            Trace.a("Startup");
            b(this.f22934c.getPackageManager().getProviderInfo(new ComponentName(this.f22934c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            Trace.b();
        } catch (PackageManager.NameNotFoundException e2) {
            throw new StartupException((Throwable) e2);
        } catch (Throwable th) {
            Trace.b();
            throw th;
        }
    }

    public void b(Bundle bundle) {
        String string = this.f22934c.getString(R.string.f22935a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            this.f22933b.add(cls);
                        }
                    }
                }
                for (Class d2 : this.f22933b) {
                    d(d2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException((Throwable) e2);
            }
        }
    }

    public Object c(Class cls) {
        Object obj;
        synchronized (f22931e) {
            try {
                obj = this.f22932a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final Object d(Class cls, Set set) {
        Object obj;
        if (Trace.d()) {
            try {
                Trace.a(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f22932a.containsKey(cls)) {
                set.add(cls);
                Initializer initializer = (Initializer) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = initializer.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!this.f22932a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = initializer.b(this.f22934c);
                set.remove(cls);
                this.f22932a.put(cls, obj);
            } else {
                obj = this.f22932a.get(cls);
            }
            Trace.b();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f22933b.contains(cls);
    }
}
