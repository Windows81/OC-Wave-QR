package coil.transition;

import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.transition.Transition;
import kotlin.Metadata;

@Metadata
public final class NoneTransition implements Transition {

    /* renamed from: a  reason: collision with root package name */
    public final TransitionTarget f23727a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageResult f23728b;

    @Metadata
    public static final class Factory implements Transition.Factory {
        public Transition a(TransitionTarget transitionTarget, ImageResult imageResult) {
            return new NoneTransition(transitionTarget, imageResult);
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public NoneTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this.f23727a = transitionTarget;
        this.f23728b = imageResult;
    }

    public void a() {
        ImageResult imageResult = this.f23728b;
        if (imageResult instanceof SuccessResult) {
            this.f23727a.b(((SuccessResult) imageResult).a());
        } else if (imageResult instanceof ErrorResult) {
            this.f23727a.d(imageResult.a());
        }
    }
}
