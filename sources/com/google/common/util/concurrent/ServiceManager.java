package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class ServiceManager implements ServiceManagerBridge {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f29566b = Logger.getLogger(ServiceManager.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29567c = new ListenerCallQueue.Event<Listener>() {
        /* renamed from: b */
        public void a(Listener listener) {
            listener.b();
        }

        public String toString() {
            return "healthy()";
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final ListenerCallQueue.Event f29568d = new ListenerCallQueue.Event<Listener>() {
        /* renamed from: b */
        public void a(Listener listener) {
            listener.c();
        }

        public String toString() {
            return "stopped()";
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ImmutableList f29569a;

    public static final class EmptyServiceManagerWarning extends Throwable {
    }

    public static abstract class Listener {
        public void a(Service service) {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public static final class NoOpService extends AbstractService {
        public void c() {
            j();
        }
    }

    public static final class ServiceListener extends Service.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final Service f29570a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f29571b;

        public void a(Service.State state, Throwable th) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f29571b.get();
            if (serviceManagerState != null) {
                if (!(this.f29570a instanceof NoOpService)) {
                    Logger a2 = ServiceManager.f29566b;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(this.f29570a);
                    String valueOf2 = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34 + valueOf2.length());
                    sb.append("Service ");
                    sb.append(valueOf);
                    sb.append(" has failed in the ");
                    sb.append(valueOf2);
                    sb.append(" state.");
                    a2.log(level, sb.toString(), th);
                }
                serviceManagerState.e(this.f29570a, state, Service.State.FAILED);
            }
        }

        public void b() {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f29571b.get();
            if (serviceManagerState != null) {
                serviceManagerState.e(this.f29570a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        public void c() {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f29571b.get();
            if (serviceManagerState != null) {
                serviceManagerState.e(this.f29570a, Service.State.NEW, Service.State.STARTING);
                if (!(this.f29570a instanceof NoOpService)) {
                    ServiceManager.f29566b.log(Level.FINE, "Starting {0}.", this.f29570a);
                }
            }
        }

        public void d(Service.State state) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f29571b.get();
            if (serviceManagerState != null) {
                serviceManagerState.e(this.f29570a, state, Service.State.STOPPING);
            }
        }

        public void e(Service.State state) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f29571b.get();
            if (serviceManagerState != null) {
                if (!(this.f29570a instanceof NoOpService)) {
                    ServiceManager.f29566b.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f29570a, state});
                }
                serviceManagerState.e(this.f29570a, state, Service.State.TERMINATED);
            }
        }
    }

    public static final class ServiceManagerState {

        /* renamed from: a  reason: collision with root package name */
        public final Monitor f29572a;

        /* renamed from: b  reason: collision with root package name */
        public final SetMultimap f29573b;

        /* renamed from: c  reason: collision with root package name */
        public final Multiset f29574c;

        /* renamed from: d  reason: collision with root package name */
        public final Map f29575d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29576e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29577f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29578g;

        /* renamed from: h  reason: collision with root package name */
        public final ListenerCallQueue f29579h;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1  reason: invalid class name */
        class AnonymousClass1 implements Function<Map.Entry<Service, Long>, Long> {
            /* renamed from: a */
            public Long apply(Map.Entry entry) {
                return (Long) entry.getValue();
            }
        }

        public final class AwaitHealthGuard extends Monitor.Guard {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ServiceManagerState f29581c;

            public boolean a() {
                int L0 = this.f29581c.f29574c.L0(Service.State.RUNNING);
                ServiceManagerState serviceManagerState = this.f29581c;
                return L0 == serviceManagerState.f29578g || serviceManagerState.f29574c.contains(Service.State.STOPPING) || this.f29581c.f29574c.contains(Service.State.TERMINATED) || this.f29581c.f29574c.contains(Service.State.FAILED);
            }
        }

        public final class StoppedGuard extends Monitor.Guard {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ServiceManagerState f29582c;

            public boolean a() {
                return this.f29582c.f29574c.L0(Service.State.TERMINATED) + this.f29582c.f29574c.L0(Service.State.FAILED) == this.f29582c.f29578g;
            }
        }

        public void a() {
            Preconditions.x(!this.f29572a.b(), "It is incorrect to execute listeners with the monitor held.");
            this.f29579h.b();
        }

        public void b(final Service service) {
            this.f29579h.c(new ListenerCallQueue.Event<Listener>(this) {
                /* renamed from: b */
                public void a(Listener listener) {
                    listener.a(service);
                }

                public String toString() {
                    String valueOf = String.valueOf(service);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("failed({service=");
                    sb.append(valueOf);
                    sb.append("})");
                    return sb.toString();
                }
            });
        }

        public void c() {
            this.f29579h.c(ServiceManager.f29567c);
        }

        public void d() {
            this.f29579h.c(ServiceManager.f29568d);
        }

        public void e(Service service, Service.State state, Service.State state2) {
            Preconditions.q(service);
            Preconditions.d(state != state2);
            this.f29572a.a();
            try {
                this.f29577f = true;
                if (!this.f29576e) {
                    this.f29572a.d();
                    a();
                    return;
                }
                Preconditions.A(this.f29573b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                Preconditions.A(this.f29573b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                Stopwatch stopwatch = (Stopwatch) this.f29575d.get(service);
                if (stopwatch == null) {
                    stopwatch = Stopwatch.c();
                    this.f29575d.put(service, stopwatch);
                }
                Service.State state3 = Service.State.RUNNING;
                if (state2.compareTo(state3) >= 0 && stopwatch.g()) {
                    stopwatch.i();
                    if (!(service instanceof NoOpService)) {
                        ServiceManager.f29566b.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatch});
                    }
                }
                Service.State state4 = Service.State.FAILED;
                if (state2 == state4) {
                    b(service);
                }
                if (this.f29574c.L0(state3) == this.f29578g) {
                    c();
                } else if (this.f29574c.L0(Service.State.TERMINATED) + this.f29574c.L0(state4) == this.f29578g) {
                    d();
                }
            } finally {
                this.f29572a.d();
                a();
            }
        }
    }

    public String toString() {
        return MoreObjects.b(ServiceManager.class).d("services", Collections2.d(this.f29569a, Predicates.j(Predicates.h(NoOpService.class)))).toString();
    }
}
