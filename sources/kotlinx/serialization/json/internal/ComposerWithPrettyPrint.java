package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

@Metadata
public final class ComposerWithPrettyPrint extends Composer {

    /* renamed from: c  reason: collision with root package name */
    public final Json f42375c;

    /* renamed from: d  reason: collision with root package name */
    public int f42376d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerWithPrettyPrint(InternalJsonWriter internalJsonWriter, Json json) {
        super(internalJsonWriter);
        Intrinsics.i(internalJsonWriter, "writer");
        Intrinsics.i(json, "json");
        this.f42375c = json;
    }

    public void b() {
        o(true);
        this.f42376d++;
    }

    public void c() {
        o(false);
        k("\n");
        int i2 = this.f42376d;
        for (int i3 = 0; i3 < i2; i3++) {
            k(this.f42375c.g().n());
        }
    }

    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    public void p() {
        f(' ');
    }

    public void q() {
        this.f42376d--;
    }
}
