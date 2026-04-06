package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$6$1$3$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f2036z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$3$1(Object obj) {
        super(1);
        this.f2036z = obj;
    }

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.d(obj, this.f2036z));
    }
}
