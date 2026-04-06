package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f10197A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Long f10198B;
    public final /* synthetic */ int C;
    public final /* synthetic */ DatePickerFormatter D;
    public final /* synthetic */ Modifier E;
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f10199z;

    public /* synthetic */ L1(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, int i3, int i4) {
        this.f10199z = dateRangePickerDefaults;
        this.f10197A = l2;
        this.f10198B = l3;
        this.C = i2;
        this.D = datePickerFormatter;
        this.E = modifier;
        this.F = j2;
        this.G = i3;
        this.H = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DateRangePickerDefaults.i(this.f10199z, this.f10197A, this.f10198B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
