package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import l.a;

public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ AbtComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.a(Context.class), componentContainer.c(AnalyticsConnector.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.e(AbtComponent.class).g(LIBRARY_NAME).b(Dependency.j(Context.class)).b(Dependency.h(AnalyticsConnector.class)).e(new a()).c(), LibraryVersionComponent.b(LIBRARY_NAME, "21.1.1")});
    }
}
