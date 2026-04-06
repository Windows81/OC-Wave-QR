package coil.request;

import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ImageRequest$Builder$listener$5 implements ImageRequest.Listener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function1 f23637c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f23638d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function2 f23639e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Function2 f23640f;

    public void a(ImageRequest imageRequest) {
        this.f23638d.invoke(imageRequest);
    }

    public void b(ImageRequest imageRequest, SuccessResult successResult) {
        this.f23640f.m(imageRequest, successResult);
    }

    public void c(ImageRequest imageRequest) {
        this.f23637c.invoke(imageRequest);
    }

    public void d(ImageRequest imageRequest, ErrorResult errorResult) {
        this.f23639e.m(imageRequest, errorResult);
    }
}
