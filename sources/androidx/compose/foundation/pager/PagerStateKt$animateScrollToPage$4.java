package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class PagerStateKt$animateScrollToPage$4 extends Lambda implements Function2<Float, Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutScrollScope f5394A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f5395z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerStateKt$animateScrollToPage$4(Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope) {
        super(2);
        this.f5395z = floatRef;
        this.f5394A = lazyLayoutScrollScope;
    }

    public final void b(float f2, float f3) {
        this.f5395z.f40905z += this.f5394A.g(f2 - this.f5395z.f40905z);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
