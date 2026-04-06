package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import n.a;
import n.b;
import n.c;

public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<Component<?>> getComponents() {
        Class<TransportFactory> cls = TransportFactory.class;
        Class<Context> cls2 = Context.class;
        return Arrays.asList(new Component[]{Component.e(cls).g(LIBRARY_NAME).b(Dependency.j(cls2)).e(new a()).c(), Component.c(Qualified.a(LegacyTransportBackend.class, cls)).b(Dependency.j(cls2)).e(new b()).c(), Component.c(Qualified.a(TransportBackend.class, cls)).b(Dependency.j(cls2)).e(new c()).c(), LibraryVersionComponent.b(LIBRARY_NAME, "19.0.0")});
    }
}
