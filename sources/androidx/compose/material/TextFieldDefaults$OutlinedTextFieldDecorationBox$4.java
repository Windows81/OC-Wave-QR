package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f8750A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8751B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ VisualTransformation E;
    public final /* synthetic */ InteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ TextFieldColors L;
    public final /* synthetic */ PaddingValues M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f8752z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$4(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, int i2, int i3, int i4) {
        super(2);
        this.f8752z = textFieldDefaults;
        this.f8750A = str;
        this.f8751B = function2;
        this.C = z2;
        this.D = z3;
        this.E = visualTransformation;
        this.F = interactionSource;
        this.G = z4;
        this.H = function22;
        this.I = function23;
        this.J = function24;
        this.K = function25;
        this.L = textFieldColors;
        this.M = paddingValues;
        this.N = function26;
        this.O = i2;
        this.P = i3;
        this.Q = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldDefaults textFieldDefaults = this.f8752z;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        textFieldDefaults2.b(this.f8750A, this.f8751B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, composer2, RecomposeScopeImplKt.a(this.O | 1), RecomposeScopeImplKt.a(this.P), this.Q);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
