package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class FocusFinderCompat_androidKt$findUserSetNextFocus$1 extends Lambda implements Function1<View, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f17774A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f17775z;

    /* renamed from: b */
    public final Boolean invoke(View view) {
        return Boolean.valueOf(FocusFinderCompat_androidKt.d(this.f17775z, view, view.getNextFocusForwardId()) == this.f17774A);
    }
}
