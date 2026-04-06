package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.f5  reason: case insensitive filesystem */
public final /* synthetic */ class C0098f5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f12035A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12036B;
    public final /* synthetic */ float C;
    public final /* synthetic */ long D;
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12037z;

    public /* synthetic */ C0098f5(Function0 function0, Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4) {
        this.f12037z = function0;
        this.f12035A = modifier;
        this.f12036B = j2;
        this.C = f2;
        this.D = j3;
        this.E = i2;
        this.F = f3;
        this.G = i3;
        this.H = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return ProgressIndicatorKt.u(this.f12037z, this.f12035A, this.f12036B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
