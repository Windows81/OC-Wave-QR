package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CrossfadeKt$Crossfade$4$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2199z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition transition) {
        super(1);
        this.f2199z = transition;
    }

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!Intrinsics.d(obj, this.f2199z.q()));
    }
}
