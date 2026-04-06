package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;
import q.a;

public class ComponentMonitor implements ComponentRegistrarProcessor {
    public static /* synthetic */ Object c(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.b(str);
            return component.h().a(componentContainer);
        } finally {
            FirebaseTrace.a();
        }
    }

    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component component : componentRegistrar.getComponents()) {
            String i2 = component.i();
            if (i2 != null) {
                component = component.t(new a(i2, component));
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
