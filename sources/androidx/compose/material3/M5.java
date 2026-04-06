package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class M5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10266A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f10267B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10268z;

    public /* synthetic */ M5(Function2 function2, Function2 function22, PaddingValues paddingValues, int i2) {
        this.f10268z = function2;
        this.f10266A = function22;
        this.f10267B = paddingValues;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SegmentedButtonKt.c(this.f10268z, this.f10266A, this.f10267B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
