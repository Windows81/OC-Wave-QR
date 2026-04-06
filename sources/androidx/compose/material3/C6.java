package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9346B;
    public final /* synthetic */ TextStyle C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9347z;

    public /* synthetic */ C6(Function2 function2, Function2 function22, Function2 function23, TextStyle textStyle, long j2, long j3, int i2) {
        this.f9347z = function2;
        this.f9345A = function22;
        this.f9346B = function23;
        this.C = textStyle;
        this.D = j2;
        this.E = j3;
        this.F = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SnackbarKt.h(this.f9347z, this.f9345A, this.f9346B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
