package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {75}, m = "invokeSuspend")
public final class ForEachGestureKt$awaitAllPointersUp$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f3521B;
    public /* synthetic */ Object C;

    public ForEachGestureKt$awaitAllPointersUp$2(Continuation continuation) {
        super(2, continuation);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(continuation);
        forEachGestureKt$awaitAllPointersUp$2.C = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f3521B;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f3521B = 1;
            if (ForEachGestureKt.d((AwaitPointerEventScope) this.C, (PointerEventPass) null, this, 1, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
