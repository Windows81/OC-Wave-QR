package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutKt$LazyLayout$1$2$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f4882A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4883z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, Function2 function2) {
        super(2);
        this.f4883z = lazyLayoutItemContentFactory;
        this.f4882A = function2;
    }

    public final MeasureResult b(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        return (MeasureResult) this.f4882A.m(new LazyLayoutMeasureScopeImpl(this.f4883z, subcomposeMeasureScope), Constraints.a(j2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SubcomposeMeasureScope) obj, ((Constraints) obj2).r());
    }
}
