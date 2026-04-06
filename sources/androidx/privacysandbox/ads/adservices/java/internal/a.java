package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlinx.coroutines.Deferred;

public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Deferred f22722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22723b;

    public /* synthetic */ a(Deferred deferred, Object obj) {
        this.f22722a = deferred;
        this.f22723b = obj;
    }

    public final Object a(CallbackToFutureAdapter.Completer completer) {
        return CoroutineAdapterKt.d(this.f22722a, this.f22723b, completer);
    }
}
