package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$2$9 extends Lambda implements Function2<PathComponent, StrokeJoin, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$9 f16651z = new VectorComposeKt$Path$2$9();

    public VectorComposeKt$Path$2$9() {
        super(2);
    }

    public final void b(PathComponent pathComponent, int i2) {
        pathComponent.p(i2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PathComponent) obj, ((StrokeJoin) obj2).j());
        return Unit.f40552a;
    }
}
