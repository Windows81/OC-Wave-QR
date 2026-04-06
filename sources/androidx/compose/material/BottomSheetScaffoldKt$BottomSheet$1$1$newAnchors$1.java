package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7364A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7365B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f7366z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1(int i2, float f2, float f3) {
        super(1);
        this.f7366z = i2;
        this.f7364A = f2;
        this.f7365B = f3;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(BottomSheetValue.Collapsed, ((float) this.f7366z) - this.f7364A);
        float f2 = this.f7365B;
        if (f2 > 0.0f && f2 != this.f7364A) {
            draggableAnchorsConfig.a(BottomSheetValue.Expanded, ((float) this.f7366z) - f2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
