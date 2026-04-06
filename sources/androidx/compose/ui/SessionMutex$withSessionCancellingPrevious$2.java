package androidx.compose.ui;

import androidx.compose.animation.core.h;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
public final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ AtomicReference G;
    public final /* synthetic */ Function2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(Function1 function1, AtomicReference atomicReference, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = function1;
        this.G = atomicReference;
        this.H = function2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SessionMutex$withSessionCancellingPrevious$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.F, this.G, this.H, continuation);
        sessionMutex$withSessionCancellingPrevious$2.E = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    public final Object x(Object obj) {
        SessionMutex.Session session;
        SessionMutex.Session session2;
        Job a2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.E;
            session2 = new SessionMutex.Session(JobKt.k(coroutineScope.getCoroutineContext()), this.F.invoke(coroutineScope));
            SessionMutex.Session session3 = (SessionMutex.Session) this.G.getAndSet(session2);
            if (!(session3 == null || (a2 = session3.a()) == null)) {
                this.E = session2;
                this.D = 1;
                if (JobKt.g(a2, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            session2 = (SessionMutex.Session) this.E;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            session = (SessionMutex.Session) this.E;
            try {
                ResultKt.b(obj);
                h.a(this.G, session, (Object) null);
                return obj;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            Function2 function2 = this.H;
            Object b2 = session2.b();
            this.E = session2;
            this.D = 2;
            obj = function2.m(b2, this);
            if (obj == f2) {
                return f2;
            }
            session = session2;
            h.a(this.G, session, (Object) null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            session = session2;
            h.a(this.G, session, (Object) null);
            throw th;
        }
    }
}
