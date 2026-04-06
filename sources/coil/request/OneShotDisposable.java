package coil.request;

import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

@Metadata
public final class OneShotDisposable implements Disposable {

    /* renamed from: a  reason: collision with root package name */
    public final Deferred f23648a;

    public OneShotDisposable(Deferred deferred) {
        this.f23648a = deferred;
    }
}
