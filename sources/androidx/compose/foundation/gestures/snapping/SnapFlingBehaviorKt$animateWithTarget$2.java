package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ScrollScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SnapFlingBehaviorKt$animateWithTarget$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3672A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3673B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f3674z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateWithTarget$2(float f2, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1 function1) {
        super(1);
        this.f3674z = f2;
        this.f3672A = floatRef;
        this.f3673B = scrollScope;
        this.C = function1;
    }

    public final void b(AnimationScope animationScope) {
        float f2;
        float e2 = SnapFlingBehaviorKt.l(((Number) animationScope.e()).floatValue(), this.f3674z);
        float f3 = e2 - this.f3672A.f40905z;
        if (ComposeFoundationFlags.f3044b) {
            try {
                f2 = this.f3673B.g(f3);
            } catch (CancellationException unused) {
                animationScope.a();
                f2 = 0.0f;
            }
        } else {
            f2 = this.f3673B.g(f3);
        }
        this.C.invoke(Float.valueOf(f2));
        if (Math.abs(f3 - f2) > 0.5f || e2 != ((Number) animationScope.e()).floatValue()) {
            animationScope.a();
        }
        this.f3672A.f40905z += f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
