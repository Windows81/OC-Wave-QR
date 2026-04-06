package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a  reason: collision with root package name */
    public final String f31187a;

    /* renamed from: b  reason: collision with root package name */
    public final GlobalLibraryVersionRegistrar f31188b;

    public DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f31187a = e(set);
        this.f31188b = globalLibraryVersionRegistrar;
    }

    public static Component c() {
        return Component.e(UserAgentPublisher.class).b(Dependency.m(LibraryVersion.class)).e(new a()).c();
    }

    public static /* synthetic */ UserAgentPublisher d(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.g(LibraryVersion.class), GlobalLibraryVersionRegistrar.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            sb.append(libraryVersion.b());
            sb.append('/');
            sb.append(libraryVersion.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.f31188b.b().isEmpty()) {
            return this.f31187a;
        }
        return this.f31187a + ' ' + e(this.f31188b.b());
    }
}
