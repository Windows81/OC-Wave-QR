package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;

@Metadata
public final class DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f22472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22473b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f22474c;

    public DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry, SnapshotStateList snapshotStateList) {
        this.f22472a = dialogNavigator;
        this.f22473b = navBackStackEntry;
        this.f22474c = snapshotStateList;
    }

    public void d() {
        this.f22472a.p(this.f22473b);
        this.f22474c.remove((Object) this.f22473b);
    }
}
