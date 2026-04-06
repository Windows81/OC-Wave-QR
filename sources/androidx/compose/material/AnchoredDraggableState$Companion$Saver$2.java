package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnchoredDraggableState$Companion$Saver$2 extends Lambda implements Function1<Object, AnchoredDraggableState<Object>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7104A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7105B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f7106z;

    /* renamed from: b */
    public final AnchoredDraggableState invoke(Object obj) {
        return new AnchoredDraggableState(obj, this.f7106z, this.f7104A, this.f7105B, this.C);
    }
}
