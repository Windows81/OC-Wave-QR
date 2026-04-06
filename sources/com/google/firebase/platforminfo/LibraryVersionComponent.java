package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;

public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        String a(Object obj);
    }

    public static Component b(String str, String str2) {
        return Component.l(LibraryVersion.a(str, str2), LibraryVersion.class);
    }

    public static Component c(String str, VersionExtractor versionExtractor) {
        return Component.m(LibraryVersion.class).b(Dependency.j(Context.class)).e(new b(str, versionExtractor)).c();
    }
}
