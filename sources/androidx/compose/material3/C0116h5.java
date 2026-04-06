package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.h5  reason: case insensitive filesystem */
public final /* synthetic */ class C0116h5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f12065A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12066B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12067z;

    public /* synthetic */ C0116h5(Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4) {
        this.f12067z = modifier;
        this.f12065A = j2;
        this.f12066B = f2;
        this.C = j3;
        this.D = i2;
        this.E = f3;
        this.F = i3;
        this.G = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return ProgressIndicatorKt.q(this.f12067z, this.f12065A, this.f12066B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
