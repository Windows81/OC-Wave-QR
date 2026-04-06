package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LayoutKt$MultiMeasureLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f17055A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MeasurePolicy f17056B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f17057z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(Modifier modifier, Function2 function2, MeasurePolicy measurePolicy, int i2, int i3) {
        super(2);
        this.f17057z = modifier;
        this.f17055A = function2;
        this.f17056B = measurePolicy;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        LayoutKt.a(this.f17057z, this.f17055A, this.f17056B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
