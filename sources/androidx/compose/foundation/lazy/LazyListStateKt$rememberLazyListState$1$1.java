package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListStateKt$rememberLazyListState$1$1 extends Lambda implements Function0<LazyListState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4501A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f4502z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListStateKt$rememberLazyListState$1$1(int i2, int i3) {
        super(0);
        this.f4502z = i2;
        this.f4501A = i3;
    }

    /* renamed from: b */
    public final LazyListState invoke() {
        return new LazyListState(this.f4502z, this.f4501A);
    }
}
