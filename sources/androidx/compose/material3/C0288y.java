package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.y  reason: case insensitive filesystem */
public final /* synthetic */ class C0288y implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f14481A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f14482B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ TextStyle D;
    public final /* synthetic */ Alignment.Horizontal E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ WindowInsets I;
    public final /* synthetic */ TopAppBarColors J;
    public final /* synthetic */ TopAppBarScrollBehavior K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f14483z;

    public /* synthetic */ C0288y(Modifier modifier, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Alignment.Horizontal horizontal, Function2 function23, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4) {
        this.f14483z = modifier;
        this.f14481A = function2;
        this.f14482B = textStyle;
        this.C = function22;
        this.D = textStyle2;
        this.E = horizontal;
        this.F = function23;
        this.G = function3;
        this.H = f2;
        this.I = windowInsets;
        this.J = topAppBarColors;
        this.K = topAppBarScrollBehavior;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return AppBarKt.v(this.f14483z, this.f14481A, this.f14482B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Composer) obj, ((Integer) obj2).intValue());
    }
}
