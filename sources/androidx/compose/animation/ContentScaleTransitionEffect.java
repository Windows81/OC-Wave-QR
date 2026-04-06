package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContentScaleTransitionEffect extends TransitionEffect {

    /* renamed from: c  reason: collision with root package name */
    public static final Key f2185c = new Key((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ContentScale f2186a;

    /* renamed from: b  reason: collision with root package name */
    public final Alignment f2187b;

    @Metadata
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ContentScaleTransitionEffect contentScaleTransitionEffect = (ContentScaleTransitionEffect) obj;
        return Intrinsics.d(this.f2186a, contentScaleTransitionEffect.f2186a) && Intrinsics.d(this.f2187b, contentScaleTransitionEffect.f2187b);
    }

    public int hashCode() {
        return (this.f2186a.hashCode() * 31) + this.f2187b.hashCode();
    }

    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.f2186a + ", alignment=" + this.f2187b + ')';
    }
}
