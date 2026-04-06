package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class DatePickerKt$updateDisplayedMonth$3<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f9768A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9769B;
    public final /* synthetic */ IntRange C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f9770z;

    public DatePickerKt$updateDisplayedMonth$3(LazyListState lazyListState, Function1 function1, CalendarModel calendarModel, IntRange intRange) {
        this.f9770z = lazyListState;
        this.f9768A = function1;
        this.f9769B = calendarModel;
        this.C = intRange;
    }

    public final Object a(int i2, Continuation continuation) {
        this.f9768A.invoke(Boxing.d(this.f9769B.g(this.C.n() + (this.f9770z.s() / 12), (this.f9770z.s() % 12) + 1).e()));
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object c(Object obj, Continuation continuation) {
        return a(((Number) obj).intValue(), continuation);
    }
}
