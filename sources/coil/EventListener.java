package coil;

import android.graphics.Bitmap;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import kotlin.Metadata;

@Metadata
public interface EventListener extends ImageRequest.Listener {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f23236a = Companion.f23238a;

    /* renamed from: b  reason: collision with root package name */
    public static final EventListener f23237b = new EventListener$Companion$NONE$1();

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f23238a = new Companion();
    }

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public interface Factory {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f23239a = Companion.f23241a;

        /* renamed from: b  reason: collision with root package name */
        public static final Factory f23240b = new a();

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f23241a = new Companion();
        }

        static EventListener c(ImageRequest imageRequest) {
            return EventListener.f23237b;
        }

        EventListener a(ImageRequest imageRequest);
    }

    void a(ImageRequest imageRequest) {
    }

    void b(ImageRequest imageRequest, SuccessResult successResult) {
    }

    void c(ImageRequest imageRequest) {
    }

    void d(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    void e(ImageRequest imageRequest, String str) {
    }

    void f(ImageRequest imageRequest, Transition transition) {
    }

    void g(ImageRequest imageRequest, Bitmap bitmap) {
    }

    void h(ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
    }

    void i(ImageRequest imageRequest, Object obj) {
    }

    void j(ImageRequest imageRequest, Decoder decoder, Options options) {
    }

    void k(ImageRequest imageRequest, Fetcher fetcher, Options options) {
    }

    void l(ImageRequest imageRequest, Transition transition) {
    }

    void m(ImageRequest imageRequest, Object obj) {
    }

    void n(ImageRequest imageRequest) {
    }

    void o(ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
    }

    void p(ImageRequest imageRequest, Bitmap bitmap) {
    }

    void q(ImageRequest imageRequest, Size size) {
    }

    void r(ImageRequest imageRequest, Object obj) {
    }
}
