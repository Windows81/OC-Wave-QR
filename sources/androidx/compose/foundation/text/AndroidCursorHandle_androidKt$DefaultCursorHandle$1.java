package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$DefaultCursorHandle$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5468A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f5469B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f5470z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$DefaultCursorHandle$1(Modifier modifier, int i2, int i3) {
        super(2);
        this.f5470z = modifier;
        this.f5468A = i2;
        this.f5469B = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidCursorHandle_androidKt.b(this.f5470z, composer, RecomposeScopeImplKt.a(this.f5468A | 1), this.f5469B);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
