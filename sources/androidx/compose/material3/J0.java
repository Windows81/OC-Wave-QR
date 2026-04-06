package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class J0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f10158A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f10159B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerDefaults f10160z;

    public /* synthetic */ J0(DatePickerDefaults datePickerDefaults, int i2, Modifier modifier, long j2, int i3, int i4) {
        this.f10160z = datePickerDefaults;
        this.f10158A = i2;
        this.f10159B = modifier;
        this.C = j2;
        this.D = i3;
        this.E = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerDefaults.h(this.f10160z, this.f10158A, this.f10159B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
