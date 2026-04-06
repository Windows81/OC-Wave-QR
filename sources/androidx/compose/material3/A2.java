package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class A2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f9106A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9107B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuDefaults f9108z;

    public /* synthetic */ A2(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z2, Modifier modifier, int i2, int i3) {
        this.f9108z = exposedDropdownMenuDefaults;
        this.f9106A = z2;
        this.f9107B = modifier;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ExposedDropdownMenuDefaults.c(this.f9108z, this.f9106A, this.f9107B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
