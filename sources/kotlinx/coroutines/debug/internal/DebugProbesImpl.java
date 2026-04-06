package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;

@Metadata
public final class DebugProbesImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final DebugProbesImpl f41547a;

    /* renamed from: b  reason: collision with root package name */
    public static final StackTraceElement f41548b = new ArtificialStackFrames().b();

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f41549c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentWeakMap f41550d = new ConcurrentWeakMap(false, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicInteger f41551e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLong f41552f = new AtomicLong(0);

    /* renamed from: g  reason: collision with root package name */
    public static boolean f41553g = true;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f41554h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f41555i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final Function1 f41556j;

    /* renamed from: k  reason: collision with root package name */
    public static final ConcurrentWeakMap f41557k = new ConcurrentWeakMap(true);

    @Metadata
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {

        /* renamed from: A  reason: collision with root package name */
        public final DebugCoroutineInfoImpl f41558A;

        /* renamed from: z  reason: collision with root package name */
        public final Continuation f41559z;

        public final StackTraceFrame a() {
            return this.f41558A.d();
        }

        public CoroutineStackFrame e() {
            StackTraceFrame a2 = a();
            if (a2 != null) {
                return a2.e();
            }
            return null;
        }

        public CoroutineContext f() {
            return this.f41559z.f();
        }

        public StackTraceElement p() {
            StackTraceFrame a2 = a();
            if (a2 != null) {
                return a2.p();
            }
            return null;
        }

        public void q(Object obj) {
            DebugProbesImpl.f41547a.f(this);
            this.f41559z.q(obj);
        }

        public String toString() {
            return this.f41559z.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f41547a = debugProbesImpl;
        f41556j = debugProbesImpl.c();
    }

    public final Function1 c() {
        Object obj;
        Function1 function1 = null;
        try {
            Result.Companion companion = Result.f40519A;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance((Object[]) null);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            obj = Result.b((Function1) TypeIntrinsics.e(newInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (!Result.g(obj)) {
            function1 = obj;
        }
        return function1;
    }

    public final boolean d() {
        return f41554h;
    }

    public final boolean e(CoroutineOwner coroutineOwner) {
        Job job;
        CoroutineContext c2 = coroutineOwner.f41558A.c();
        if (c2 == null || (job = (Job) c2.d(Job.f41415x)) == null || !job.t()) {
            return false;
        }
        f41550d.remove(coroutineOwner);
        return true;
    }

    public final void f(CoroutineOwner coroutineOwner) {
        CoroutineStackFrame g2;
        f41550d.remove(coroutineOwner);
        CoroutineStackFrame f2 = coroutineOwner.f41558A.f();
        if (f2 != null && (g2 = g(f2)) != null) {
            f41557k.remove(g2);
        }
    }

    public final CoroutineStackFrame g(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.e();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.p() == null);
        return coroutineStackFrame;
    }
}
