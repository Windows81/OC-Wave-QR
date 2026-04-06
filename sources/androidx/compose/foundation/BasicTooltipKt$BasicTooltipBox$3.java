package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTooltipKt$BasicTooltipBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f2936A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2937B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f2938z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$BasicTooltipBox$3(PopupPositionProvider popupPositionProvider, Function2 function2, BasicTooltipState basicTooltipState, Modifier modifier, boolean z2, boolean z3, Function2 function22, int i2, int i3) {
        super(2);
        this.f2938z = popupPositionProvider;
        this.f2936A = function2;
        this.f2937B = basicTooltipState;
        this.C = modifier;
        this.D = z2;
        this.E = z3;
        this.F = function22;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        BasicTooltipKt.a(this.f2938z, this.f2936A, this.f2937B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
