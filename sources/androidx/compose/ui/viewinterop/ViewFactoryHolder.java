package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public final View f0;
    public final NestedScrollDispatcher g0;
    public final SaveableStateRegistry h0;
    public final int i0;
    public final String j0;
    public SaveableStateRegistry.Entry k0;
    public Function1 l0;
    public Function1 m0;
    public Function1 n0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : compositionContext, view, (i3 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i2, owner);
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.k0;
        if (entry2 != null) {
            entry2.a();
        }
        this.k0 = entry;
    }

    public final void I() {
        SaveableStateRegistry saveableStateRegistry = this.h0;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.f(this.j0, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    public final void J() {
        setSavableRegistryEntry((SaveableStateRegistry.Entry) null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.g0;
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.n0;
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.m0;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.l0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.n0 = function1;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.m0 = function1;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.l0 = function1;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    public ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        super(context, compositionContext, i2, nestedScrollDispatcher, view, owner);
        this.f0 = view;
        this.g0 = nestedScrollDispatcher;
        this.h0 = saveableStateRegistry;
        this.i0 = i2;
        setClipChildren(false);
        String valueOf = String.valueOf(i2);
        this.j0 = valueOf;
        SparseArray sparseArray = null;
        Object e2 = saveableStateRegistry != null ? saveableStateRegistry.e(valueOf) : null;
        sparseArray = e2 instanceof SparseArray ? (SparseArray) e2 : sparseArray;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        I();
        this.l0 = AndroidView_androidKt.e();
        this.m0 = AndroidView_androidKt.e();
        this.n0 = AndroidView_androidKt.e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        this(context, compositionContext, (View) function1.invoke(context), (NestedScrollDispatcher) null, saveableStateRegistry, i2, owner, 8, (DefaultConstructorMarker) null);
        Function1 function12 = function1;
    }
}
