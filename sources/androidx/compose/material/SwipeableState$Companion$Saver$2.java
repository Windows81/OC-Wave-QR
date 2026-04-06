package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SwipeableState$Companion$Saver$2 extends Lambda implements Function1<Object, SwipeableState<Object>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8601A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f8602z;

    /* renamed from: b */
    public final SwipeableState invoke(Object obj) {
        return new SwipeableState(obj, this.f8602z, this.f8601A);
    }
}
