package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.d6  reason: case insensitive filesystem */
public final /* synthetic */ class C0079d6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderState f11995A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f11996B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f11997z;

    public /* synthetic */ C0079d6(float f2, SliderState sliderState, long j2, long j3, long j4, long j5, float f3, float f4, Function2 function2, Function3 function3, boolean z2, boolean z3) {
        this.f11997z = f2;
        this.f11995A = sliderState;
        this.f11996B = j2;
        this.C = j3;
        this.D = j4;
        this.E = j5;
        this.F = f3;
        this.G = f4;
        this.H = function2;
        this.I = function3;
        this.J = z2;
        this.K = z3;
    }

    public final Object invoke(Object obj) {
        return SliderDefaults.B(this.f11997z, this.f11995A, this.f11996B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (DrawScope) obj);
    }
}
