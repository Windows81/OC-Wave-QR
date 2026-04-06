package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Api26Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api26Impl f35a = new Api26Impl();

    public final void a(Activity activity, Rect rect) {
        Intrinsics.i(activity, "activity");
        Intrinsics.i(rect, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect).build());
    }
}
