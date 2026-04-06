package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1$1 extends Lambda implements Function0<LayoutNode> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f19240A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CompositionContext f19241B;
    public final /* synthetic */ SaveableStateRegistry C;
    public final /* synthetic */ int D;
    public final /* synthetic */ View E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f19242z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1$1(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, View view) {
        super(0);
        this.f19242z = context;
        this.f19240A = function1;
        this.f19241B = compositionContext;
        this.C = saveableStateRegistry;
        this.D = i2;
        this.E = view;
    }

    /* renamed from: b */
    public final LayoutNode invoke() {
        Context context = this.f19242z;
        Function1 function1 = this.f19240A;
        CompositionContext compositionContext = this.f19241B;
        SaveableStateRegistry saveableStateRegistry = this.C;
        int i2 = this.D;
        View view = this.E;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(context, function1, compositionContext, saveableStateRegistry, i2, (Owner) view).getLayoutNode();
    }
}
