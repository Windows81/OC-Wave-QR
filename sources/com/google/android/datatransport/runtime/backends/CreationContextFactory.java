package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

class CreationContextFactory {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24092a;

    /* renamed from: b  reason: collision with root package name */
    public final Clock f24093b;

    /* renamed from: c  reason: collision with root package name */
    public final Clock f24094c;

    public CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.f24092a = context;
        this.f24093b = clock;
        this.f24094c = clock2;
    }

    public CreationContext a(String str) {
        return CreationContext.a(this.f24092a, this.f24093b, this.f24094c, str);
    }
}
