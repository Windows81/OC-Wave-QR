package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicSecureTextFieldKt$DisableCutCopy$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5498A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f5499z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$DisableCutCopy$1(Function2 function2, int i2) {
        super(2);
        this.f5499z = function2;
        this.f5498A = i2;
    }

    public final void b(Composer composer, int i2) {
        BasicSecureTextFieldKt.e(this.f5499z, composer, RecomposeScopeImplKt.a(this.f5498A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
