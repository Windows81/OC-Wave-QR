package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {901}, m = "invokeSuspend")
public final class DateRangePickerKt$VerticalMonthsList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LazyListState E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ CalendarModel G;
    public final /* synthetic */ IntRange H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, Function1 function1, CalendarModel calendarModel, IntRange intRange, Continuation continuation) {
        super(2, continuation);
        this.E = lazyListState;
        this.F = function1;
        this.G = calendarModel;
        this.H = intRange;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            LazyListState lazyListState = this.E;
            Function1 function1 = this.F;
            CalendarModel calendarModel = this.G;
            IntRange intRange = this.H;
            this.D = 1;
            if (DatePickerKt.I0(lazyListState, function1, calendarModel, intRange, this) == f2) {
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
