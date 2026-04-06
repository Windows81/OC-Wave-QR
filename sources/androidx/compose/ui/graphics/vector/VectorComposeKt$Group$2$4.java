package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Group$2$4 extends Lambda implements Function2<GroupComponent, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Group$2$4 f16628z = new VectorComposeKt$Group$2$4();

    public VectorComposeKt$Group$2$4() {
        super(2);
    }

    public final void b(GroupComponent groupComponent, float f2) {
        groupComponent.t(f2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((GroupComponent) obj, ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
