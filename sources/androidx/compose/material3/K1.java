package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class K1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f10178A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f10179B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f10180z;

    public /* synthetic */ K1(DateRangePickerDefaults dateRangePickerDefaults, int i2, Modifier modifier, long j2, int i3, int i4) {
        this.f10180z = dateRangePickerDefaults;
        this.f10178A = i2;
        this.f10179B = modifier;
        this.C = j2;
        this.D = i3;
        this.E = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DateRangePickerDefaults.k(this.f10180z, this.f10178A, this.f10179B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
