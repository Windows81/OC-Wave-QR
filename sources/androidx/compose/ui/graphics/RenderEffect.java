package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class RenderEffect {

    /* renamed from: a  reason: collision with root package name */
    public android.graphics.RenderEffect f16109a;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final android.graphics.RenderEffect a() {
        android.graphics.RenderEffect renderEffect = this.f16109a;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect b2 = b();
        this.f16109a = b2;
        return b2;
    }

    public abstract android.graphics.RenderEffect b();

    public RenderEffect() {
    }
}
