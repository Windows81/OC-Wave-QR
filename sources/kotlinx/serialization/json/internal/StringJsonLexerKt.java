package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

@Metadata
public final class StringJsonLexerKt {
    public static final StringJsonLexer a(Json json, String str) {
        Intrinsics.i(json, "json");
        Intrinsics.i(str, "source");
        return !json.g().a() ? new StringJsonLexer(str) : new StringJsonLexerWithComments(str);
    }
}
