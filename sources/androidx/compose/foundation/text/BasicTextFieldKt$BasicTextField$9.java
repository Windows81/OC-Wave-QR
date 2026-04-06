package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$9 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5558A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f5559B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ KeyboardOptions F;
    public final /* synthetic */ KeyboardActions G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ VisualTransformation K;
    public final /* synthetic */ Function1 L;
    public final /* synthetic */ MutableInteractionSource M;
    public final /* synthetic */ Brush N;
    public final /* synthetic */ Function3 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f5560z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$9(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, int i4, int i5, int i6) {
        super(2);
        this.f5560z = str;
        this.f5558A = function1;
        this.f5559B = modifier;
        this.C = z2;
        this.D = z3;
        this.E = textStyle;
        this.F = keyboardOptions;
        this.G = keyboardActions;
        this.H = z4;
        this.I = i2;
        this.J = i3;
        this.K = visualTransformation;
        this.L = function12;
        this.M = mutableInteractionSource;
        this.N = brush;
        this.O = function3;
        this.P = i4;
        this.Q = i5;
        this.R = i6;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        String str = this.f5560z;
        String str2 = str;
        BasicTextFieldKt.e(str2, this.f5558A, this.f5559B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, composer2, RecomposeScopeImplKt.a(this.P | 1), RecomposeScopeImplKt.a(this.Q), this.R);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
