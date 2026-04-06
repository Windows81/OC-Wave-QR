package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CacheDrawScope f15697A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CacheDrawModifierNodeImpl f15698z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl, CacheDrawScope cacheDrawScope) {
        super(0);
        this.f15698z = cacheDrawModifierNodeImpl;
        this.f15697A = cacheDrawScope;
    }

    public final void invoke() {
        this.f15698z.Z2().invoke(this.f15697A);
    }
}
