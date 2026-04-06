package androidx.compose.material3;

import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
final class TimePickerKt$TimePicker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Ref E;
    public final /* synthetic */ AnalogTimePickerState F;
    public final /* synthetic */ TimePickerState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePicker$1$1(Ref ref, AnalogTimePickerState analogTimePickerState, TimePickerState timePickerState, Continuation continuation) {
        super(2, continuation);
        this.E = ref;
        this.F = analogTimePickerState;
        this.G = timePickerState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TimePickerKt$TimePicker$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TimePickerKt$TimePicker$1$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (Intrinsics.d(this.E.a(), Boxing.a(true))) {
                this.F.a(this.G.g());
                this.F.b(this.G.c());
            }
            this.E.b(Boxing.a(true));
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
