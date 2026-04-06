package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnchoredDraggableState$Companion$Saver$8 extends Lambda implements Function1<Object, AnchoredDraggableState<Object>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f3379A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f3380B;
    public final /* synthetic */ DecayAnimationSpec C;
    public final /* synthetic */ Function1 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f3381z;

    /* renamed from: b */
    public final AnchoredDraggableState invoke(Object obj) {
        return AnchoredDraggableKt.b(obj, this.f3381z, this.f3379A, this.f3380B, this.C, this.D);
    }
}
