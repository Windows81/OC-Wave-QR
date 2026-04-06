package kotlinx.serialization.json.internal;

import kotlin.Metadata;

@Metadata
@JsonFriendModuleApi
public interface InternalJsonWriter {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42379a = new Companion();
    }

    void a(char c2);

    void b(String str);

    void c(String str);

    void writeLong(long j2);
}
