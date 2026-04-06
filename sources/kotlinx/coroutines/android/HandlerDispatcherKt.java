package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class HandlerDispatcherKt {

    /* renamed from: a  reason: collision with root package name */
    public static final HandlerDispatcher f41446a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        HandlerDispatcher handlerDispatcher = null;
        try {
            Result.Companion companion = Result.f40519A;
            obj = Result.b(new HandlerContext(c(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (!Result.g(obj)) {
            handlerDispatcher = obj;
        }
        f41446a = handlerDispatcher;
    }

    public static final Handler c(Looper looper, boolean z2) {
        if (!z2) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            Intrinsics.g(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final HandlerDispatcher d(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }

    public static final void e(Choreographer choreographer2, CancellableContinuation cancellableContinuation) {
        choreographer2.postFrameCallback(new d(cancellableContinuation));
    }

    public static final void f(CancellableContinuation cancellableContinuation, long j2) {
        cancellableContinuation.P(Dispatchers.c(), Long.valueOf(j2));
    }

    public static final void g(CancellableContinuation cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.f(choreographer2);
            choreographer = choreographer2;
        }
        e(choreographer2, cancellableContinuation);
    }
}
