package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3333a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f3334b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function0 f3335c;

    public AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1(AnchoredDraggableState anchoredDraggableState, Function1 function1, Function0 function0) {
        this.f3333a = anchoredDraggableState;
        this.f3334b = function1;
        this.f3335c = function0;
    }

    public float a(float f2, float f3) {
        return 0.0f;
    }

    public float b(float f2) {
        float A2 = this.f3333a.A();
        return this.f3333a.l().c(AnchoredDraggableKt.p(this.f3333a.l(), A2, f2, this.f3334b, this.f3335c)) - A2;
    }
}
