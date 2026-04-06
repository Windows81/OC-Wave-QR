package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScaffoldKt$Scaffold$child$1$1$1 extends Lambda implements Function1<WindowInsets, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f8268A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f8269z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$child$1$1$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        super(1);
        this.f8269z = mutableWindowInsets;
        this.f8268A = windowInsets;
    }

    public final void b(WindowInsets windowInsets) {
        this.f8269z.f(WindowInsetsKt.i(this.f8268A, windowInsets));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((WindowInsets) obj);
        return Unit.f40552a;
    }
}
