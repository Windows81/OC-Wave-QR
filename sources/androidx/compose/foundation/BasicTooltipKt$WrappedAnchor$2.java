package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTooltipKt$WrappedAnchor$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2947A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f2948B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f2949z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$WrappedAnchor$2(boolean z2, BasicTooltipState basicTooltipState, Modifier modifier, Function2 function2, int i2, int i3) {
        super(2);
        this.f2949z = z2;
        this.f2947A = basicTooltipState;
        this.f2948B = modifier;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        BasicTooltipKt.c(this.f2949z, this.f2947A, this.f2948B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
