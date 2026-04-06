package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerStateKt$rememberPagerState$1$1 extends Lambda implements Function0<DefaultPagerState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f5396A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f5397B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f5398z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$1$1(int i2, float f2, Function0 function0) {
        super(0);
        this.f5398z = i2;
        this.f5396A = f2;
        this.f5397B = function0;
    }

    /* renamed from: b */
    public final DefaultPagerState invoke() {
        return new DefaultPagerState(this.f5398z, this.f5396A, this.f5397B);
    }
}
