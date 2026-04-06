package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class S implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12317A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12318B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f12319z;

    public /* synthetic */ S(long j2, TextStyle textStyle, Function2 function2, int i2) {
        this.f12319z = j2;
        this.f12317A = textStyle;
        this.f12318B = function2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ProvideContentColorTextStyleKt.c(this.f12319z, this.f12317A, this.f12318B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
