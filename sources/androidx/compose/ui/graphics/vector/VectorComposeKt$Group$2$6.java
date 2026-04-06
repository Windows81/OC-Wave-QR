package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Group$2$6 extends Lambda implements Function2<GroupComponent, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Group$2$6 f16630z = new VectorComposeKt$Group$2$6();

    public VectorComposeKt$Group$2$6() {
        super(2);
    }

    public final void b(GroupComponent groupComponent, float f2) {
        groupComponent.w(f2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((GroupComponent) obj, ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
