package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.b7  reason: case insensitive filesystem */
public final /* synthetic */ class C0060b7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f11875A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11876B;
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
    public final /* synthetic */ Shape O;
    public final /* synthetic */ TextFieldColors P;
    public final /* synthetic */ PaddingValues Q;
    public final /* synthetic */ Function2 R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;
    public final /* synthetic */ int U;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f11877z;

    public /* synthetic */ C0060b7(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i2, int i3, int i4) {
        this.f11877z = textFieldDefaults;
        this.f11875A = str;
        this.f11876B = function2;
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
        this.O = shape;
        this.P = textFieldColors;
        this.Q = paddingValues;
        this.R = function29;
        this.S = i2;
        this.T = i3;
        this.U = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return TextFieldDefaults.f(this.f11877z, this.f11875A, this.f11876B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, (Composer) obj, intValue);
    }
}
