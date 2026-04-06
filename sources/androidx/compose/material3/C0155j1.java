package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.j1  reason: case insensitive filesystem */
public final /* synthetic */ class C0155j1 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f12471A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12472z;

    public /* synthetic */ C0155j1(CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.f12472z = coroutineScope;
        this.f12471A = lazyListState;
    }

    public final Object invoke() {
        return DatePickerKt.I(this.f12472z, this.f12471A);
    }
}
