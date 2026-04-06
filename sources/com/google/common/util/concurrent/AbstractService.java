package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;

@ElementTypesAreNonnullByDefault
public abstract class AbstractService implements Service {

    /* renamed from: d  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29349d = new ListenerCallQueue.Event<Service.Listener>() {
        /* renamed from: b */
        public void a(Service.Listener listener) {
            listener.c();
        }

        public String toString() {
            return "starting()";
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29350e = new ListenerCallQueue.Event<Service.Listener>() {
        /* renamed from: b */
        public void a(Service.Listener listener) {
            listener.b();
        }

        public String toString() {
            return "running()";
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29351f;

    /* renamed from: g  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29352g;

    /* renamed from: h  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29353h = l(Service.State.NEW);

    /* renamed from: i  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29354i;

    /* renamed from: j  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29355j;

    /* renamed from: k  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29356k = l(Service.State.STOPPING);

    /* renamed from: a  reason: collision with root package name */
    public final Monitor f29357a;

    /* renamed from: b  reason: collision with root package name */
    public final ListenerCallQueue f29358b;

    /* renamed from: c  reason: collision with root package name */
    public volatile StateSnapshot f29359c;

    /* renamed from: com.google.common.util.concurrent.AbstractService$6  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29364a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29364a = r0
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29364a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29364a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29364a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29364a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29364a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractService.AnonymousClass6.<clinit>():void");
        }
    }

    public final class HasReachedRunningGuard extends Monitor.Guard {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AbstractService f29365c;

        public boolean a() {
            return this.f29365c.a().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    public final class IsStartableGuard extends Monitor.Guard {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AbstractService f29366c;

        public boolean a() {
            return this.f29366c.a() == Service.State.NEW;
        }
    }

    public final class IsStoppableGuard extends Monitor.Guard {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AbstractService f29367c;

        public boolean a() {
            return this.f29367c.a().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    public final class IsStoppedGuard extends Monitor.Guard {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AbstractService f29368c;

        public boolean a() {
            return this.f29368c.a().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    public static final class StateSnapshot {

        /* renamed from: a  reason: collision with root package name */
        public final Service.State f29369a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29370b;

        /* renamed from: c  reason: collision with root package name */
        public final Throwable f29371c;

        public StateSnapshot(Service.State state) {
            this(state, false, (Throwable) null);
        }

        public Service.State a() {
            return (!this.f29370b || this.f29369a != Service.State.STARTING) ? this.f29369a : Service.State.STOPPING;
        }

        public StateSnapshot(Service.State state, boolean z2, Throwable th) {
            boolean z3 = true;
            Preconditions.j(!z2 || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.l((th != null) != (state == Service.State.FAILED) ? false : z3, "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.f29369a = state;
            this.f29370b = z2;
            this.f29371c = th;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f29351f = k(state);
        Service.State state2 = Service.State.RUNNING;
        f29352g = k(state2);
        f29354i = l(state);
        f29355j = l(state2);
    }

    public static ListenerCallQueue.Event k(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() {
            /* renamed from: b */
            public void a(Service.Listener listener) {
                listener.d(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("stopping({from = ");
                sb.append(valueOf);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    public static ListenerCallQueue.Event l(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() {
            /* renamed from: b */
            public void a(Service.Listener listener) {
                listener.e(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("terminated({from = ");
                sb.append(valueOf);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    public final Service.State a() {
        return this.f29359c.a();
    }

    public final void b() {
        if (!this.f29357a.b()) {
            this.f29358b.b();
        }
    }

    public abstract void c();

    public final void d(final Service.State state, final Throwable th) {
        this.f29358b.c(new ListenerCallQueue.Event<Service.Listener>(this) {
            /* renamed from: b */
            public void a(Service.Listener listener) {
                listener.a(state, th);
            }

            public String toString() {
                String valueOf = String.valueOf(state);
                String valueOf2 = String.valueOf(th);
                StringBuilder sb = new StringBuilder(valueOf.length() + 27 + valueOf2.length());
                sb.append("failed({from = ");
                sb.append(valueOf);
                sb.append(", cause = ");
                sb.append(valueOf2);
                sb.append("})");
                return sb.toString();
            }
        });
    }

    public final void e() {
        this.f29358b.c(f29350e);
    }

    public final void f(Service.State state) {
        switch (AnonymousClass6.f29364a[state.ordinal()]) {
            case 1:
                this.f29358b.c(f29353h);
                return;
            case 2:
                this.f29358b.c(f29354i);
                return;
            case 3:
                this.f29358b.c(f29355j);
                return;
            case 4:
                this.f29358b.c(f29356k);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    public final boolean g() {
        return a() == Service.State.RUNNING;
    }

    public final void h(Throwable th) {
        Preconditions.q(th);
        this.f29357a.a();
        try {
            Service.State a2 = a();
            int i2 = AnonymousClass6.f29364a[a2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    this.f29359c = new StateSnapshot(Service.State.FAILED, false, th);
                    d(a2, th);
                } else if (i2 != 5) {
                }
                return;
            }
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Failed while in state:");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.f29357a.d();
            b();
        }
    }

    public final void i() {
        this.f29357a.a();
        try {
            if (this.f29359c.f29369a == Service.State.STARTING) {
                if (this.f29359c.f29370b) {
                    this.f29359c = new StateSnapshot(Service.State.STOPPING);
                    c();
                } else {
                    this.f29359c = new StateSnapshot(Service.State.RUNNING);
                    e();
                }
                return;
            }
            String valueOf = String.valueOf(this.f29359c.f29369a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(valueOf);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            h(illegalStateException);
            throw illegalStateException;
        } finally {
            this.f29357a.d();
            b();
        }
    }

    public final void j() {
        this.f29357a.a();
        try {
            Service.State a2 = a();
            switch (AnonymousClass6.f29364a[a2.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(a2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.f29359c = new StateSnapshot(Service.State.TERMINATED);
                    f(a2);
                    break;
            }
        } finally {
            this.f29357a.d();
            b();
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(a());
        StringBuilder sb = new StringBuilder(simpleName.length() + 3 + valueOf.length());
        sb.append(simpleName);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
