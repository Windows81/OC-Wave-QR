package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.u5  reason: case insensitive filesystem */
public final /* synthetic */ class C0258u5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f14421A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f14422z;

    public /* synthetic */ C0258u5(Function1 function1, String str) {
        this.f14422z = function1;
        this.f14421A = str;
    }

    public final Object invoke(Object obj) {
        return SearchBarDefaults.h(this.f14422z, this.f14421A, (KeyboardActionScope) obj);
    }
}
