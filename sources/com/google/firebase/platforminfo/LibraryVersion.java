package com.google.firebase.platforminfo;

abstract class LibraryVersion {
    public static LibraryVersion a(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String b();

    public abstract String c();
}
