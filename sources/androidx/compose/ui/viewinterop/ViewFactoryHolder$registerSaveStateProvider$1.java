package androidx.compose.ui.viewinterop;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewFactoryHolder$registerSaveStateProvider$1 extends Lambda implements Function0<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f19253z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f19253z = viewFactoryHolder;
    }

    public final Object invoke() {
        SparseArray sparseArray = new SparseArray();
        this.f19253z.f0.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
