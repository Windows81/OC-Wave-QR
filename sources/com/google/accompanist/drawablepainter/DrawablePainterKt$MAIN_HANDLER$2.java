package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawablePainterKt$MAIN_HANDLER$2 extends Lambda implements Function0<Handler> {

    /* renamed from: z  reason: collision with root package name */
    public static final DrawablePainterKt$MAIN_HANDLER$2 f23814z = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    /* renamed from: b */
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
