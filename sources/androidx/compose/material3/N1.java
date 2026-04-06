package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class N1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f10386A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Long f10387B;
    public final /* synthetic */ int C;
    public final /* synthetic */ DatePickerFormatter D;
    public final /* synthetic */ Modifier E;
    public final /* synthetic */ long F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Locale L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f10388z;

    public /* synthetic */ N1(DateRangePickerDefaults dateRangePickerDefaults, Long l2, Long l3, int i2, DatePickerFormatter datePickerFormatter, Modifier modifier, long j2, String str, String str2, Function2 function2, Function2 function22, Function2 function23, Locale locale, int i3, int i4) {
        this.f10388z = dateRangePickerDefaults;
        this.f10386A = l2;
        this.f10387B = l3;
        this.C = i2;
        this.D = datePickerFormatter;
        this.E = modifier;
        this.F = j2;
        this.G = str;
        this.H = str2;
        this.I = function2;
        this.J = function22;
        this.K = function23;
        this.L = locale;
        this.M = i3;
        this.N = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return DateRangePickerDefaults.h(this.f10388z, this.f10386A, this.f10387B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Composer) obj, intValue);
    }
}
