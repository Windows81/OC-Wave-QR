package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuScope$Content$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f3246A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f3247B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuScope f3248z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuScope$Content$2(ContextMenuScope contextMenuScope, ContextMenuColors contextMenuColors, int i2) {
        super(2);
        this.f3248z = contextMenuScope;
        this.f3246A = contextMenuColors;
        this.f3247B = i2;
    }

    public final void b(Composer composer, int i2) {
        this.f3248z.a(this.f3246A, composer, RecomposeScopeImplKt.a(this.f3247B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
