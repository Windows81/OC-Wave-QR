package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridStateKt$rememberLazyGridState$1$1 extends Lambda implements Function0<LazyGridState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4760A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f4761z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridStateKt$rememberLazyGridState$1$1(int i2, int i3) {
        super(0);
        this.f4761z = i2;
        this.f4760A = i3;
    }

    /* renamed from: b */
    public final LazyGridState invoke() {
        return new LazyGridState(this.f4761z, this.f4760A);
    }
}
