package kotlin.jvm.internal;

import kotlin.Metadata;

@Metadata
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* renamed from: A  reason: collision with root package name */
    public final String f40899A;

    /* renamed from: z  reason: collision with root package name */
    public final Class f40900z;

    public PackageReference(Class cls, String str) {
        Intrinsics.i(cls, "jClass");
        Intrinsics.i(str, "moduleName");
        this.f40900z = cls;
        this.f40899A = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PackageReference) && Intrinsics.d(i(), ((PackageReference) obj).i());
    }

    public int hashCode() {
        return i().hashCode();
    }

    public Class i() {
        return this.f40900z;
    }

    public String toString() {
        return i() + " (Kotlin reflection is not available)";
    }
}
