package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

public interface ComponentContainer {
    Object a(Class cls) {
        return f(Qualified.b(cls));
    }

    Provider b(Qualified qualified);

    Provider c(Class cls) {
        return b(Qualified.b(cls));
    }

    Set d(Qualified qualified) {
        return (Set) e(qualified).get();
    }

    Provider e(Qualified qualified);

    Object f(Qualified qualified) {
        Provider b2 = b(qualified);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    Set g(Class cls) {
        return d(Qualified.b(cls));
    }

    Deferred h(Qualified qualified);

    Deferred i(Class cls) {
        return h(Qualified.b(cls));
    }
}
