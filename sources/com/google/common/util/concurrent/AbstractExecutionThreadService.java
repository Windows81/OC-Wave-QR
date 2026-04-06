package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public abstract class AbstractExecutionThreadService implements Service {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f29277b = Logger.getLogger(AbstractExecutionThreadService.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Service f29278a;

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1  reason: invalid class name */
    public class AnonymousClass1 extends AbstractService {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ AbstractExecutionThreadService f29279l;

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$1  reason: invalid class name */
        class AnonymousClass1 implements Supplier<String> {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f29280z;

            /* renamed from: a */
            public String get() {
                return this.f29280z.f29279l.d();
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f29281z;

            public void run() {
                try {
                    this.f29281z.f29279l.f();
                    this.f29281z.i();
                    if (this.f29281z.g()) {
                        this.f29281z.f29279l.c();
                    }
                    this.f29281z.f29279l.e();
                    this.f29281z.j();
                } catch (Throwable th) {
                    this.f29281z.h(th);
                }
            }
        }

        public void c() {
            this.f29279l.g();
        }

        public String toString() {
            return this.f29279l.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$2  reason: invalid class name */
    class AnonymousClass2 implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AbstractExecutionThreadService f29282z;

        public void execute(Runnable runnable) {
            MoreExecutors.c(this.f29282z.d(), runnable).start();
        }
    }

    public final Service.State a() {
        return this.f29278a.a();
    }

    public abstract void c();

    public String d() {
        return getClass().getSimpleName();
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

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
