package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawablePainter$callback$2 extends Lambda implements Function0<AnonymousClass1> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawablePainter f23811z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.f23811z = drawablePainter;
    }

    /* renamed from: b */
    public final AnonymousClass1 invoke() {
        final DrawablePainter drawablePainter = this.f23811z;
        return new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                Intrinsics.i(drawable, "d");
                DrawablePainter drawablePainter = drawablePainter;
                drawablePainter.u(drawablePainter.r() + 1);
                DrawablePainter drawablePainter2 = drawablePainter;
                drawablePainter2.v(DrawablePainterKt.c(drawablePainter2.s()));
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                Intrinsics.i(drawable, "d");
                Intrinsics.i(runnable, "what");
                DrawablePainterKt.d().postAtTime(runnable, j2);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                Intrinsics.i(drawable, "d");
                Intrinsics.i(runnable, "what");
                DrawablePainterKt.d().removeCallbacks(runnable);
            }
        };
    }
}
