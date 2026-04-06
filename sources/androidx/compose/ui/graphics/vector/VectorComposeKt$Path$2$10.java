package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeCap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$2$10 extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$10 f16639z = new VectorComposeKt$Path$2$10();

    public VectorComposeKt$Path$2$10() {
        super(2);
    }

    public final void b(PathComponent pathComponent, int i2) {
        pathComponent.o(i2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PathComponent) obj, ((StrokeCap) obj2).j());
        return Unit.f40552a;
    }
}
