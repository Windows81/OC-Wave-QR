package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CacheDrawScopeDragShadowCallback$cachePicture$1$2 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CacheDrawScopeDragShadowCallback f3293z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawScopeDragShadowCallback$cachePicture$1$2(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback) {
        super(1);
        this.f3293z = cacheDrawScopeDragShadowCallback;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        GraphicsLayer a2 = this.f3293z.f3291a;
        Intrinsics.f(a2);
        GraphicsLayerKt.a(contentDrawScope, a2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
