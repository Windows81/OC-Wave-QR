package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.p  reason: case insensitive filesystem */
public final /* synthetic */ class C0207p implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12563A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12564B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ TextStyle G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ TextStyle I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ Arrangement.Vertical K;
    public final /* synthetic */ Alignment.Horizontal L;
    public final /* synthetic */ int M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ Function2 P;
    public final /* synthetic */ float Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12565z;

    public /* synthetic */ C0207p(Modifier modifier, FloatProducer floatProducer, long j2, long j3, long j4, long j5, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Function0 function0, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, boolean z2, Function2 function23, Function2 function24, float f2, int i3, int i4) {
        this.f12565z = modifier;
        this.f12563A = floatProducer;
        this.f12564B = j2;
        this.C = j3;
        this.D = j4;
        this.E = j5;
        this.F = function2;
        this.G = textStyle;
        this.H = function22;
        this.I = textStyle2;
        this.J = function0;
        this.K = vertical;
        this.L = horizontal;
        this.M = i2;
        this.N = z2;
        this.O = function23;
        this.P = function24;
        this.Q = f2;
        this.R = i3;
        this.S = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return AppBarKt.C(this.f12565z, this.f12563A, this.f12564B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (Composer) obj, intValue);
    }
}
