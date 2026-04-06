package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ComposeView extends AbstractComposeView {
    public final MutableState H;
    public boolean I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public void b(Composer composer, int i2) {
        composer.X(420213850);
        if (ComposerKt.P()) {
            ComposerKt.Y(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
        }
        Function2 function2 = (Function2) this.H.getValue();
        if (function2 == null) {
            composer.X(358356153);
        } else {
            composer.X(150107208);
            function2.m(composer, 0);
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }

    public final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.I = true;
        this.H.setValue(function2);
        if (isAttachedToWindow()) {
            e();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.H = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
