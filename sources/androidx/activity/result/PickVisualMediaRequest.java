package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.Metadata;

@Metadata
public final class PickVisualMediaRequest {

    /* renamed from: a  reason: collision with root package name */
    public ActivityResultContracts.PickVisualMedia.VisualMediaType f250a;

    /* renamed from: b  reason: collision with root package name */
    public int f251b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f252c;

    /* renamed from: d  reason: collision with root package name */
    public ActivityResultContracts.PickVisualMedia.DefaultTab f253d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f254e;

    /* renamed from: f  reason: collision with root package name */
    public long f255f;

    @Metadata
    public static final class Builder {
    }

    public final long a() {
        return this.f255f;
    }

    public final ActivityResultContracts.PickVisualMedia.DefaultTab b() {
        return this.f253d;
    }

    public final int c() {
        return this.f251b;
    }

    public final ActivityResultContracts.PickVisualMedia.VisualMediaType d() {
        return this.f250a;
    }

    public final boolean e() {
        return this.f254e;
    }

    public final boolean f() {
        return this.f252c;
    }
}
