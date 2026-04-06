package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public class ListenerHolders {

    /* renamed from: a  reason: collision with root package name */
    public final Set f24507a;

    public static ListenerHolder.ListenerKey a(Object obj, String str) {
        Preconditions.n(obj, "Listener must not be null");
        Preconditions.n(str, "Listener type must not be null");
        Preconditions.h(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey(obj, str);
    }

    public final void b() {
        for (ListenerHolder a2 : this.f24507a) {
            a2.a();
        }
        this.f24507a.clear();
    }
}
