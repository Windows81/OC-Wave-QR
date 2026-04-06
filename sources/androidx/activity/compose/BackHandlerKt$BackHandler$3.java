package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackHandlerKt$BackHandler$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f141A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f142B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f143z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$3(boolean z2, Function0 function0, int i2, int i3) {
        super(2);
        this.f143z = z2;
        this.f141A = function0;
        this.f142B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        BackHandlerKt.a(this.f143z, this.f141A, composer, RecomposeScopeImplKt.a(this.f142B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
