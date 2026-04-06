package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class Q5 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f10646A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f10647z;

    public /* synthetic */ Q5(Density density, float f2) {
        this.f10647z = density;
        this.f10646A = f2;
    }

    public final Object invoke() {
        return Float.valueOf(SheetDefaultsKt.n(this.f10647z, this.f10646A));
    }
}
