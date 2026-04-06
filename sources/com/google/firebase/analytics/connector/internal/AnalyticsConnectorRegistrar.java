package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.e(AnalyticsConnector.class).b(Dependency.j(FirebaseApp.class)).b(Dependency.j(Context.class)).b(Dependency.j(Subscriber.class)).e(new zzb()).d().c(), LibraryVersionComponent.b("fire-analytics", "22.1.0")});
    }
}
