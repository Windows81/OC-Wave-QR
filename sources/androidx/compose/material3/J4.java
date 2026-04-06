package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class J4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10165A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f10166B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults$decorator$2 f10167z;

    public /* synthetic */ J4(OutlinedTextFieldDefaults$decorator$2 outlinedTextFieldDefaults$decorator$2, Function2 function2, int i2) {
        this.f10167z = outlinedTextFieldDefaults$decorator$2;
        this.f10165A = function2;
        this.f10166B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return OutlinedTextFieldDefaults$decorator$2.c(this.f10167z, this.f10165A, this.f10166B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
