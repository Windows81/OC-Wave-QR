package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ContextMenuScope {

    /* renamed from: a  reason: collision with root package name */
    public final SnapshotStateList f3245a = SnapshotStateKt.f();

    public static /* synthetic */ void d(ContextMenuScope contextMenuScope, Function2 function2, Modifier modifier, boolean z2, Function3 function3, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.f15489d;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            function3 = null;
        }
        contextMenuScope.c(function2, modifier2, z3, function3, function0);
    }

    public final void a(ContextMenuColors contextMenuColors, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1320309496);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(contextMenuColors) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(this) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1320309496, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
            }
            SnapshotStateList snapshotStateList = this.f3245a;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Function3) snapshotStateList.get(i4)).d(contextMenuColors, q2, Integer.valueOf(i3 & 14));
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ContextMenuScope$Content$2(this, contextMenuColors, i2));
        }
    }

    public final void b() {
        this.f3245a.clear();
    }

    public final void c(Function2 function2, Modifier modifier, boolean z2, Function3 function3, Function0 function0) {
        this.f3245a.add(ComposableLambdaKt.c(262103052, true, new ContextMenuScope$item$1(function2, z2, modifier, function3, function0)));
    }
}
