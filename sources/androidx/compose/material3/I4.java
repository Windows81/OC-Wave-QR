package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class I4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f10110A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f10111B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ VisualTransformation E;
    public final /* synthetic */ InteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ Function2 M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ TextFieldColors O;
    public final /* synthetic */ PaddingValues P;
    public final /* synthetic */ Function2 Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults f10112z;

    public /* synthetic */ I4(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i2, int i3, int i4) {
        this.f10112z = outlinedTextFieldDefaults;
        this.f10110A = str;
        this.f10111B = function2;
        this.C = z2;
        this.D = z3;
        this.E = visualTransformation;
        this.F = interactionSource;
        this.G = z4;
        this.H = function22;
        this.I = function23;
        this.J = function24;
        this.K = function25;
        this.L = function26;
        this.M = function27;
        this.N = function28;
        this.O = textFieldColors;
        this.P = paddingValues;
        this.Q = function29;
        this.R = i2;
        this.S = i3;
        this.T = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return OutlinedTextFieldDefaults.f(this.f10112z, this.f10110A, this.f10111B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (Composer) obj, intValue);
    }
}
