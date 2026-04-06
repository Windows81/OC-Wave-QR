package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.hilt.android.internal.Contexts;

@Module
public final class ApplicationContextModule {

    /* renamed from: a  reason: collision with root package name */
    public final Context f39756a;

    public ApplicationContextModule(Context context) {
        this.f39756a = context;
    }

    public Application a() {
        return Contexts.a(this.f39756a);
    }

    public Context b() {
        return this.f39756a;
    }
}
