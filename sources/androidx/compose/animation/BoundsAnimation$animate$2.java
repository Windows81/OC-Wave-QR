package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoundsAnimation$animate$2 extends Lambda implements Function1<Boolean, Rect> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Rect f2158A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Rect f2159B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoundsAnimation f2160z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundsAnimation$animate$2(BoundsAnimation boundsAnimation, Rect rect, Rect rect2) {
        super(1);
        this.f2160z = boundsAnimation;
        this.f2158A = rect;
        this.f2159B = rect2;
    }

    public final Rect b(boolean z2) {
        return z2 == ((Boolean) this.f2160z.g().q()).booleanValue() ? this.f2158A : this.f2159B;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Boolean) obj).booleanValue());
    }
}
