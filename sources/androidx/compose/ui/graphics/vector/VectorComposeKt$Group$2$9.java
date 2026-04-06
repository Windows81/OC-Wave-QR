package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Group$2$9 extends Lambda implements Function2<GroupComponent, List<? extends PathNode>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Group$2$9 f16633z = new VectorComposeKt$Group$2$9();

    public VectorComposeKt$Group$2$9() {
        super(2);
    }

    public final void b(GroupComponent groupComponent, List list) {
        groupComponent.q(list);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((GroupComponent) obj, (List) obj2);
        return Unit.f40552a;
    }
}
