package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17511z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f17511z = androidComposeView;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        final FocusDirection B0 = this.f17511z.B0(keyEvent);
        if (B0 == null || !KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a())) {
            return Boolean.FALSE;
        }
        Integer c2 = FocusInteropUtils_androidKt.c(B0.o());
        if (ComposeUiFlags.f15477e && this.f17511z.hasFocus() && c2 != null && this.f17511z.R0(B0.o())) {
            return Boolean.TRUE;
        }
        Rect h0 = this.f17511z.Q0();
        Boolean x2 = this.f17511z.getFocusOwner().x(B0.o(), h0, new AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1(B0));
        boolean z2 = true;
        if (x2 != null ? x2.booleanValue() : true) {
            return Boolean.TRUE;
        }
        if (!FocusOwnerImplKt.a(B0.o())) {
            return Boolean.FALSE;
        }
        if (c2 != null) {
            View X = this.f17511z.z0(c2.intValue());
            if (Intrinsics.d(X, this.f17511z)) {
                X = null;
            }
            if (X != null) {
                android.graphics.Rect a2 = h0 != null ? RectHelper_androidKt.a(h0) : null;
                if (a2 != null) {
                    X.getLocationInWindow(this.f17511z.w0);
                    int i2 = this.f17511z.w0[0];
                    int i3 = this.f17511z.w0[1];
                    AndroidComposeView androidComposeView = this.f17511z;
                    androidComposeView.getLocationInWindow(androidComposeView.w0);
                    a2.offset(this.f17511z.w0[0] - i2, this.f17511z.w0[1] - i3);
                    if (FocusInteropUtils_androidKt.b(X, c2, a2)) {
                        return Boolean.TRUE;
                    }
                } else {
                    throw new IllegalStateException("Invalid rect");
                }
            }
        }
        if (!this.f17511z.getFocusOwner().i(false, true, false, B0.o())) {
            return Boolean.TRUE;
        }
        Boolean x3 = this.f17511z.getFocusOwner().x(B0.o(), (Rect) null, new Function1<FocusTargetNode, Boolean>() {
            /* renamed from: b */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.c0(B0.o()));
            }
        });
        if (x3 != null) {
            z2 = x3.booleanValue();
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
