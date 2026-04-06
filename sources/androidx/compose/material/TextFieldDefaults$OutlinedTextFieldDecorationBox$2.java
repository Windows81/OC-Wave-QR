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
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f8744A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8745B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ VisualTransformation E;
    public final /* synthetic */ InteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Shape L;
    public final /* synthetic */ TextFieldColors M;
    public final /* synthetic */ PaddingValues N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f8746z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$2(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, int i2, int i3, int i4) {
        super(2);
        this.f8746z = textFieldDefaults;
        this.f8744A = str;
        this.f8745B = function2;
        this.C = z2;
        this.D = z3;
        this.E = visualTransformation;
        this.F = interactionSource;
        this.G = z4;
        this.H = function22;
        this.I = function23;
        this.J = function24;
        this.K = function25;
        this.L = shape;
        this.M = textFieldColors;
        this.N = paddingValues;
        this.O = function26;
        this.P = i2;
        this.Q = i3;
        this.R = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldDefaults textFieldDefaults = this.f8746z;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        textFieldDefaults2.c(this.f8744A, this.f8745B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, composer2, RecomposeScopeImplKt.a(this.P | 1), RecomposeScopeImplKt.a(this.Q), this.R);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
