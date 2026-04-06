package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextSelectionColorsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7036a = CompositionLocalKt.h((SnapshotMutationPolicy) null, TextSelectionColorsKt$LocalTextSelectionColors$1.f7039z, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final long f7037b;

    /* renamed from: c  reason: collision with root package name */
    public static final TextSelectionColors f7038c;

    static {
        long d2 = ColorKt.d(4282550004L);
        f7037b = d2;
        f7038c = new TextSelectionColors(d2, Color.l(d2, 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal b() {
        return f7036a;
    }
}
