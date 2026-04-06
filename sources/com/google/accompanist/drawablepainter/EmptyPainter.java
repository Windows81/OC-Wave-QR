package com.google.accompanist.drawablepainter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EmptyPainter extends Painter {
    public static final EmptyPainter F = new EmptyPainter();

    public long k() {
        return Size.f15876b.a();
    }

    public void m(DrawScope drawScope) {
        Intrinsics.i(drawScope, "<this>");
    }
}
