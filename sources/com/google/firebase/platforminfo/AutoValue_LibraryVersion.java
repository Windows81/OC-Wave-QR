package com.google.firebase.platforminfo;

final class AutoValue_LibraryVersion extends LibraryVersion {

    /* renamed from: a  reason: collision with root package name */
    public final String f31185a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31186b;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str != null) {
            this.f31185a = str;
            if (str2 != null) {
                this.f31186b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f31185a;
    }

    public String c() {
        return this.f31186b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f31185a.equals(libraryVersion.b()) && this.f31186b.equals(libraryVersion.c());
    }

    public int hashCode() {
        return ((this.f31185a.hashCode() ^ 1000003) * 1000003) ^ this.f31186b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f31185a + ", version=" + this.f31186b + "}";
    }
}
