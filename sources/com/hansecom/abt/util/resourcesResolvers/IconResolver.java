package com.hansecom.abt.util.resourcesResolvers;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

@Singleton
@Metadata
public final class IconResolver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f39084a;

    public IconResolver(Context context) {
        Intrinsics.i(context, "context");
        this.f39084a = context;
    }

    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        String J = StringsKt.J(str, '-', '_', false, 4, (Object) null);
        Resources resources = this.f39084a.getResources();
        int identifier = resources.getIdentifier("ic_" + J, "drawable", this.f39084a.getPackageName());
        if (identifier == 0) {
            Timber.Forest forest = Timber.f44337a;
            forest.b("Can't find icon for key " + str, new Object[0]);
        }
        return identifier;
    }
}
