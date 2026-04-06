package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$DialogHost$1$2$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22482A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f22483B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f22484z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2$1$1(SnapshotStateList snapshotStateList, NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator) {
        super(1);
        this.f22484z = snapshotStateList;
        this.f22482A = navBackStackEntry;
        this.f22483B = dialogNavigator;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f22484z.add(this.f22482A);
        return new DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1(this.f22483B, this.f22482A, this.f22484z);
    }
}
