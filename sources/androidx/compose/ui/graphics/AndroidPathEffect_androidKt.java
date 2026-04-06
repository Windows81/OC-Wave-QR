package androidx.compose.ui.graphics;

import android.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidPathEffect_androidKt {
    public static final PathEffect a(PathEffect pathEffect) {
        Intrinsics.g(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).a();
    }
}
