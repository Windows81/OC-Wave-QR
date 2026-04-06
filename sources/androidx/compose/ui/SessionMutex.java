package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@JvmInline
@Metadata
public final class SessionMutex<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f15547a;

    @Metadata
    public static final class Session<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Job f15548a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f15549b;

        public Session(Job job, Object obj) {
            this.f15548a = job;
            this.f15549b = obj;
        }

        public final Job a() {
            return this.f15548a;
        }

        public final Object b() {
            return this.f15549b;
        }
    }

    public static AtomicReference a() {
        return b(new AtomicReference((Object) null));
    }

    public static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static boolean c(AtomicReference atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && Intrinsics.d(atomicReference, ((SessionMutex) obj).g());
    }

    public static final Object d(AtomicReference atomicReference) {
        Session session = (Session) atomicReference.get();
        if (session != null) {
            return session.b();
        }
        return null;
    }

    public static int e(AtomicReference atomicReference) {
        return atomicReference.hashCode();
    }

    public static String f(AtomicReference atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    public static final Object h(AtomicReference atomicReference, Function1 function1, Function2 function2, Continuation continuation) {
        return CoroutineScopeKt.f(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, (Continuation) null), continuation);
    }

    public boolean equals(Object obj) {
        return c(this.f15547a, obj);
    }

    public final /* synthetic */ AtomicReference g() {
        return this.f15547a;
    }

    public int hashCode() {
        return e(this.f15547a);
    }

    public String toString() {
        return f(this.f15547a);
    }
}
