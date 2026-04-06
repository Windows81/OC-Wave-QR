package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Wrapper_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f17955a = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractApplier a(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    public static final Composition b(AndroidComposeView androidComposeView, CompositionContext compositionContext, Function2 function2) {
        if (InspectableValueKt.b() && androidComposeView.getTag(R.id.K) == null) {
            androidComposeView.setTag(R.id.K, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(R.id.L);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, CompositionKt.a(new UiApplier(androidComposeView.getRoot()), compositionContext));
            androidComposeView.getView().setTag(R.id.L, wrappedComposition);
        }
        wrappedComposition.p(function2);
        if (!Intrinsics.d(androidComposeView.getCoroutineContext(), compositionContext.j())) {
            androidComposeView.setCoroutineContext(compositionContext.j());
        }
        return wrappedComposition;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.Composition c(androidx.compose.ui.platform.AbstractComposeView r3, androidx.compose.runtime.CompositionContext r4, kotlin.jvm.functions.Function2 r5) {
        /*
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.ui.platform.GlobalSnapshotManager.f17777a
            r0.b()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0019
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x001c
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            goto L_0x001c
        L_0x0019:
            r3.removeAllViews()
        L_0x001c:
            if (r1 != 0) goto L_0x0034
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            kotlin.coroutines.CoroutineContext r2 = r4.j()
            r1.<init>(r0, r2)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f17955a
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0034:
            androidx.compose.runtime.Composition r3 = b(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Wrapper_androidKt.c(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.CompositionContext, kotlin.jvm.functions.Function2):androidx.compose.runtime.Composition");
    }
}
