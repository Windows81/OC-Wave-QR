package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwitchKt$Switch$anchoredDraggableState$1$1 extends Lambda implements Function1<DraggableAnchorsConfig<Boolean>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8633A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8634z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$anchoredDraggableState$1$1(float f2, float f3) {
        super(1);
        this.f8634z = f2;
        this.f8633A = f3;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(Boolean.FALSE, this.f8634z);
        draggableAnchorsConfig.a(Boolean.TRUE, this.f8633A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
