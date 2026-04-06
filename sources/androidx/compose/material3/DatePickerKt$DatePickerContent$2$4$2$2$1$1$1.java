package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarMonth;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
public final class DatePickerKt$DatePickerContent$2$4$2$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LazyListState E;
    public final /* synthetic */ int F;
    public final /* synthetic */ IntRange G;
    public final /* synthetic */ CalendarMonth H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(LazyListState lazyListState, int i2, IntRange intRange, CalendarMonth calendarMonth, Continuation continuation) {
        super(2, continuation);
        this.E = lazyListState;
        this.F = i2;
        this.G = intRange;
        this.H = calendarMonth;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DatePickerKt$DatePickerContent$2$4$2$2$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            LazyListState lazyListState = this.E;
            this.D = 1;
            if (LazyListState.J(lazyListState, (((this.F - this.G.n()) * 12) + this.H.c()) - 1, 0, this, 2, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
