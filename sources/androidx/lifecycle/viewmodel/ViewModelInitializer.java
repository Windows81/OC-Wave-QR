package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

@Metadata
public final class ViewModelInitializer<T extends ViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final KClass f22067a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f22068b;

    public final KClass a() {
        return this.f22067a;
    }

    public final Function1 b() {
        return this.f22068b;
    }
}
