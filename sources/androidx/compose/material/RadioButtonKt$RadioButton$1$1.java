package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RadioButtonKt$RadioButton$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f8226A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8227z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$1$1(State state, State state2) {
        super(1);
        this.f8227z = state;
        this.f8226A = state2;
    }

    public final void b(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        float B1 = drawScope2.B1(RadioButtonKt.f8225f);
        float f2 = B1 / ((float) 2);
        DrawScope.k2(drawScope, ((Color) this.f8227z.getValue()).v(), drawScope2.B1(RadioButtonKt.f8223d) - f2, 0, 0.0f, new Stroke(B1, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 108, (Object) null);
        if (Dp.l(((Dp) this.f8226A.getValue()).t(), Dp.m((float) 0)) > 0) {
            DrawScope.k2(drawScope, ((Color) this.f8227z.getValue()).v(), drawScope2.B1(((Dp) this.f8226A.getValue()).t()) - f2, 0, 0.0f, Fill.f16295a, (ColorFilter) null, 0, 108, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
