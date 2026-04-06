package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface CoroutineContext {

    @Metadata
    public static final class DefaultImpls {
        public static CoroutineContext b(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            Intrinsics.i(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.f40721z ? coroutineContext : (CoroutineContext) coroutineContext2.k(coroutineContext, new b());
        }

        public static CoroutineContext c(CoroutineContext coroutineContext, Element element) {
            CombinedContext combinedContext;
            Intrinsics.i(coroutineContext, "acc");
            Intrinsics.i(element, "element");
            CoroutineContext g2 = coroutineContext.g(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f40721z;
            if (g2 == emptyCoroutineContext) {
                return element;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.f40717v;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) g2.d(key);
            if (continuationInterceptor == null) {
                combinedContext = new CombinedContext(g2, element);
            } else {
                CoroutineContext g3 = g2.g(key);
                if (g3 == emptyCoroutineContext) {
                    return new CombinedContext(element, continuationInterceptor);
                }
                combinedContext = new CombinedContext(new CombinedContext(g3, element), continuationInterceptor);
            }
            return combinedContext;
        }
    }

    @Metadata
    public interface Element extends CoroutineContext {

        @Metadata
        public static final class DefaultImpls {
            public static Object a(Element element, Object obj, Function2 function2) {
                Intrinsics.i(function2, "operation");
                return function2.m(obj, element);
            }

            public static Element b(Element element, Key key) {
                Intrinsics.i(key, "key");
                if (!Intrinsics.d(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.g(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext c(Element element, Key key) {
                Intrinsics.i(key, "key");
                return Intrinsics.d(element.getKey(), key) ? EmptyCoroutineContext.f40721z : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext coroutineContext) {
                Intrinsics.i(coroutineContext, "context");
                return DefaultImpls.b(element, coroutineContext);
            }
        }

        Element d(Key key);

        CoroutineContext g(Key key);

        Key getKey();

        Object k(Object obj, Function2 function2);
    }

    @Metadata
    public interface Key<E extends Element> {
    }

    Element d(Key key);

    CoroutineContext g(Key key);

    Object k(Object obj, Function2 function2);

    CoroutineContext y(CoroutineContext coroutineContext);
}
