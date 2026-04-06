package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class E7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f9906A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f9907z;

    public /* synthetic */ E7(Modifier modifier, int i2) {
        this.f9907z = modifier;
        this.f9906A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerKt.H(this.f9907z, this.f9906A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
