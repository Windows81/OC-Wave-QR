package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.d7  reason: case insensitive filesystem */
public final /* synthetic */ class C0080d7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11998A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11999B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults$decorator$2 f12000z;

    public /* synthetic */ C0080d7(TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2, Function2 function2, int i2) {
        this.f12000z = textFieldDefaults$decorator$2;
        this.f11998A = function2;
        this.f11999B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TextFieldDefaults$decorator$2.c(this.f12000z, this.f11998A, this.f11999B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
