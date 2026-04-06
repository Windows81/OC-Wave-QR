package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class W implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12375A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12376B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f12377z;

    public /* synthetic */ W(long j2, TextStyle textStyle, Function2 function2, int i2) {
        this.f12377z = j2;
        this.f12375A = textStyle;
        this.f12376B = function2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TextFieldImplKt.u(this.f12377z, this.f12375A, this.f12376B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
