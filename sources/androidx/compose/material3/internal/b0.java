package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class b0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CharSequence f12395A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12396B;
    public final /* synthetic */ TextFieldLabelPosition C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ InteractionSource N;
    public final /* synthetic */ PaddingValues O;
    public final /* synthetic */ TextFieldColors P;
    public final /* synthetic */ Function2 Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldType f12397z;

    public /* synthetic */ b0(TextFieldType textFieldType, CharSequence charSequence, Function2 function2, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z2, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function28, int i2, int i3) {
        this.f12397z = textFieldType;
        this.f12395A = charSequence;
        this.f12396B = function2;
        this.C = textFieldLabelPosition;
        this.D = function3;
        this.E = function22;
        this.F = function23;
        this.G = function24;
        this.H = function25;
        this.I = function26;
        this.J = function27;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.N = interactionSource;
        this.O = paddingValues;
        this.P = textFieldColors;
        this.Q = function28;
        this.R = i2;
        this.S = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return TextFieldImplKt.r(this.f12397z, this.f12395A, this.f12396B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (Composer) obj, intValue);
    }
}
