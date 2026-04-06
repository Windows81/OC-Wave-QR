package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {

    /* renamed from: a  reason: collision with root package name */
    public final ContentScale f2300a;

    /* renamed from: b  reason: collision with root package name */
    public final Alignment f2301b;

    public final Alignment a() {
        return this.f2301b;
    }

    public final ContentScale b() {
        return this.f2300a;
    }
}
