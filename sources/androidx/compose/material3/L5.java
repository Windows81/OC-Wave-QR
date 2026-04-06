package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10206A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f10207B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonDefaults f10208z;

    public /* synthetic */ L5(SegmentedButtonDefaults segmentedButtonDefaults, boolean z2, Function2 function2, Function2 function22, int i2, int i3) {
        this.f10208z = segmentedButtonDefaults;
        this.f10206A = z2;
        this.f10207B = function2;
        this.C = function22;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SegmentedButtonDefaults.f(this.f10208z, this.f10206A, this.f10207B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
