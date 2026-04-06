package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata
public final class DrawablePainterKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f23813a = LazyKt.a(LazyThreadSafetyMode.NONE, DrawablePainterKt$MAIN_HANDLER$2.f23814z);

    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? Size.f15876b.a() : SizeKt.a((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
    }

    public static final Handler d() {
        return (Handler) f23813a.getValue();
    }
}
