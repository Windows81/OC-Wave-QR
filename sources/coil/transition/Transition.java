package coil.transition;

import coil.request.ImageResult;
import coil.transition.NoneTransition;
import kotlin.Metadata;

@Metadata
public interface Transition {

    @Metadata
    public interface Factory {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f23729a = Companion.f23731a;

        /* renamed from: b  reason: collision with root package name */
        public static final Factory f23730b = new NoneTransition.Factory();

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f23731a = new Companion();
        }

        Transition a(TransitionTarget transitionTarget, ImageResult imageResult);
    }

    void a();
}
