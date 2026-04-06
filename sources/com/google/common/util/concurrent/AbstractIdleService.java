package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
public abstract class AbstractIdleService implements Service {

    /* renamed from: a  reason: collision with root package name */
    public final Supplier f29312a;

    /* renamed from: b  reason: collision with root package name */
    public final Service f29313b;

    public final class DelegateService extends AbstractService {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ AbstractIdleService f29315l;

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$1  reason: invalid class name */
        class AnonymousClass1 implements Runnable {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DelegateService f29316z;

            public void run() {
                try {
                    this.f29316z.f29315l.f();
                    this.f29316z.i();
                } catch (Throwable th) {
                    this.f29316z.h(th);
                }
            }
        }

        public final void c() {
            MoreExecutors.f(this.f29315l.c(), this.f29315l.f29312a).execute(new Runnable() {
                public void run() {
                    try {
                        DelegateService.this.f29315l.e();
                        DelegateService.this.j();
                    } catch (Throwable th) {
                        DelegateService.this.h(th);
                    }
                }
            });
        }

        public String toString() {
            return this.f29315l.toString();
        }
    }

    public final class ThreadNameSupplier implements Supplier<String> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AbstractIdleService f29318z;

        /* renamed from: a */
        public String get() {
            String d2 = this.f29318z.d();
            String valueOf = String.valueOf(this.f29318z.a());
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 1 + valueOf.length());
            sb.append(d2);
            sb.append(" ");
            sb.append(valueOf);
            return sb.toString();
        }
    }

    public final Service.State a() {
        return this.f29313b.a();
    }

    public Executor c() {
        return new Executor() {
            public void execute(Runnable runnable) {
                MoreExecutors.c((String) AbstractIdleService.this.f29312a.get(), runnable).start();
            }
        };
    }

    public String d() {
        return getClass().getSimpleName();
    }

    public abstract void e();

    public abstract void f();

    public String toString() {
        String d2 = d();
        String valueOf = String.valueOf(a());
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 3 + valueOf.length());
        sb.append(d2);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
