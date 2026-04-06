package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f21924k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f21925a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public SafeIterableMap f21926b = new SafeIterableMap();

    /* renamed from: c  reason: collision with root package name */
    public int f21927c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21928d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f21929e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f21930f;

    /* renamed from: g  reason: collision with root package name */
    public int f21931g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21932h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21933i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f21934j;

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        public AlwaysActiveObserver(Observer observer) {
            super(observer);
        }

        public boolean f() {
            return true;
        }
    }

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner D;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.D = lifecycleOwner;
        }

        public void d() {
            this.D.a().d(this);
        }

        public boolean e(LifecycleOwner lifecycleOwner) {
            return this.D == lifecycleOwner;
        }

        public boolean f() {
            return this.D.a().b().f(Lifecycle.State.STARTED);
        }

        public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State b2 = this.D.a().b();
            if (b2 == Lifecycle.State.DESTROYED) {
                LiveData.this.n(this.f21938z);
                return;
            }
            Lifecycle.State state = null;
            while (state != b2) {
                b(f());
                state = b2;
                b2 = this.D.a().b();
            }
        }
    }

    public abstract class ObserverWrapper {

        /* renamed from: A  reason: collision with root package name */
        public boolean f21936A;

        /* renamed from: B  reason: collision with root package name */
        public int f21937B = -1;

        /* renamed from: z  reason: collision with root package name */
        public final Observer f21938z;

        public ObserverWrapper(Observer observer) {
            this.f21938z = observer;
        }

        public void b(boolean z2) {
            if (z2 != this.f21936A) {
                this.f21936A = z2;
                LiveData.this.c(z2 ? 1 : -1);
                if (this.f21936A) {
                    LiveData.this.e(this);
                }
            }
        }

        public void d() {
        }

        public boolean e(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean f();
    }

    public LiveData() {
        Object obj = f21924k;
        this.f21930f = obj;
        this.f21934j = new Runnable() {
            public void run() {
                Object obj;
                synchronized (LiveData.this.f21925a) {
                    obj = LiveData.this.f21930f;
                    LiveData.this.f21930f = LiveData.f21924k;
                }
                LiveData.this.o(obj);
            }
        };
        this.f21929e = obj;
        this.f21931g = -1;
    }

    public static void b(String str) {
        if (!ArchTaskExecutor.f().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public void c(int i2) {
        int i3 = this.f21927c;
        this.f21927c = i2 + i3;
        if (!this.f21928d) {
            this.f21928d = true;
            while (true) {
                try {
                    int i4 = this.f21927c;
                    if (i3 != i4) {
                        boolean z2 = i3 == 0 && i4 > 0;
                        boolean z3 = i3 > 0 && i4 == 0;
                        if (z2) {
                            k();
                        } else if (z3) {
                            l();
                        }
                        i3 = i4;
                    } else {
                        this.f21928d = false;
                        return;
                    }
                } catch (Throwable th) {
                    this.f21928d = false;
                    throw th;
                }
            }
        }
    }

    public final void d(ObserverWrapper observerWrapper) {
        if (observerWrapper.f21936A) {
            if (!observerWrapper.f()) {
                observerWrapper.b(false);
                return;
            }
            int i2 = observerWrapper.f21937B;
            int i3 = this.f21931g;
            if (i2 < i3) {
                observerWrapper.f21937B = i3;
                observerWrapper.f21938z.a(this.f21929e);
            }
        }
    }

    public void e(ObserverWrapper observerWrapper) {
        if (this.f21932h) {
            this.f21933i = true;
            return;
        }
        this.f21932h = true;
        do {
            this.f21933i = false;
            if (observerWrapper == null) {
                SafeIterableMap.IteratorWithAdditions h2 = this.f21926b.h();
                while (h2.hasNext()) {
                    d((ObserverWrapper) ((Map.Entry) h2.next()).getValue());
                    if (this.f21933i) {
                        break;
                    }
                }
            } else {
                d(observerWrapper);
                observerWrapper = null;
            }
        } while (this.f21933i);
        this.f21932h = false;
    }

    public Object f() {
        Object obj = this.f21929e;
        if (obj != f21924k) {
            return obj;
        }
        return null;
    }

    public int g() {
        return this.f21931g;
    }

    public boolean h() {
        return this.f21927c > 0;
    }

    public void i(LifecycleOwner lifecycleOwner, Observer observer) {
        b("observe");
        if (lifecycleOwner.a().b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            ObserverWrapper observerWrapper = (ObserverWrapper) this.f21926b.n(observer, lifecycleBoundObserver);
            if (observerWrapper != null && !observerWrapper.e(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (observerWrapper == null) {
                lifecycleOwner.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void j(Observer observer) {
        b("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f21926b.n(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (observerWrapper == null) {
            alwaysActiveObserver.b(true);
        }
    }

    public void k() {
    }

    public void l() {
    }

    public void m(Object obj) {
        boolean z2;
        synchronized (this.f21925a) {
            z2 = this.f21930f == f21924k;
            this.f21930f = obj;
        }
        if (z2) {
            ArchTaskExecutor.f().c(this.f21934j);
        }
    }

    public void n(Observer observer) {
        b("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f21926b.o(observer);
        if (observerWrapper != null) {
            observerWrapper.d();
            observerWrapper.b(false);
        }
    }

    public void o(Object obj) {
        b("setValue");
        this.f21931g++;
        this.f21929e = obj;
        e((ObserverWrapper) null);
    }
}
