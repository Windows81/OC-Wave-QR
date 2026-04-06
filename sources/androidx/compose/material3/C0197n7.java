package androidx.compose.material3;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.n7  reason: case insensitive filesystem */
public final /* synthetic */ class C0197n7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f12544A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12545B;
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
    public final /* synthetic */ Map P;
    public final /* synthetic */ Function1 Q;
    public final /* synthetic */ TextStyle R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;
    public final /* synthetic */ int U;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f12546z;

    public /* synthetic */ C0197n7(AnnotatedString annotatedString, Modifier modifier, long j2, TextAutoSize textAutoSize, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Map map, Function1 function1, TextStyle textStyle, int i5, int i6, int i7) {
        this.f12546z = annotatedString;
        this.f12544A = modifier;
        this.f12545B = j2;
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
        this.P = map;
        this.Q = function1;
        this.R = textStyle;
        this.S = i5;
        this.T = i6;
        this.U = i7;
    }

    public final Object m(Object obj, Object obj2) {
        AnnotatedString annotatedString = this.f12546z;
        Modifier modifier = this.f12544A;
        return TextKt.n(annotatedString, modifier, this.f12545B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, (Composer) obj, ((Integer) obj2).intValue());
    }
}
