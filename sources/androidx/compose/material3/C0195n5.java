package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.MutableWindowInsets;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.n5  reason: case insensitive filesystem */
public final /* synthetic */ class C0195n5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f12539A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f12540z;

    public /* synthetic */ C0195n5(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        this.f12540z = mutableWindowInsets;
        this.f12539A = windowInsets;
    }

    public final Object invoke(Object obj) {
        return ScaffoldKt.k(this.f12540z, this.f12539A, (WindowInsets) obj);
    }
}
