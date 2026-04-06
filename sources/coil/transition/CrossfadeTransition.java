package coil.transition;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.drawable.CrossfadeDrawable;
import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Scale;
import coil.transition.Transition;
import kotlin.Metadata;

@Metadata
public final class CrossfadeTransition implements Transition {

    /* renamed from: a  reason: collision with root package name */
    public final TransitionTarget f23721a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageResult f23722b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23723c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23724d;

    @Metadata
    public static final class Factory implements Transition.Factory {

        /* renamed from: c  reason: collision with root package name */
        public final int f23725c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f23726d;

        public Transition a(TransitionTarget transitionTarget, ImageResult imageResult) {
            return !(imageResult instanceof SuccessResult) ? Transition.Factory.f23730b.a(transitionTarget, imageResult) : ((SuccessResult) imageResult).c() == DataSource.MEMORY_CACHE ? Transition.Factory.f23730b.a(transitionTarget, imageResult) : new CrossfadeTransition(transitionTarget, imageResult, this.f23725c, this.f23726d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Factory) {
                Factory factory = (Factory) obj;
                return this.f23725c == factory.f23725c && this.f23726d == factory.f23726d;
            }
        }

        public int hashCode() {
            return (this.f23725c * 31) + Boolean.hashCode(this.f23726d);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i2, boolean z2) {
        this.f23721a = transitionTarget;
        this.f23722b = imageResult;
        this.f23723c = i2;
        this.f23724d = z2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public void a() {
        Drawable f2 = this.f23721a.f();
        Drawable a2 = this.f23722b.a();
        Scale J = this.f23722b.b().J();
        int i2 = this.f23723c;
        ImageResult imageResult = this.f23722b;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(f2, a2, J, i2, !(imageResult instanceof SuccessResult) || !((SuccessResult) imageResult).d(), this.f23724d);
        ImageResult imageResult2 = this.f23722b;
        if (imageResult2 instanceof SuccessResult) {
            this.f23721a.b(crossfadeDrawable);
        } else if (imageResult2 instanceof ErrorResult) {
            this.f23721a.d(crossfadeDrawable);
        }
    }

    public final int b() {
        return this.f23723c;
    }

    public final boolean c() {
        return this.f23724d;
    }
}
