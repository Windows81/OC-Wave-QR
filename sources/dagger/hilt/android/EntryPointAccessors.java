package dagger.hilt.android;

import android.content.Context;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EntryPointAccessors {

    /* renamed from: a  reason: collision with root package name */
    public static final EntryPointAccessors f39710a = new EntryPointAccessors();

    public static final Object a(Context context, Class cls) {
        Intrinsics.i(context, "context");
        Intrinsics.i(cls, "entryPoint");
        return EntryPoints.a(Contexts.a(context.getApplicationContext()), cls);
    }
}
