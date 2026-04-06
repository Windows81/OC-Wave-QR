package androidx.compose.material3;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.p7  reason: case insensitive filesystem */
public final /* synthetic */ class C0215p7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f12585A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12586B;
    public final /* synthetic */ TextAutoSize C;
    public final /* synthetic */ long D;
    public final /* synthetic */ FontStyle E;
    public final /* synthetic */ FontWeight F;
    public final /* synthetic */ FontFamily G;
    public final /* synthetic */ long H;
    public final /* synthetic */ TextDecoration I;
    public final /* synthetic */ TextAlign J;
    public final /* synthetic */ long K;
    public final /* synthetic */ int L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ Function1 P;
    public final /* synthetic */ TextStyle Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f12587z;

    public /* synthetic */ C0215p7(String str, Modifier modifier, long j2, TextAutoSize textAutoSize, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1 function1, TextStyle textStyle, int i5, int i6, int i7) {
        this.f12587z = str;
        this.f12585A = modifier;
        this.f12586B = j2;
        this.C = textAutoSize;
        this.D = j3;
        this.E = fontStyle;
        this.F = fontWeight;
        this.G = fontFamily;
        this.H = j4;
        this.I = textDecoration;
        this.J = textAlign;
        this.K = j5;
        this.L = i2;
        this.M = z2;
        this.N = i3;
        this.O = i4;
        this.P = function1;
        this.Q = textStyle;
        this.R = i5;
        this.S = i6;
        this.T = i7;
    }

    public final Object m(Object obj, Object obj2) {
        String str = this.f12587z;
        Modifier modifier = this.f12585A;
        return TextKt.l(str, modifier, this.f12586B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (Composer) obj, ((Integer) obj2).intValue());
    }
}
