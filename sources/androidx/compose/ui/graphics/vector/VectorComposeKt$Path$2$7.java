package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$2$7 extends Lambda implements Function2<PathComponent, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$7 f16649z = new VectorComposeKt$Path$2$7();

    public VectorComposeKt$Path$2$7() {
        super(2);
    }

    public final void b(PathComponent pathComponent, float f2) {
        pathComponent.n(f2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PathComponent) obj, ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
