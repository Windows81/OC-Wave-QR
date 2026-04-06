package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.z7  reason: case insensitive filesystem */
public final /* synthetic */ class C0305z7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f14522A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f14523B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f14524z;

    public /* synthetic */ C0305z7(Modifier modifier, float f2, Function2 function2, int i2, int i3) {
        this.f14524z = modifier;
        this.f14522A = f2;
        this.f14523B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerKt.q(this.f14524z, this.f14522A, this.f14523B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
