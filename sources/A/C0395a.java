package A;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* renamed from: A.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0395a implements EventListener.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventListener f34148a;

    public /* synthetic */ C0395a(EventListener eventListener) {
        this.f34148a = eventListener;
    }

    public final EventListener a(Call call) {
        return Util.h(this.f34148a, call);
    }
}
