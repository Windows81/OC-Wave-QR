package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$2$8 extends Lambda implements Function2<PathComponent, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$8 f16650z = new VectorComposeKt$Path$2$8();

    public VectorComposeKt$Path$2$8() {
        super(2);
    }

    public final void b(PathComponent pathComponent, float f2) {
        pathComponent.r(f2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PathComponent) obj, ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
