package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AnchoredDraggableKt$animateTo$2$2 extends Lambda implements Function2<Float, Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3341A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f3342z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2$2(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
        super(2);
        this.f3342z = anchoredDragScope;
        this.f3341A = floatRef;
    }

    public final void b(float f2, float f3) {
        this.f3342z.a(f2, f3);
        this.f3341A.f40905z = f2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
