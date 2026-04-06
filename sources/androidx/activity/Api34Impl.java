package androidx.activity;

import android.window.BackEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Api34Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api34Impl f36a = new Api34Impl();

    public final float a(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int b(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float c(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float d(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
