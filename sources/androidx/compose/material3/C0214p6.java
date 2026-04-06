package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.p6  reason: case insensitive filesystem */
public final /* synthetic */ class C0214p6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f12582A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12583B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function3 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f12584z;

    public /* synthetic */ C0214p6(float f2, RangeSliderState rangeSliderState, long j2, long j3, long j4, long j5, float f3, float f4, Function2 function2, Function3 function3) {
        this.f12584z = f2;
        this.f12582A = rangeSliderState;
        this.f12583B = j2;
        this.C = j3;
        this.D = j4;
        this.E = j5;
        this.F = f3;
        this.G = f4;
        this.H = function2;
        this.I = function3;
    }

    public final Object invoke(Object obj) {
        return SliderDefaults.F(this.f12584z, this.f12582A, this.f12583B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (DrawScope) obj);
    }
}
