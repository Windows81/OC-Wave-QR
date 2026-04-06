package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

@Metadata
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f21991A;

    /* renamed from: B  reason: collision with root package name */
    public final Function0 f21992B;
    public final Function0 C;
    public ViewModel D;

    /* renamed from: z  reason: collision with root package name */
    public final KClass f21993z;

    /* renamed from: a */
    public ViewModel getValue() {
        ViewModel viewModel = this.D;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModel c2 = ViewModelProvider.f21994b.a((ViewModelStore) this.f21991A.invoke(), (ViewModelProvider.Factory) this.f21992B.invoke(), (CreationExtras) this.C.invoke()).c(this.f21993z);
        this.D = c2;
        return c2;
    }

    public boolean b() {
        return this.D != null;
    }
}
