package com.hansecom.abt;

import android.app.Application;
import android.content.Context;
import coil.Coil;
import coil.ImageLoader;
import com.google.firebase.FirebaseApp;
import com.lokalise.sdk.Lokalise;
import com.lokalise.sdk.LokaliseFallbackStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class BaseAbtApplication extends Application {
    public final void a() {
        Context applicationContext = getApplicationContext();
        Intrinsics.h(applicationContext, "getApplicationContext(...)");
        Coil.c(new ImageLoader.Builder(applicationContext).b());
    }

    public final void b() {
        String string = getString(R.string.a7);
        Intrinsics.h(string, "getString(...)");
        String string2 = getString(R.string.b7);
        Intrinsics.h(string2, "getString(...)");
        Lokalise.init$default(this, string, string2, (LokaliseFallbackStrategy) null, (List) null, (List) null, 56, (Object) null);
        Lokalise.updateTranslations();
    }

    public final void c() {
    }

    public void onCreate() {
        super.onCreate();
        c();
        a();
        b();
        FirebaseApp.q(this);
        RemoteConfigSetup.f33076c.b(this);
    }
}
