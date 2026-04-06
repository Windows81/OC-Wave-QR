package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
public final class DatePickerKt$DatePickerContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LazyListState E;
    public final /* synthetic */ int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$1(LazyListState lazyListState, int i2, Continuation continuation) {
        super(2, continuation);
        this.E = lazyListState;
        this.F = i2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DatePickerKt$DatePickerContent$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DatePickerKt$DatePickerContent$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        int i2;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.D;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!this.E.a() && this.E.s() != (i2 = this.F)) {
                LazyListState lazyListState = this.E;
                this.D = 1;
                if (LazyListState.J(lazyListState, i2, 0, this, 2, (Object) null) == f2) {
                    return f2;
                }
            }
        } else if (i3 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
