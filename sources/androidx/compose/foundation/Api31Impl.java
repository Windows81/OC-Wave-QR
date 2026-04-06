package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.Metadata;

@Metadata
final class Api31Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api31Impl f2916a = new Api31Impl();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f2, float f3) {
        try {
            return edgeEffect.onPullDistance(f2, f3);
        } catch (Throwable unused) {
            edgeEffect.onPull(f2, f3);
            return 0.0f;
        }
    }
}
