package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwitchKt$Switch$anchoredDraggableState$1$2 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public static final SwitchKt$Switch$anchoredDraggableState$1$2 f8635z = new SwitchKt$Switch$anchoredDraggableState$1$2();

    public SwitchKt$Switch$anchoredDraggableState$1$2() {
        super(1);
    }

    public final Float b(float f2) {
        return Float.valueOf(f2 * 0.7f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
