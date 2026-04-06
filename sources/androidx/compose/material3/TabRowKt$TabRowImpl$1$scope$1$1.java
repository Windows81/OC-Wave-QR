package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class TabRowKt$TabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f11329a = SnapshotStateKt__SnapshotStateKt.e(CollectionsKt.m(), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f11330b;

    public TabRowKt$TabRowImpl$1$scope$1$1(FiniteAnimationSpec finiteAnimationSpec) {
        this.f11330b = finiteAnimationSpec;
    }

    public Modifier a(Modifier modifier, int i2, boolean z2) {
        return modifier.o0(new TabIndicatorModifier(this.f11329a, i2, z2, this.f11330b));
    }

    public void b(List list) {
        this.f11329a.setValue(list);
    }
}
