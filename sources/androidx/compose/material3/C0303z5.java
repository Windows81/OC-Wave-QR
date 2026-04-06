package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.MutableWindowInsets;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.z5  reason: case insensitive filesystem */
public final /* synthetic */ class C0303z5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f14517A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f14518z;

    public /* synthetic */ C0303z5(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        this.f14518z = mutableWindowInsets;
        this.f14517A = windowInsets;
    }

    public final Object invoke(Object obj) {
        return SearchBarKt.n(this.f14518z, this.f14517A, (WindowInsets) obj);
    }
}
