package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {111, 112}, m = "invokeSuspend")
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MutableSharedFlow E;
    public final /* synthetic */ ComposeInputMethodManager F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(MutableSharedFlow mutableSharedFlow, ComposeInputMethodManager composeInputMethodManager, Continuation continuation) {
        super(2, continuation);
        this.E = mutableSharedFlow;
        this.F = composeInputMethodManager;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnonymousClass1 r5 = AnonymousClass1.f6111z;
            this.D = 1;
            if (MonotonicFrameClockKt.b(r5, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.b(obj);
            throw new KotlinNothingValueException();
        }
        MutableSharedFlow mutableSharedFlow = this.E;
        final ComposeInputMethodManager composeInputMethodManager = this.F;
        AnonymousClass2 r1 = new FlowCollector() {
            /* renamed from: a */
            public final Object c(Unit unit, Continuation continuation) {
                composeInputMethodManager.f();
                return Unit.f40552a;
            }
        };
        this.D = 2;
        if (mutableSharedFlow.a(r1, this) == f2) {
            return f2;
        }
        throw new KotlinNothingValueException();
    }
}
