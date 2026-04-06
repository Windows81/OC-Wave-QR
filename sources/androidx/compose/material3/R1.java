package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class R1 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10681A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f10682z;

    public /* synthetic */ R1(LazyListState lazyListState, CoroutineScope coroutineScope) {
        this.f10682z = lazyListState;
        this.f10681A = coroutineScope;
    }

    public final Object invoke() {
        return Boolean.valueOf(DateRangePickerKt.u(this.f10682z, this.f10681A));
    }
}
