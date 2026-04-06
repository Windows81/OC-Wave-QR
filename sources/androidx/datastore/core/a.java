package androidx.datastore.core;

import androidx.datastore.core.MulticastFileObserver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;

public final /* synthetic */ class a implements DisposableHandle {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f20647A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f20648z;

    public /* synthetic */ a(String str, Function1 function1) {
        this.f20648z = str;
        this.f20647A = function1;
    }

    public final void d() {
        MulticastFileObserver.Companion.f(this.f20648z, this.f20647A);
    }
}
