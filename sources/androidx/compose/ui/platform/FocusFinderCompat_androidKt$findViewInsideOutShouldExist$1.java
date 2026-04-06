package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1 extends Lambda implements Function1<View, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f17776z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1(int i2) {
        super(1);
        this.f17776z = i2;
    }

    /* renamed from: b */
    public final Boolean invoke(View view) {
        return Boolean.valueOf(view.getId() == this.f17776z);
    }
}
