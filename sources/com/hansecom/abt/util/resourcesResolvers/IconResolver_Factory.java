package com.hansecom.abt.util.resourcesResolvers;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class IconResolver_Factory implements Factory<IconResolver> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39086a;

    public static IconResolver b(Context context) {
        return new IconResolver(context);
    }

    /* renamed from: a */
    public IconResolver get() {
        return b((Context) this.f39086a.get());
    }
}
