package coil.request;

import android.view.View;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

@Metadata
public final class ViewTargetDisposable implements Disposable {

    /* renamed from: a  reason: collision with root package name */
    public final View f23683a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Deferred f23684b;

    public ViewTargetDisposable(View view, Deferred deferred) {
        this.f23683a = view;
        this.f23684b = deferred;
    }

    public void a(Deferred deferred) {
        this.f23684b = deferred;
    }
}
