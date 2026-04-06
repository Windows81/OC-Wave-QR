package coil.decode;

import coil.decode.ImageSource;
import kotlin.Metadata;

@Metadata
public final class ResourceMetadata extends ImageSource.Metadata {

    /* renamed from: a  reason: collision with root package name */
    public final String f23386a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23387b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23388c;

    public ResourceMetadata(String str, int i2, int i3) {
        this.f23386a = str;
        this.f23387b = i2;
        this.f23388c = i3;
    }

    public final int a() {
        return this.f23388c;
    }
}
