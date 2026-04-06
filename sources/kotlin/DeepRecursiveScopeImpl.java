package kotlin;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    /* renamed from: A  reason: collision with root package name */
    public Object f40496A;

    /* renamed from: B  reason: collision with root package name */
    public Continuation f40497B = this;
    public Object C = DeepRecursiveKt.f40495a;

    /* renamed from: z  reason: collision with root package name */
    public Function3 f40498z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeepRecursiveScopeImpl(Function3 function3, Object obj) {
        super((DefaultConstructorMarker) null);
        Intrinsics.i(function3, "block");
        this.f40498z = function3;
        this.f40496A = obj;
        Intrinsics.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object a(Object obj, Continuation continuation) {
        Intrinsics.g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f40497B = continuation;
        this.f40496A = obj;
        Object f2 = IntrinsicsKt.f();
        if (f2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return f2;
    }

    public CoroutineContext f() {
        return EmptyCoroutineContext.f40721z;
    }

    public final Object g() {
        while (true) {
            Object obj = this.C;
            Continuation continuation = this.f40497B;
            if (continuation == null) {
                ResultKt.b(obj);
                return obj;
            } else if (Result.d(DeepRecursiveKt.f40495a, obj)) {
                try {
                    Function3 function3 = this.f40498z;
                    Object obj2 = this.f40496A;
                    Object e2 = !(function3 instanceof BaseContinuationImpl) ? IntrinsicsKt.e(function3, this, obj2, continuation) : ((Function3) TypeIntrinsics.e(function3, 3)).d(this, obj2, continuation);
                    if (e2 != IntrinsicsKt.f()) {
                        continuation.q(Result.b(e2));
                    }
                } catch (Throwable th) {
                    Result.Companion companion = Result.f40519A;
                    continuation.q(Result.b(ResultKt.a(th)));
                }
            } else {
                this.C = DeepRecursiveKt.f40495a;
                continuation.q(obj);
            }
        }
    }

    public void q(Object obj) {
        this.f40497B = null;
        this.C = obj;
    }
}
