package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver;
import coil.network.NetworkObserverKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.Listener {
    public static final Companion E = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public Context f23763A;

    /* renamed from: B  reason: collision with root package name */
    public NetworkObserver f23764B;
    public boolean C;
    public boolean D = true;

    /* renamed from: z  reason: collision with root package name */
    public final WeakReference f23765z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SystemCallbacks(RealImageLoader realImageLoader) {
        this.f23765z = new WeakReference(realImageLoader);
    }

    public synchronized void a(boolean z2) {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f23765z.get();
            Unit unit = null;
            if (realImageLoader != null) {
                Logger i2 = realImageLoader.i();
                if (i2 != null && i2.a() <= 4) {
                    i2.b("NetworkObserver", 4, z2 ? "ONLINE" : "OFFLINE", (Throwable) null);
                }
                this.D = z2;
                unit = Unit.f40552a;
            }
            if (unit == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized boolean b() {
        d();
        return this.D;
    }

    public final synchronized void c() {
        Unit unit;
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f23765z.get();
            if (realImageLoader != null) {
                if (this.f23763A == null) {
                    Context h2 = realImageLoader.h();
                    this.f23763A = h2;
                    h2.registerComponentCallbacks(this);
                }
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            if (unit == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void d() {
        Unit unit;
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f23765z.get();
            if (realImageLoader != null) {
                if (this.f23764B == null) {
                    NetworkObserver a2 = realImageLoader.j().d() ? NetworkObserverKt.a(realImageLoader.h(), this, realImageLoader.i()) : new EmptyNetworkObserver();
                    this.f23764B = a2;
                    this.D = a2.a();
                }
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            if (unit == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void e() {
        try {
            if (!this.C) {
                this.C = true;
                Context context = this.f23763A;
                if (context != null) {
                    context.unregisterComponentCallbacks(this);
                }
                NetworkObserver networkObserver = this.f23764B;
                if (networkObserver != null) {
                    networkObserver.shutdown();
                }
                this.f23765z.clear();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((RealImageLoader) this.f23765z.get()) != null ? Unit.f40552a : null) == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    public synchronized void onTrimMemory(int i2) {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f23765z.get();
            Unit unit = null;
            if (realImageLoader != null) {
                Logger i3 = realImageLoader.i();
                if (i3 != null && i3.a() <= 2) {
                    i3.b("NetworkObserver", 2, "trimMemory, level=" + i2, (Throwable) null);
                }
                realImageLoader.n(i2);
                unit = Unit.f40552a;
            }
            if (unit == null) {
                e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
