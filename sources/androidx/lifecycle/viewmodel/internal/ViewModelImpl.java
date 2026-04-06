package androidx.lifecycle.viewmodel.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewModelImpl {

    /* renamed from: a  reason: collision with root package name */
    public final SynchronizedObject f22082a = new SynchronizedObject();

    /* renamed from: b  reason: collision with root package name */
    public final Map f22083b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Set f22084c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f22085d;

    public final void d(AutoCloseable autoCloseable) {
        Intrinsics.i(autoCloseable, "closeable");
        if (this.f22085d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f22082a) {
            this.f22084c.add(autoCloseable);
            Unit unit = Unit.f40552a;
        }
    }

    public final void e(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        Intrinsics.i(str, "key");
        Intrinsics.i(autoCloseable, "closeable");
        if (this.f22085d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f22082a) {
            autoCloseable2 = (AutoCloseable) this.f22083b.put(str, autoCloseable);
        }
        g(autoCloseable2);
    }

    public final void f() {
        if (!this.f22085d) {
            this.f22085d = true;
            synchronized (this.f22082a) {
                try {
                    for (AutoCloseable a2 : this.f22083b.values()) {
                        g(a2);
                    }
                    for (AutoCloseable a3 : this.f22084c) {
                        g(a3);
                    }
                    this.f22084c.clear();
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final AutoCloseable h(String str) {
        AutoCloseable autoCloseable;
        Intrinsics.i(str, "key");
        synchronized (this.f22082a) {
            autoCloseable = (AutoCloseable) this.f22083b.get(str);
        }
        return autoCloseable;
    }
}
