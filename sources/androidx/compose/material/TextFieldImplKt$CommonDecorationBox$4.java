package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f8783A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8784B;
    public final /* synthetic */ VisualTransformation C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ InteractionSource K;
    public final /* synthetic */ PaddingValues L;
    public final /* synthetic */ Shape M;
    public final /* synthetic */ TextFieldColors N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldType f8785z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$4(TextFieldType textFieldType, String str, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, Function2 function26, int i2, int i3) {
        super(2);
        this.f8785z = textFieldType;
        this.f8783A = str;
        this.f8784B = function2;
        this.C = visualTransformation;
        this.D = function22;
        this.E = function23;
        this.F = function24;
        this.G = function25;
        this.H = z2;
        this.I = z3;
        this.J = z4;
        this.K = interactionSource;
        this.L = paddingValues;
        this.M = shape;
        this.N = textFieldColors;
        this.O = function26;
        this.P = i2;
        this.Q = i3;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldType textFieldType = this.f8785z;
        TextFieldType textFieldType2 = textFieldType;
        TextFieldImplKt.a(textFieldType2, this.f8783A, this.f8784B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, composer2, RecomposeScopeImplKt.a(this.P | 1), RecomposeScopeImplKt.a(this.Q));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
