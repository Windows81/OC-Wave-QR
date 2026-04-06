package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 extends RestrictedContinuationImpl {

    /* renamed from: A  reason: collision with root package name */
    public int f40728A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f40729B;

    public Object x(Object obj) {
        int i2 = this.f40728A;
        if (i2 == 0) {
            this.f40728A = 1;
            ResultKt.b(obj);
            Intrinsics.g(this.f40729B, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((Function1) TypeIntrinsics.e(this.f40729B, 1)).invoke(this);
        } else if (i2 == 1) {
            this.f40728A = 2;
            ResultKt.b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
f40730A = 1;
            ResultKt.b(obj);
            Intrinsics.g(this.f40731B, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((Function2) TypeIntrinsics.e(this.f40731B, 2)).m(this.C, this);
        } else if (i2 == 1) {
            this.f40730A = 2;
            ResultKt.b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
