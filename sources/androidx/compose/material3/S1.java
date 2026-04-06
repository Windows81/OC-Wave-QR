package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class S1 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10751A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f10752z;

    public /* synthetic */ S1(LazyListState lazyListState, CoroutineScope coroutineScope) {
        this.f10752z = lazyListState;
        this.f10751A = coroutineScope;
    }

    public final Object invoke() {
        return Boolean.valueOf(DateRangePickerKt.v(this.f10752z, this.f10751A));
    }
}
