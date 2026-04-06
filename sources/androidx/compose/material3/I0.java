package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class I0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f10100A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f10101B;
    public final /* synthetic */ DatePickerFormatter C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ long E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerDefaults f10102z;

    public /* synthetic */ I0(DatePickerDefaults datePickerDefaults, Long l2, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, int i3, int i4) {
        this.f10102z = datePickerDefaults;
        this.f10100A = l2;
        this.f10101B = i2;
        this.C = datePickerFormatter;
        this.D = modifier;
        this.E = j2;
        this.F = i3;
        this.G = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerDefaults.f(this.f10102z, this.f10100A, this.f10101B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
