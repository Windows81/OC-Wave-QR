package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.o7  reason: case insensitive filesystem */
public final /* synthetic */ class C0206o7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12557A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12558B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12559z;

    public /* synthetic */ C0206o7(TextStyle textStyle, Function2 function2, int i2) {
        this.f12559z = textStyle;
        this.f12557A = function2;
        this.f12558B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TextKt.i(this.f12559z, this.f12557A, this.f12558B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
