package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$2$6 extends Lambda implements Function2<PathComponent, Brush, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$6 f16648z = new VectorComposeKt$Path$2$6();

    public VectorComposeKt$Path$2$6() {
        super(2);
    }

    public final void b(PathComponent pathComponent, Brush brush) {
        pathComponent.m(brush);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PathComponent) obj, (Brush) obj2);
        return Unit.f40552a;
    }
}
