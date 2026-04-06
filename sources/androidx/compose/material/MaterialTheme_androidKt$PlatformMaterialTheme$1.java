package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MaterialTheme_androidKt$PlatformMaterialTheme$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f7944A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7945z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialTheme_androidKt$PlatformMaterialTheme$1(Function2 function2, int i2) {
        super(2);
        this.f7945z = function2;
        this.f7944A = i2;
    }

    public final void b(Composer composer, int i2) {
        MaterialTheme_androidKt.a(this.f7945z, composer, RecomposeScopeImplKt.a(this.f7944A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
