package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 extends Lambda implements Function1<CompositionLocalAccessorScope, BringIntoViewSpec> {

    /* renamed from: z  reason: collision with root package name */
    public static final BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 f3408z = new BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1();

    public BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1() {
        super(1);
    }

    /* renamed from: b */
    public final BringIntoViewSpec invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return !((Context) compositionLocalAccessorScope.H(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? BringIntoViewSpec.f3402a.b() : BringIntoViewSpec_androidKt.b();
    }
}
