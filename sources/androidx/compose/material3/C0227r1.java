package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.r1  reason: case insensitive filesystem */
public final /* synthetic */ class C0227r1 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f12663A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyListState f12664B;
    public final /* synthetic */ IntRange C;
    public final /* synthetic */ CalendarMonth D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12665z;

    public /* synthetic */ C0227r1(CoroutineScope coroutineScope, MutableState mutableState, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth) {
        this.f12665z = coroutineScope;
        this.f12663A = mutableState;
        this.f12664B = lazyListState;
        this.C = intRange;
        this.D = calendarMonth;
    }

    public final Object invoke(Object obj) {
        return DatePickerKt$DatePickerContent$2$4$2.g(this.f12665z, this.f12663A, this.f12664B, this.C, this.D, ((Integer) obj).intValue());
    }
}
