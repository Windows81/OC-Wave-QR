package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
public final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ State E;
    public final /* synthetic */ DialogNavigator F;
    public final /* synthetic */ SnapshotStateList G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$2$1(State state, DialogNavigator dialogNavigator, SnapshotStateList snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.E = state;
        this.F = dialogNavigator;
        this.G = snapshotStateList;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DialogHostKt$DialogHost$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DialogHostKt$DialogHost$2$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            DialogNavigator dialogNavigator = this.F;
            SnapshotStateList snapshotStateList = this.G;
            for (NavBackStackEntry navBackStackEntry : DialogHostKt.c(this.E)) {
                if (!((List) dialogNavigator.n().getValue()).contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                    dialogNavigator.p(navBackStackEntry);
                }
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
