package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposerForUnquotedLiterals extends Composer {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42373c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerForUnquotedLiterals(InternalJsonWriter internalJsonWriter, boolean z2) {
        super(internalJsonWriter);
        Intrinsics.i(internalJsonWriter, "writer");
        this.f42373c = z2;
    }

    public void n(String str) {
        Intrinsics.i(str, "value");
        if (this.f42373c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
