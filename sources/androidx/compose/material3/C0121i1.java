package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.i1  reason: case insensitive filesystem */
public final /* synthetic */ class C0121i1 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f12080A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12081z;

    public /* synthetic */ C0121i1(CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.f12081z = coroutineScope;
        this.f12080A = lazyListState;
    }

    public final Object invoke() {
        return DatePickerKt.H(this.f12081z, this.f12080A);
    }
}
