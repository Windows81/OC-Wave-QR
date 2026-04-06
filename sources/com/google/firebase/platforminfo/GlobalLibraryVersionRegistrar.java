package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GlobalLibraryVersionRegistrar {

    /* renamed from: b  reason: collision with root package name */
    public static volatile GlobalLibraryVersionRegistrar f31189b;

    /* renamed from: a  reason: collision with root package name */
    public final Set f31190a = new HashSet();

    public static GlobalLibraryVersionRegistrar a() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = f31189b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = f31189b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        f31189b = globalLibraryVersionRegistrar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f31190a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f31190a);
        }
        return unmodifiableSet;
    }
}
