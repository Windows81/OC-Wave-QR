package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ UriHandler f17727A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f17728B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Owner f17729z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(Owner owner, UriHandler uriHandler, Function2 function2, int i2) {
        super(2);
        this.f17729z = owner;
        this.f17727A = uriHandler;
        this.f17728B = function2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        CompositionLocalsKt.a(this.f17729z, this.f17727A, this.f17728B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
