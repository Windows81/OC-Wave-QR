package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.y7  reason: case insensitive filesystem */
public final /* synthetic */ class C0296y7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f14499A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f14500B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f14501z;

    public /* synthetic */ C0296y7(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i2, boolean z2, int i3) {
        this.f14501z = modifier;
        this.f14499A = analogTimePickerState;
        this.f14500B = i2;
        this.C = z2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerKt.E(this.f14501z, this.f14499A, this.f14500B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
