package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextKt$Text$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8868A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8869B;
    public final /* synthetic */ long C;
    public final /* synthetic */ FontStyle D;
    public final /* synthetic */ FontWeight E;
    public final /* synthetic */ FontFamily F;
    public final /* synthetic */ long G;
    public final /* synthetic */ TextDecoration H;
    public final /* synthetic */ TextAlign I;
    public final /* synthetic */ long J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ Function1 O;
    public final /* synthetic */ TextStyle P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8870z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$Text$2(String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1 function1, TextStyle textStyle, int i5, int i6, int i7) {
        super(2);
        this.f8870z = str;
        this.f8868A = modifier;
        this.f8869B = j2;
        this.C = j3;
        this.D = fontStyle;
        this.E = fontWeight;
        this.F = fontFamily;
        this.G = j4;
        this.H = textDecoration;
        this.I = textAlign;
        this.J = j5;
        this.K = i2;
        this.L = z2;
        this.M = i3;
        this.N = i4;
        this.O = function1;
        this.P = textStyle;
        this.Q = i5;
        this.R = i6;
        this.S = i7;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        String str = this.f8870z;
        String str2 = str;
        TextKt.c(str2, this.f8868A, this.f8869B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, composer2, RecomposeScopeImplKt.a(this.Q | 1), RecomposeScopeImplKt.a(this.R), this.S);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
