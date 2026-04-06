package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class K5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f10189A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonDefaults f10190z;

    public /* synthetic */ K5(SegmentedButtonDefaults segmentedButtonDefaults, int i2) {
        this.f10190z = segmentedButtonDefaults;
        this.f10189A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SegmentedButtonDefaults.d(this.f10190z, this.f10189A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
