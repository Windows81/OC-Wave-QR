package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContentTransform {

    /* renamed from: a  reason: collision with root package name */
    public final EnterTransition f2188a;

    /* renamed from: b  reason: collision with root package name */
    public final ExitTransition f2189b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f2190c;

    /* renamed from: d  reason: collision with root package name */
    public SizeTransform f2191d;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f2, SizeTransform sizeTransform) {
        this.f2188a = enterTransition;
        this.f2189b = exitTransition;
        this.f2190c = PrimitiveSnapshotStateKt.a(f2);
        this.f2191d = sizeTransform;
    }

    public final ExitTransition a() {
        return this.f2189b;
    }

    public final SizeTransform b() {
        return this.f2191d;
    }

    public final EnterTransition c() {
        return this.f2188a;
    }

    public final float d() {
        return this.f2190c.c();
    }

    public final void e(SizeTransform sizeTransform) {
        this.f2191d = sizeTransform;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f2, SizeTransform sizeTransform, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransition, exitTransition, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? AnimatedContentKt.d(false, (Function2) null, 3, (Object) null) : sizeTransform);
    }
}
