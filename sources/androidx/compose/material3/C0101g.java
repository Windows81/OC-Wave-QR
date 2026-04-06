package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0101g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12043A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12044B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Shape G;
    public final /* synthetic */ long H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;
    public final /* synthetic */ float L;
    public final /* synthetic */ DialogProperties M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12045z;

    public /* synthetic */ C0101g(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, int i2, int i3, int i4) {
        this.f12045z = function0;
        this.f12043A = function2;
        this.f12044B = modifier;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = function25;
        this.G = shape;
        this.H = j2;
        this.I = j3;
        this.J = j4;
        this.K = j5;
        this.L = f2;
        this.M = dialogProperties;
        this.N = i2;
        this.O = i3;
        this.P = i4;
    }

    public final Object m(Object obj, Object obj2) {
        Function0 function0 = this.f12045z;
        Function2 function2 = this.f12043A;
        return AndroidAlertDialog_androidKt.c(function0, function2, this.f12044B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Composer) obj, ((Integer) obj2).intValue());
    }
}
