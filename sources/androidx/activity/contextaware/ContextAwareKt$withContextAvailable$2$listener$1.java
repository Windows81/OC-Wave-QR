package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f198b;

    public void a(Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        CancellableContinuation cancellableContinuation = this.f197a;
        Function1 function1 = this.f198b;
        try {
            Result.Companion companion = Result.f40519A;
            obj = Result.b(function1.invoke(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        cancellableContinuation.q(obj);
    }
}
