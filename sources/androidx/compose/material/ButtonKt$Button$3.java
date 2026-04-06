package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ButtonKt$Button$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7441A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7442B;
    public final /* synthetic */ MutableInteractionSource C;
    public final /* synthetic */ ButtonElevation D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ BorderStroke F;
    public final /* synthetic */ ButtonColors G;
    public final /* synthetic */ PaddingValues H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7443z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$3(Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 function3, int i2, int i3) {
        super(2);
        this.f7443z = function0;
        this.f7441A = modifier;
        this.f7442B = z2;
        this.C = mutableInteractionSource;
        this.D = buttonElevation;
        this.E = shape;
        this.F = borderStroke;
        this.G = buttonColors;
        this.H = paddingValues;
        this.I = function3;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        ButtonKt.a(this.f7443z, this.f7441A, this.f7442B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
